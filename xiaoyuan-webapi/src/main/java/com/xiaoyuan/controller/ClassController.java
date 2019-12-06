package com.xiaoyuan.controller;


import com.xiaoyuan.service.impl.ClassServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
public class ClassController {
    @Autowired
    ClassServiceImpl classService;

}
