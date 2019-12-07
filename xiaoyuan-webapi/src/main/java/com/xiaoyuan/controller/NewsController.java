package com.xiaoyuan.controller;


import com.xiaoyuan.controller.common.BaseController;
import com.xiaoyuan.service.impl.NewsServiceImpl;
import com.xiaoyuan.tools.MessageBean;
import io.swagger.annotations.ApiOperation;
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
@RequestMapping("/mapper/news")
public class NewsController extends BaseController {
    @Autowired
    NewsServiceImpl newsService;

    @RequestMapping(value = "/selectAll", method = RequestMethod.POST)
    @ApiOperation(value = "查询新闻信息", notes = "查询新闻信息")
    public MessageBean selectAll(){
        return selectAll();
    }

    @RequestMapping(value = "/deleteByPriamryKey", method = RequestMethod.POST)
    @ApiOperation(value = "删除新闻", notes = "删除新闻")
    public void deleteByPrimaryKey(Integer newsId){
        newsService.deleteByPrimaryKey(newsId);
    }

}
