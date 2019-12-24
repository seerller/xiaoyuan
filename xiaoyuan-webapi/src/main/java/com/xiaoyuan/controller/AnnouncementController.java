package com.xiaoyuan.controller;


import com.xiaoyuan.controller.common.BaseController;
import com.xiaoyuan.model.Announcement;
import com.xiaoyuan.service.impl.AnnouncementServiceImpl;
import com.xiaoyuan.tools.MessageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  公告控制器
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
@Api(value = "/Announcement", description = "公告管理控制层*")
@RestController
@RequestMapping("/mapper/announcement")
public class AnnouncementController extends BaseController {
    @Autowired
    private AnnouncementServiceImpl announcementService;

    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    @ApiOperation(value = "查询公告*", notes = "查询公告列表")
    public MessageBean selectAll(){
        return resultSuccess(announcementService.selectAll());
    }

    @RequestMapping(value = "selectByPrimaryKey", method = RequestMethod.POST)
    @ApiOperation(value = "查询公告详情*", notes = "根据主键查询公告详情")
    public MessageBean selectByPrimaryKey(Integer announcementId){
        return resultSuccess(announcementService.selectByPrimaryKey(announcementId));
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation(value = "新增公告", notes = "")
    public MessageBean insert(Announcement record){
        return resultSuccess(announcementService.save(record));
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
    @ApiOperation(value = "修改公告", notes = "根据主键修改公告")
    public MessageBean updateByPrimaryKey(Announcement record){
        return resultSuccess(announcementService.save(record));
    }
    @RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.POST)
    @ApiOperation(value = "删除公告", notes = "根据主键删除公告")
    public void deleteByPrimaryKey(Integer announcementId){
        announcementService.deleteByPrimaryKey(announcementId);
    }

}
