package com.xiaoyuan.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaoyuan.controller.common.BaseController;
import com.xiaoyuan.model.Students;
import com.xiaoyuan.service.impl.StudentsServiceImpl;
import com.xiaoyuan.tools.MessageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
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
@Api(value = "/Students", description = "学生管理控制层")
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
    @ApiImplicitParams(
            {@ApiImplicitParam(value = "主键id",name = "studentId",dataType = "Integer",paramType ="query",required = true),
                    @ApiImplicitParam(value = "学校名称",name = "schoolname",dataType = "Integer",paramType ="query",required = false)})
    public MessageBean changeStudentsSchool(Students schoolname){
        return resultSuccess(changeStudentsSchool(schoolname));
    }

    @RequestMapping(value = "/changeStudentsClass", method = RequestMethod.POST)
    @ApiOperation(value = "学生转班", notes = "学生转班")
    public MessageBean changeStudensClass(Students classname){
       return resultSuccess(studentsService.changeStudentsClass(classname));
    }

    @RequestMapping(value = "/frozeStudents", method = RequestMethod.POST)
    @ApiOperation(value = "冻结学生", notes = "冻结学生")
    public MessageBean frozeStudents(String status){

        return resultSuccess(studentsService.frozeStudent("冻结"));
    }

    @RequestMapping(value = "/failStudent", method = RequestMethod.POST)
    @ApiOperation(value = "学生留级", notes = "学生留级")
    public void failStudent(@RequestParam(value = "留级") Students grade){
        studentsService.failStudent(grade);
    }


} 
