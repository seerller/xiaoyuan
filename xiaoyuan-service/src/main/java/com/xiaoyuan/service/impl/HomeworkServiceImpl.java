package com.xiaoyuan.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoyuan.model.Homework;
import com.xiaoyuan.mapper.HomeworkMapper;
import com.xiaoyuan.service.IHomeworkService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
@Service
public class HomeworkServiceImpl implements IHomeworkService {

    @Override
    public boolean save(Homework entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<Homework> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Homework> entityList, int batchSize) {
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
    public boolean remove(Wrapper<Homework> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(Homework entity) {
        return false;
    }

    @Override
    public boolean update(Homework entity, Wrapper<Homework> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Homework> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Homework entity) {
        return false;
    }

    @Override
    public Homework getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<Homework> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<Homework> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public Homework getOne(Wrapper<Homework> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Homework> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Homework> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<Homework> queryWrapper) {
        return 0;
    }

    @Override
    public List<Homework> list(Wrapper<Homework> queryWrapper) {
        return null;
    }

    @Override
    public IPage<Homework> page(IPage<Homework> page, Wrapper<Homework> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<Homework> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<Homework> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<Homework> page, Wrapper<Homework> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<Homework> getBaseMapper() {
        return null;
    }
}
