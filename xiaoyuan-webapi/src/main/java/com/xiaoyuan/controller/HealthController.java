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
import sun.plugin2.message.Message;

/**
 * <p>
 *  健康控制器
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
@Api(value = "/Students", description = "健康管理控制层")
@RestController
@RequestMapping("/mapper/students")
public class HealthController extends BaseController{
    @Autowired
    StudentsServiceImpl studentsService;

    @RequestMapping(value = "/selectStudentsHealth", method = RequestMethod.GET)
    @ApiOperation(value = "查询所有健康信息", notes = "")
    public MessageBean selectStudentsHealth(){
        return resultSuccess(selectStudentsHealth());
    }

    @RequestMapping(value = "/selectStudentHealthByStudentID", method = RequestMethod.GET)
    @ApiOperation(value = "查询学生健康信息", notes = "根据主键查询学生能健康信息")
    public MessageBean selectStudentHealthByStudentID(Integer studentID){
        return resultSuccess(selectStudentHealthByStudentID(studentID));
    }

    @RequestMapping(value = "/addStudnetHealth", method = RequestMethod.POST)
    @ApiOperation(value = "新增学生健康信息")
    public MessageBean addStudnetHealth(Students record){
        return resultSuccess(addStudnetHealth(record));
    }

    @RequestMapping(value = "/updateStudentHealth", method = RequestMethod.POST)
    @ApiOperation(value = "修改学生信息", notes = "根据主键修改学生健康信息")
    public MessageBean updateStudentHealth(Integer studentID){
        return resultSuccess(updateStudentHealth(studentID));
    }

    @RequestMapping(value = "/deleteStudentHealth", method = RequestMethod.POST)
    @ApiOperation(value = "删除学生健康信息", notes = "根据主键删除学生健康息")
    public MessageBean deleteStudentHealth(Integer studentID){
        return resultSuccess(deleteStudentHealth(studentID));
    }
}
