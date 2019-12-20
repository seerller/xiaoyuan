package com.xiaoyuan.controller;

import com.xiaoyuan.model.Homework;
import com.xiaoyuan.mapper.HomeworkMapper;
import com.xiaoyuan.controller.common.BaseController;
import com.xiaoyuan.service.impl.HomeworkServiceImpl;
import com.xiaoyuan.tools.MessageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.Date;
import java.util.UUID;

/**
 * <p>
 *  作业控制器
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
@RestController
@RequestMapping("/mapper/homework")
@Api(value = "/Homework", description = "作业管理控制层")
public class HomeworkController extends BaseController {
    @Autowired
    private HomeworkServiceImpl homeworkService;

    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    @ApiOperation(value = "查询作业*", notes = "查询作业列表")
    public MessageBean selectHomework(){
        return resultSuccess(homeworkService.selectHomework());
    }

    @RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.POST)
    @ApiOperation(value = "获取作业详情*", notes = "根据主键获取作业详情")
    @ApiImplicitParams(
            {@ApiImplicitParam(value = "作业ID",name = "homeworkId",dataType = "Integer",paramType ="query",required = true)})
    public MessageBean selectByPrimaryKey(Integer homeworkId){
        return resultSuccess(selectByPrimaryKey(homeworkId));
    }

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ApiOperation(value = "新增作业", notes = "")
    @ApiImplicitParams(
            {@ApiImplicitParam(value = "班级名称",name = "classname",dataType = "String",paramType ="query",required = true),
                    @ApiImplicitParam(value = "科目",name = "subject",dataType = "String",paramType ="query",required = true),
                    @ApiImplicitParam(value = "截止时间",name = "endTime",dataType = "Date",paramType ="query",required = true),
                    @ApiImplicitParam(value = "作业内容",name = "content",dataType = "String",paramType ="query",required = true)})
    public MessageBean add(String classname, String subject, Date endTime, MultipartFile files, String content){

        Homework homework = new Homework();
        FileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);

        try{
            homework.setClassname(classname);
            homework.setSubject(subject);
            homework.setEndTime(endTime);
            homework.setContent(content);

            //获取文件名
            String fileName = files.getOriginalFilename();
            //获取文件后缀名
            String suffixName = fileName.substring(fileName.lastIndexOf("."));
            //重新生成文件名
            fileName = UUID.randomUUID() + suffixName;

            //指定本地文件夹存储图片
            String realPath = "D:/gangan/images/";


            String path = request.getContextPath();
            String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;


            //将图片保存到static文件夹里
            files.transferTo(new File(path + fileName));

            homework.setFiles( basePath + "/images/" + fileName );

            return resultSuccess(homeworkService.save(homework));
        }catch (Exception e){
            e.printStackTrace();
            return resultFailed();
        }
    }
}
