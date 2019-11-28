package com.xiaoyuan.controller;


import com.github.pagehelper.ISelect;
import com.xiaoyuan.model.School;
import com.xiaoyuan.service.impl.SchoolServiceImpl;
import com.xiaoyuan.tools.MessageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  学校控制层
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
@Api(value = "/School", description = "学校管理模块")
@RestController
@RequestMapping("/mapper/school")
public class SchoolController {
    @Autowired
    SchoolServiceImpl schoolService;
    @Test
    @RequestMapping(value = "/List<School>" , method = RequestMethod.GET)
    @ApiOperation(value="根据主键查询学校信息", notes="查询学校信息")
    public MessageBean selectByPrimaryKey(){
        return selectByPrimaryKey();
    }
    @RequestMapping(value = "/updateByPrimaryKey<School>" , method = RequestMethod.POST)
    @ApiOperation(value="修改学校信息", notes="修改学校信息")
    public void updateByPrimaryKey(School record){
        schoolService.updateByPrimaryKey(record);
    }




}
