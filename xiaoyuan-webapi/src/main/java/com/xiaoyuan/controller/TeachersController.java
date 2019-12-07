package com.xiaoyuan.controller;


import com.xiaoyuan.controller.common.BaseController;
import com.xiaoyuan.model.Teachers;
import com.xiaoyuan.service.impl.TeachersServiceImpl;
//import com.xiaoyuan.controller.common.BaseController;
import com.xiaoyuan.tools.MessageBean;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  教师控制层
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
@Api(value = "/Teachers", description = "教师管理模块")
@RestController
@RequestMapping("/mapper/teachers")
public class TeachersController extends BaseController {
    @Autowired
    TeachersServiceImpl teachersService;

    @Test
    @RequestMapping(value = "/List<Teachers>", method = RequestMethod.GET)
    @ApiOperation(value = "查询教师所有信息", notes = "教师信息")
    public MessageBean getTeacherList(){
        //try{
            return getTeacherList();
        //}catch(Exception e){
        //    System.out.println("操作失败，请重试");
        //}
    }

    @RequestMapping(value = "/addTeachers", method = RequestMethod.POST)
    @ApiOperation(value ="新增教师", notes = "新增教师")
    public void addTeachers(Teachers teachers){
        try{
            teachersService.addTeachers(teachers);
        }catch(Exception e){
            System.out.println("信息错误，请重新输入");
        }
    }

    @RequestMapping(value = "/updateTeachers", method = RequestMethod.POST)
    @ApiOperation(value ="修改教师", notes = "新增教师")
    public void updateTeachers(Teachers teachers){
        teachersService.updateTeachers(teachers);
    }

    @RequestMapping(value = "/deleteTachers", method = RequestMethod.POST)
    @ApiOperation(value = "删除教师", notes = "删除教师")
    public void deleteTReachers(Teachers teachers){
        teachersService.deleteTeachers(teachers);
    }
    @RequestMapping(value = "/setTeachersstatus", method = RequestMethod.POST)
    @ApiOperation(value = "冻结教师", notes = "冻结教师")
    public void setTeachersstatus(Teachers teachers) {
        teachersService.setTeachersstatus(teachers);
    }
}
