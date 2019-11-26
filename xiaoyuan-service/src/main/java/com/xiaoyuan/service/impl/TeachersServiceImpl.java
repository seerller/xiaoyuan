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

    @Override
    public List<Teachers> getTeacherList() {
        return null;
    }

}
