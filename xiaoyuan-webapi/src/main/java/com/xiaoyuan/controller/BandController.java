package com.xiaoyuan.controller;


import com.xiaoyuan.controller.common.BaseController;
import com.xiaoyuan.model.Band;
import com.xiaoyuan.service.impl.BandServiceImpl;
import com.xiaoyuan.tools.MessageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  手环控制器
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
@RestController
@RequestMapping("/mapper/band")
@Api(value = "/Band", description = "手环管理控制层")
public class BandController extends BaseController {
    @Autowired
    BandServiceImpl bandService;

    @RequestMapping(value = "/selectBand", method = RequestMethod.GET)
    @ApiOperation(value = "查询手环信息", notes = "")
    public MessageBean selectBand(){
        return resultSuccess(selectBand());
    }

    @RequestMapping(value = "/addBand", method = RequestMethod.POST)
    @ApiOperation(value = "新增手环",notes = "")
    public MessageBean addBand(Band record){
        return resultSuccess(addBand(record));
    }

    @RequestMapping(value = "/updateBand", method = RequestMethod.POST)
    @ApiOperation(value = "修改手环信息", notes = "根据主键修改手环信息")
    public MessageBean updateBand(Integer bandId){
        return resultSuccess(updateBand(bandId));
    }

    @RequestMapping(value = "/deleteBand", method = RequestMethod.POST)
    @ApiOperation(value = "删除手环", notes = "删除手环信息")
    public MessageBean deleteBand(Integer bandId){
        return resultSuccess(deleteBand(bandId));
    }

    public MessageBean updateBandStatus(String Status){
        return resultSuccess(updateBandStatus(Status="解绑"));

    }

}
