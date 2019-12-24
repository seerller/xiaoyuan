package com.xiaoyuan.controller;


import com.xiaoyuan.controller.common.BaseController;
import com.xiaoyuan.model.Amusement;
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
@Api(value = "/Amusement", description = "娱乐管理控制层")
public class AmusementController extends BaseController {
    @Autowired
    AmusementServiceImpl amusementService;

    @RequestMapping(value = "/selectAmusment()", method = RequestMethod.GET)
    @ApiOperation(value = "查询娱乐信息", notes = "娱乐信息")
    public MessageBean selectAmusment(){
        return resultSuccess(selectAmusment());
    }

    @RequestMapping(value = "/addAmusement", method = RequestMethod.POST)
    @ApiOperation(value = "新增娱乐信息", notes = "")
    public MessageBean addAmusement(Amusement record){
        return resultSuccess(addAmusement(record));
    }

    @RequestMapping(value = "/updateAmusement", method = RequestMethod.POST)
    @ApiOperation(value = "修改娱乐信息", notes = "根据主键修改娱乐信息")
    public MessageBean updateAmusement(Integer amusementId){
        return resultSuccess(updateAmusement(amusementId));
    }

    @RequestMapping(value = "/deleteAmusementById", method = RequestMethod.POST)
    @ApiOperation(value = "删除娱乐信息", notes = "根据主键删除娱乐信息")
    public MessageBean deleteAmusementById(Integer amusementId){
        return resultSuccess(deleteAmusementById(amusementId));
    }

}
