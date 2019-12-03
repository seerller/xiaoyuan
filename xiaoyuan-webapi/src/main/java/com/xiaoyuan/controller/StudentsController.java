package com.xiaoyuan.controller;


import com.xiaoyuan.service.impl.StudentsServiceImpl;
import com.xiaoyuan.tools.MessageBean;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  学生控制器
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
@Api(value = "/Students", description = "学僧管理模块")
@RestController
@RequestMapping("/mapper/students")
public class StudentsController {
    @Autowired
    StudentsServiceImpl.studentsService;

    public MessageBean selectStudents(){
        return selectStudents();
    }

}
