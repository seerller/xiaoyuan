package com.xiaoyuan.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoyuan.model.Feedback;
import com.xiaoyuan.mapper.FeedbackMapper;
import com.xiaoyuan.service.IFeedbackService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
@Service
public class FeedbackServiceImpl implements IFeedbackService {
    @Autowired
    FeedbackMapper feedbackMapper;

    @Override
    public List<Feedback> selectFeedback() {
        return null;
    }

    @Override
    public int deleteFeedback(Integer feedbackId) {
        return 0;
    }

    @Override
    public boolean save(Feedback entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<Feedback> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Feedback> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean removeById(Serializable id) {
        return false;
    }

    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {
        return false;
    }

    @Override
    public boolean remove(Wrapper<Feedback> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(Feedback entity) {
        return false;
    }

    @Override
    public boolean update(Feedback entity, Wrapper<Feedback> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Feedback> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Feedback entity) {
        return false;
    }

    @Override
    public Feedback getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<Feedback> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<Feedback> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public Feedback getOne(Wrapper<Feedback> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Feedback> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Feedback> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<Feedback> queryWrapper) {
        return 0;
    }

    @Override
    public List<Feedback> list(Wrapper<Feedback> queryWrapper) {
        return null;
    }

    @Override
    public IPage<Feedback> page(IPage<Feedback> page, Wrapper<Feedback> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<Feedback> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<Feedback> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<Feedback> page, Wrapper<Feedback> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<Feedback> getBaseMapper() {
        return null;
    }
}
