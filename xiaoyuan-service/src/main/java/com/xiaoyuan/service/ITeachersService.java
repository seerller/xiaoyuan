package com.xiaoyuan.service;

import com.xiaoyuan.model.Teachers;
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
public interface ITeachersService extends IService<Teachers> {
    List<Teachers> getTeacherList();
    void addTeachers();
    void updateTeachers();
    void deleteTeachers();
}
