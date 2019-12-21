package com.xiaoyuan.controller;
import com.xiaoyuan.controller.common.BaseController;
import com.xiaoyuan.model.Attence;
import com.xiaoyuan.service.impl.AttenceServiceImpl;
import com.xiaoyuan.tools.MessageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mapper/attence")
@Api(value = "/Attence", description = "考勤控制层")
public class AttenceController extends BaseController{
    @Autowired
    AttenceServiceImpl attenceService;

    @RequestMapping(value = "/selectClassname", method = RequestMethod.GET)
    @ApiOperation(value = "查询班级", notes = "根据学校id显示班级")
    public MessageBean selectClassName(@RequestParam(value = "schoolID")Integer schoolID){
        return resultSuccess(selectClassName(schoolID));
    }

    @RequestMapping(value = "/selectStudentname", method = RequestMethod.GET)
    @ApiOperation(value = "查询学生", notes = "根据班级id显示学生")
    public MessageBean selectStudentname(@RequestParam(value = "classId") Integer classId){
        return resultSuccess(selectStudentname(classId));
    }


    @RequestMapping(value = "/selectAttenceCount", method = RequestMethod.GET)
    @ApiOperation(value = "考勤统计", notes = "根据学生id统计考勤情况")
    public MessageBean selectAttenceCount(@RequestParam(value = "studentID")Integer studentID){
        return resultSuccess(selectAttenceCount(studentID));
    }


    @RequestMapping(value = "/selectselectAttence", method = RequestMethod.GET)
    @ApiOperation(value = "查询考勤详情", notes = "根据学生id查询考勤情况")
    public MessageBean selectselectAttence(@RequestParam(value = "studentID") Integer studentID){
        return resultSuccess(selectselectAttence(studentID));
    }
}
