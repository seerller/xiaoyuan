package com.xiaoyuan.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaoyuan.model.Class;
import com.xiaoyuan.service.impl.ClassServiceImpl;
import com.xiaoyuan.tools.MessageBean;
import com.xiaoyuan.controller.common.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.collections.CollectionUtils;

/**
 * <p>
 *  班级管理控制器
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
@RestController
@RequestMapping("/mapper/class")
@Api(value = "/Class", description = "班级管理模块")
public class ClassController extends BaseController{
    @Autowired
    ClassServiceImpl classService;

    @RequestMapping(value = "/selectClass", method = RequestMethod.GET)
    @ApiOperation(value = "查询班级信息", notes = "显示所有班级")
    public MessageBean selectClass(){
        return selectClass();
    }

    @RequestMapping(value = "/addClass", method = RequestMethod.POST)
    @ApiOperation(value = "新增班级", notes = "根据主键新增班级")
    public MessageBean addClass(Class record){
        return resultSuccess(classService.save(record));
    }

    @RequestMapping(value = "/updateClass", method = RequestMethod.POST)
    @ApiOperation(value = "修改班级", notes = "根据主键修改班级")
    public MessageBean updateClass(Class record){
        return resultSuccess(classService.updateById(record));
    }

    @RequestMapping(value = "/changeStatus", method = RequestMethod.POST)
    @ApiOperation(value = "更爱班级状态", notes = "上课")
    public void classBegin(String status){
        classService.changeStatus("上课");
    }

    @RequestMapping(value = "/changeStatus", method = RequestMethod.POST)
    @ApiOperation(value = "更爱班级状态", notes = "下课")
    public void classOver(String status){
        classService.changeStatus("下课");
    }

    @RequestMapping(value = "/changeStatus", method = RequestMethod.POST)
    @ApiOperation(value = "更爱班级状态", notes = "放学")
    public void afterSchool(String status){
        classService.changeStatus("放学");
    }

}
