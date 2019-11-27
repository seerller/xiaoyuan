package com.xiaoyuan.mapper;

import com.xiaoyuan.model.Teachers;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
public interface TeachersMapper extends BaseMapper<Teachers> {
    List<Teachers> getTeacherList();
    void addTeachers(Teachers teachers);
    void updateTeachers(Teachers teachers);
    void deleteTeachers(Teachers teachers);

}
