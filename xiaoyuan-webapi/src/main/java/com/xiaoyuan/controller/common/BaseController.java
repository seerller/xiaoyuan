package com.xiaoyuan.controller.common;

import com.alibaba.fastjson.JSON;
import com.xiaoyuan.model.UserInfo;
import com.xiaoyuan.tools.LogicException;
import com.xiaoyuan.tools.MessageBean;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 基础控制层
 */
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class BaseController {
    /**
     * 成功的状态码
     */
    public final int SUC = 10001;

    /**
     * 失败的状态码
     */
    public final int FAL = 10000;
    public final static String ADMIN = "admin";

    /**
     * 统一拦截捕获异常 Exception.class
     * @param exc
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public MessageBean myErrorHandler(Exception exc) {
        //判断是否是属于自定义异常
        if(exc instanceof LogicException){
            LogicException ex =(LogicException) exc;
            return new MessageBean(Integer.parseInt(ex.getCode()),ex.getMsg(),JSON.parse(ex.getData()));
        }else if(exc instanceof UnauthorizedException){
            UnauthorizedException ex =(UnauthorizedException) exc;
            //获取权限值
            String paramsVal = ex.getMessage();
            paramsVal = paramsVal.substring(paramsVal.indexOf("[")+1,paramsVal.indexOf("]"));
            String msg = "您无[%s]权限，因此终止操作.".replace("%s",paramsVal);
            return new MessageBean(FAL,msg,null);
        }
        exc.printStackTrace();
        return resultFailed();
    }
    /**
     * 通用错误返回函数
     * @return 通用返回信息对象
     */
    public MessageBean resultFailed(String FailedMsg){
        if(StringUtils.isBlank(FailedMsg)){
            FailedMsg = "操作失败,请稍后重试.";
        }
        return new MessageBean(FAL,FailedMsg,"");
    }
    /**
     * 通用错误返回函数
     * @return 通用返回信息对象
     */
    public MessageBean resultFailed(String FailedMsg,Object data){
        return new MessageBean(FAL,FailedMsg,data);
    }
    /**
     * 通用错误返回函数
     * @return
     */
    public MessageBean resultFailed(){
        return new MessageBean(FAL,"操作失败.请稍后重试.","");
    }
    /**
     * 通用成功返回函数
     * @return 通用返回信息对象
     */
    public MessageBean resultSuccess(String SuccessMsg){
        return new MessageBean(SUC,SuccessMsg,"");
    }
    /**
     * 通用成功返回函数
     * @return 通用返回信息对象
     */
    public MessageBean resultSuccess(){
        return resultSuccess("操作成功");
    }
    /**
     * 通用成功返回函数
     * @return 通用返回信息对象
     */
    public MessageBean resultSuccess(String SuccessMsg,Object object){
        return new MessageBean(SUC,SuccessMsg,object);
    }
    /**
     * 通用成功返回函数
     * @return 通用返回信息对象
     */
    public MessageBean resultSuccess(Object object){
        return new MessageBean(SUC,"操作成功",object);
    }


    /**
     * 传入键名,获取存在session的数据。
     * @param key
     * @return
     */
    public Object resultSessionValue(String key){
        return SecurityUtils.getSubject().getSession().getAttribute(key);
    }
    /**
     * 传入键名与键值,则可存入当前的session会话管理器中
     * @param key
     * @return
     */
    public void setSessionValue(String key,Object val){
        SecurityUtils.getSubject().getSession().setAttribute(key,val);
    }

    /**
     * 返回当前存入session会话管理器中的用户
     * @return
     */
    //public UserInfo resultUser(){
        //return (username) resultSessionValue( "user");
    //}
}
