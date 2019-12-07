package com.xiaoyuan.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaoyuan.controller.common.BaseController;
import com.xiaoyuan.model.Students;
import com.xiaoyuan.service.impl.StudentsServiceImpl;
import com.xiaoyuan.tools.MessageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
public class StudentsController extends BaseController{
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
        studentsService.save(record);
    }

    @RequestMapping(value = "/deleteByPriamryKey", method = RequestMethod.POST)
    @ApiOperation(value = "删除学生信息", notes = "删除学生")
    public void deleteByPrimaryKey(Integer studentId){
        studentsService.deleteByPrimaryKey(studentId);
    }

    @RequestMapping(value = "/updateByPriamryKey", method = RequestMethod.POST)
    @ApiOperation(value = "修改学生", notes = "修改学生")
    public void updateByPriamryKey(Integer studentId){
        studentsService.deleteByPrimaryKey(studentId);
    }

    @RequestMapping(value = "/changeStudentsSchool", method = RequestMethod.POST)
    @ApiOperation(value = "学生转校", notes = "学生转校")
    public void changeStudentsSchool(@RequestParam(value = "schoolname") Students schoolname){
        studentsService.changeStudentsSchool(schoolname);
    }

    @RequestMapping(value = "/changeStudentsClass", method = RequestMethod.POST)
    @ApiOperation(value = "学生转班", notes = "学生转班")
    public void changeStudensClass(@RequestParam(value="classname") Students classname){
        studentsService.changeStudentsClass(classname);
    }

    @RequestMapping(value = "/frozeStudents", method = RequestMethod.POST)
    @ApiOperation(value = "冻结学生", notes = "冻结学生")
    public void frozeStudents(@RequestParam(value = "status") Students status){
        studentsService.frozeStudent(status);
    }

    @RequestMapping(value = "/failStudent", method = RequestMethod.POST)
    @ApiOperation(value = "学生留级", notes = "学生留级")
    public void failStudent(@RequestParam(value = "grade") Students grade){
        studentsService.failStudent(grade);
    }


} 
