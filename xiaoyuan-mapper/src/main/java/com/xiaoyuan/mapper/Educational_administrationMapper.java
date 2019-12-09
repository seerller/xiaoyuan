package com.xiaoyuan.mapper;

import com.xiaoyuan.model.EducationalAdministration;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface Educational_administrationMapper extends BaseMapper<Educational_administrationMapper>{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_educational_administration
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int deleteByPrimaryKey(Integer courceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_educational_administration
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int insert(EducationalAdministration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_educational_administration
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    EducationalAdministration selectByPrimaryKey(Integer courceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_educational_administration
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    List<Educational_administrationMapper> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_educational_administration
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
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
