package com.xiaoyuan.controller;


import com.xiaoyuan.controller.common.BaseController;
import com.xiaoyuan.model.News;
import com.xiaoyuan.service.impl.NewsServiceImpl;
import com.xiaoyuan.tools.MessageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  新闻控制器
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
@RestController
@RequestMapping("/mapper/news")
@Api(value = "/News", description = "新闻管理控制层")
public class NewsController extends BaseController {
    @Autowired
    NewsServiceImpl newsService;

    @RequestMapping(value = "/selectAll", method = RequestMethod.POST)
    @ApiOperation(value = "查询新闻信息", notes = "查询新闻信息")
    public MessageBean selectAll(){
        return selectAll();
    }

    @RequestMapping(value = "/addNews", method = RequestMethod.POST)
    @ApiOperation(value = "新增新闻", notes = "")
    public MessageBean addNews(News record){
        return resultSuccess(addNews(record));
    }

    @RequestMapping(value = "/updateNews", method = RequestMethod.POST)
    @ApiOperation(value = "修改新闻", notes = "根据主键修改新闻")
    public MessageBean updateNews(Integer newsId){
        return resultSuccess(updateNews(newsId));
    }

    @RequestMapping(value = "/deleteByPriamryKey", method = RequestMethod.POST)
    @ApiOperation(value = "删除新闻", notes = "删除新闻")
    public void deleteByPrimaryKey(Integer newsId){
        newsService.deleteByPrimaryKey(newsId);
    }


}

