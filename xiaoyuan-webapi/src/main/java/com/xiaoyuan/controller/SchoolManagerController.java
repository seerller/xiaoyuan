package com.xiaoyuan.controller;

import com.xiaoyuan.controller.common.BaseController;
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
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  学校管理中心控制器
 * </p>
 *
 * @author liu
 * @since 2019-11-26
 */
@RestController
@RequestMapping()
@Api(value = "/SchoolManager", description = "学校管理中心控制层")
public class SchoolManagerController extends BaseController {
}
