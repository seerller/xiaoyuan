package com.xiaoyuan.mapper;

import com.xiaoyuan.model.Parent;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface ParentMapper extends BaseMapper<ParentMapper>{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_parent
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int deleteByPrimaryKey(Integer parentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_parent
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int insert(Parent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_parent
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    Parent selectByPrimaryKey(Integer parentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_parent
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    List<Parent> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_parent
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int updateByPrimaryKey(Parent record);
}