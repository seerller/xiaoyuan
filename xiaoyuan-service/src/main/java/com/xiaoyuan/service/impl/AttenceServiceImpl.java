package com.xiaoyuan.service.impl;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoyuan.model.Attence;
import com.xiaoyuan.service.IAttenceService;
import com.xiaoyuan.mapper.AttenceMapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Service
public class AttenceServiceImpl implements IAttenceService{
    @Autowired
    AttenceMapper attenceMapper;

    @Override
    public List<Attence> selectClassName(Integer schoolID) {
        return null;
    }

    @Override
    public List<Attence> selectStudentname(Integer classId) {
        return null;
    }

    @Override
    public List<Attence> selectAttence(Integer studentID) {
        return null;
    }

    @Override
    public List<Attence> selectAttenceCount(Integer studentID) {
        return null;
    }
}
