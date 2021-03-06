package com.xiaoyuan.service;

import com.xiaoyuan.model.Homework;
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
public interface IHomeworkService extends IService<Homework> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_homework
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int deleteByPrimaryKey(Integer homeworkId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_homework
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int insert(Homework record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_homework
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    Homework selectByPrimaryKey(Integer homeworkId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_homework
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    List<Homework> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_homework
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int updateByPrimaryKey(Homework record);

    /**
     * 查询作业
     * @return
     */
    List<Homework> selectHomework();

}
