package com.xiaoyuan.controller;


import com.xiaoyuan.service.impl.AmusementServiceImpl;
import com.xiaoyuan.tools.MessageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  娱乐控制器
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
@RestController
@RequestMapping("/mapper/amusement")
@Api(value = "/Amusement", description = "娱乐管理模块")
public class AmusementController {
    @Autowired
    AmusementServiceImpl amusementService;

    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    @ApiOperation(value = "查询娱乐信息", notes = "娱乐信息")
    public MessageBean selectAll(){
        return selectAll();
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.POST)
    @ApiOperation(value = "删除娱乐信息", notes = "删除娱乐信息")
    public void deleteByPrimaryKey(Integer amusemenId){
        amusementService.deleteByPrimaryKey(amusemenId);
    }

}
