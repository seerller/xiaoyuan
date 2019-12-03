package com.xiaoyuan.controller;


import com.xiaoyuan.model.Students;
import com.xiaoyuan.service.impl.StudentsServiceImpl;
import com.xiaoyuan.tools.MessageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  学生控制器
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
@Api(value = "/Students", description = "学生管理模块")
@RestController
@RequestMapping("/mapper/students")
public class StudentsController {
    @Autowired
    StudentsServiceImpl studentsService;

    @RequestMapping(value = "/selectStudents", method = RequestMethod.GET)
    @ApiOperation(value = "查询所有学生", notes = "查询所有学生")
    public MessageBean selectStudents(){
        return selectStudents();
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation(value = "新增学生", notes = "新增学生")
    public void insert(Students record){
        studentsService.insert(record);
    }

    @RequestMapping(value = "/deleteByPriamryKey", method = RequestMethod.POST)
    @ApiOperation(value = "删除学生信息", notes = "删除学生")
    public void deleteByPrimaryKey(Integer studentId){
        studentsService.deleteByPrimaryKey(studentId);
    }

    @RequestMapping(value = "/updateByPriamryKey", method = RequestMethod.POST)
    @ApiOperation(value = "修改学生信息", notes = "修改学生信息")
    public void updateByPriamryKey(Integer studentId){
        studentsService.deleteByPrimaryKey(studentId);
    }

    public void


} 
