package com.xiaoyuan.mapper;

import com.xiaoyuan.model.UserNotes;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface UserNotesMapper extends BaseMapper<UserNotesMapper>{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_user_notes
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_user_notes
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int insert(UserNotes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_user_notes
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    UserNotes selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_user_notes
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    List<UserNotes> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_user_notes
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int updateByPrimaryKey(UserNotes record);
}