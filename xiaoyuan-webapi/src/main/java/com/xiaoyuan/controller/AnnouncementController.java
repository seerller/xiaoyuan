package com.xiaoyuan.controller;


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
@Api(value = "/Announcement", description = "公告管理模块")
@RestController
@RequestMapping("/mapper/announcement")
public class AnnouncementController {
    @Autowired
    AnnouncementServiceImpl announcementService;
    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    @ApiOperation(value = "查询公告", notes = "公告信息")
    public MessageBean selectAll(){
        return selectAll();
    }
    @RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.POST)
    @ApiOperation(value = "删除公告", notes = "删除公告")
    public void deleteByPrimaryKey(Integer announcementId){
        announcementService.deleteByPrimaryKey(announcementId);
    }

}
