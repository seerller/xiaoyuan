package com.xiaoyuan.controller;


import com.xiaoyuan.controller.common.BaseController;
import com.xiaoyuan.model.EducationalAdministration;
import com.xiaoyuan.service.impl.EducationalAdministrationServiceImpl;
import com.xiaoyuan.tools.MessageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  教务控制器
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
@RestController
@RequestMapping("/mapper/educational-administration")
@Api(value = "/EducationalAdministration", description = "教务管理控制层")
public class EducationalAdministrationController extends BaseController {
    @Autowired
    EducationalAdministrationServiceImpl educationalAdministrationService;

    @RequestMapping(value = "/selectCource", method = RequestMethod.GET)
    @ApiOperation(value = "查询课程", notes = "查询所有课程")
    public MessageBean selectCource(){
        return resultSuccess(selectCource());
    }

    @RequestMapping(value = "/selectCourceByCourceId", method = RequestMethod.POST)
    @ApiOperation(value = "查询课程信息", notes = "根据主键查询课程信息")
    public MessageBean selectCourceByCourceId(Integer courceId){
        return resultSuccess(selectCourceByCourceId(courceId));
    }

    @RequestMapping(value = "/addCource", method = RequestMethod.POST)
    @ApiOperation(value = "新增课程", notes = "新增课程")
    public MessageBean addCource(EducationalAdministration record){
        return resultSuccess(addCource(record));
    }

    @RequestMapping(value = "/updateCource", method = RequestMethod.POST)
    @ApiOperation(value = "修改课程信息")
    public MessageBean updateCource(EducationalAdministration record){
        return resultSuccess(updateCource( record));
    }

    @RequestMapping(value = "/deleteCourceByTeachername", method = RequestMethod.POST)
    @ApiOperation(value = "删除课程", notes = "根据教师姓名删除课程信息")
    public MessageBean deleteCourceByTeachername(EducationalAdministration teachername){
        return resultSuccess(deleteCourceByTeachername(teachername));
    }

}
