package com.xiaoyuan.controller;


import com.xiaoyuan.controller.common.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

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
@RequestMapping("/mapper/user-notes")
@Api(value = "/UserNotes", description = "用户权限控制层")
public class UserNotesController extends BaseController {

}
