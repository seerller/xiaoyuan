package com.xiaoyuan.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoyuan.model.HomeworkReturn;
import com.xiaoyuan.mapper.Homework_returnMapper;
import com.xiaoyuan.service.IHomeworkReturnService;
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
public class HomeworkReturnServiceImpl implements IHomeworkReturnService {


    @Override
    public boolean save(HomeworkReturn entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<HomeworkReturn> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<HomeworkReturn> entityList, int batchSize) {
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
    public boolean remove(Wrapper<HomeworkReturn> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(HomeworkReturn entity) {
        return false;
    }

    @Override
    public boolean update(HomeworkReturn entity, Wrapper<HomeworkReturn> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<HomeworkReturn> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(HomeworkReturn entity) {
        return false;
    }

    @Override
    public HomeworkReturn getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<HomeworkReturn> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<HomeworkReturn> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public HomeworkReturn getOne(Wrapper<HomeworkReturn> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<HomeworkReturn> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<HomeworkReturn> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<HomeworkReturn> queryWrapper) {
        return 0;
    }

    @Override
    public List<HomeworkReturn> list(Wrapper<HomeworkReturn> queryWrapper) {
        return null;
    }

    @Override
    public IPage<HomeworkReturn> page(IPage<HomeworkReturn> page, Wrapper<HomeworkReturn> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<HomeworkReturn> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<HomeworkReturn> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<HomeworkReturn> page, Wrapper<HomeworkReturn> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<HomeworkReturn> getBaseMapper() {
        return null;
    }
}
