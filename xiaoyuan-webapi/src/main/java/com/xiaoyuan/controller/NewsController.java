package com.xiaoyuan.controller;


import com.xiaoyuan.controller.common.BaseController;
import com.xiaoyuan.model.News;
import com.xiaoyuan.service.impl.NewsServiceImpl;
import com.xiaoyuan.tools.FileUtils;
import com.xiaoyuan.tools.MessageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.velocity.runtime.resource.loader.ResourceLoader;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

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

    private final ResourceLoader resourceLoader;

    private static final Logger logger = LoggerFactory.getLogger("NewsController.class");

    @Autowired
    public NewsController(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

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


    @Value("${web.upload-path}")
    private String path;

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/uploadPicture", method = RequestMethod.POST)
    @ApiOperation(value = "上传图片", notes = "")
    public @ResponseBody String upload(@RequestParam(value = "上传") MultipartFile file, HttpServletRequest request){
        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();
        String filePath = request.getSession().getServletContext().getRealPath(path);
        logger.error("filename1:" + fileName);
        logger.error("filePath1:" + filePath);

        try {
            FileUtils.upload(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 拼接图片url
        String imgHost = "localhost:" + port;
        String imgUploadPath = path;
        String imgName = fileName;
        String picture = imgHost + imgUploadPath + imgName;

        logger.error("拼接好的图片上传路径为：" + picture);

        return "upload img success，请到上传路径查看！" + newsService.uploadPicture(picture);
    }


}

