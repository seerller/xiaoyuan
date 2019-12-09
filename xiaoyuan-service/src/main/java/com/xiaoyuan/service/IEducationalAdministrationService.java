package com.xiaoyuan.service;

import com.xiaoyuan.mapper.Educational_administrationMapper;
import com.xiaoyuan.model.EducationalAdministration;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
public interface IEducationalAdministrationService extends IService<EducationalAdministration> {
    int updateByPrimaryKey(EducationalAdministration record);

    /**
     * 查询所有课程
     * @return
     */
    List<Educational_administrationMapper> selectCource();

    /**
     * 查询课程具体信息
     * @param courceId
     * @return
     */
    EducationalAdministration selectCourceByCourceId(Integer courceId);

    /**
     * 新增课程
     * @param record
     * @return
     */
    int addCource(EducationalAdministration record);

    /**
     * 修改课程
     * @param record
     * @return
     */
    int updateCource(EducationalAdministration record);

    /**
     * 删除课程
     * @param teachername
     * @return
     */
    int deleteCourceByTeachername(EducationalAdministration teachername);

}
