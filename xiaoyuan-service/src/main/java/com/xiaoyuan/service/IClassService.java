package com.xiaoyuan.service;

import com.xiaoyuan.model.Class;
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
public interface IClassService extends IService<Class> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_class
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int insert(Class record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_class
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    Class selectByPrimaryKey(Integer classId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_class
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    List<Class> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_class
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int updateByPrimaryKey(Class record);

    /**
     * 更改班级状态
     * @param status
     * @return
     */
    int changeStatus(Class status);

    /**
     * 查询班级
     * @return
     */
    List<Class> selectClass();

    /**
     * 新增班级
     * @param record
     * @return
     */
    int addClass(Class record);

    /**
     * 修改班级
     * @param record
     * @return
     */
    int updateClass(Class record);

}
