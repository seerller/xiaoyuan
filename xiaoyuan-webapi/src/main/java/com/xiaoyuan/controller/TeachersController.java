package com.xiaoyuan.controller;


import com.xiaoyuan.model.Teachers;
import com.xiaoyuan.service.impl.TeachersServiceImpl;
import com.xiaoyuan.tools.MessageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
@RestController
@RequestMapping("/mapper/teachers")
public class TeachersController {
    @Autowired
    TeachersServiceImpl teachersService;
    @Test
    @RequestMapping(value = "/List<Teachers>", method = RequestMethod.GET)
    @ApiOperation(value = "查询教师所有信息", notes = "教师信息")
    public MessageBean getTeacherList(){
        return getTeacherList();
    }

}
