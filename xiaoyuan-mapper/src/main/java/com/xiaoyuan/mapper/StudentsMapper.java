package com.xiaoyuan.mapper;

import com.xiaoyuan.model.Students;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface StudentsMapper extends BaseMapper{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_students
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int deleteByPrimaryKey(Integer studentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_students
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int insert(Students record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_students
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    Students selectByPrimaryKey(Integer studentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_students
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    List<Students> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_students
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int updateByPrimaryKey(Students record);
}