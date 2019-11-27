package com.xiaoyuan.service.impl;

import com.xiaoyuan.model.Teachers;
import com.xiaoyuan.mapper.TeachersMapper;
import com.xiaoyuan.service.ITeachersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
@Service
public class TeachersServiceImpl extends ServiceImpl<TeachersMapper, Teachers> implements ITeachersService {
    @Autowired
    TeachersMapper teachersMapper;
    /**
     * 查询教师
     * **/
    @Override
    public List<Teachers> getTeacherList() {
        return null;
    }
    /**
     * 新增教师
     * **/
    @Override
    public void addTeachers(Teachers teachers) {
        teachersMapper.addTeachers(teachers);

    }
    /**
     * 修改教师
     * **/
    @Override
    public void updateTeachers(Teachers teachers) {
        teachersMapper.updateTeachers(teachers);

    }
    /**
     * 删除教师
     * **/
    @Override
    public void deleteTeachers(Teachers teachers) {
        teachersMapper.deleteTeachers(teachers);

    }

    /**
     * 冻结教师
     * @param teachersstatus
     */
    @Override
    public void setTeachersstatus(Teachers teachersstatus) {
        teachersMapper.setTeachersstatus(teachersstatus);
    }

}
