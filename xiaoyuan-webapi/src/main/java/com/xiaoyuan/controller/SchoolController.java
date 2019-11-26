package com.xiaoyuan.controller;


import com.github.pagehelper.ISelect;
import com.xiaoyuan.service.impl.SchoolServiceImpl;
import com.xiaoyuan.tools.MessageBean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
@RestController
@RequestMapping("/mapper/school")
public class SchoolController {
    @Autowired
    SchoolServiceImpl schoolService;
    @Test
    @RequestMapping(value = "/List<School>" , method = RequestMethod.GET)
    public MessageBean selectByPrimaryKey(){
        return selectByPrimaryKey();
    }


}
