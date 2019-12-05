package com.xiaoyuan.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoyuan.model.Parent;
import com.xiaoyuan.mapper.ParentMapper;
import com.xiaoyuan.service.IParentService;
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
public class ParentServiceImpl implements IParentService {

    @Override
    public boolean save(Parent entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<Parent> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Parent> entityList, int batchSize) {
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
    public boolean remove(Wrapper<Parent> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(Parent entity) {
        return false;
    }

    @Override
    public boolean update(Parent entity, Wrapper<Parent> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Parent> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Parent entity) {
        return false;
    }

    @Override
    public Parent getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<Parent> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<Parent> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public Parent getOne(Wrapper<Parent> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Parent> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Parent> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<Parent> queryWrapper) {
        return 0;
    }

    @Override
    public List<Parent> list(Wrapper<Parent> queryWrapper) {
        return null;
    }

    @Override
    public IPage<Parent> page(IPage<Parent> page, Wrapper<Parent> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<Parent> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<Parent> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<Parent> page, Wrapper<Parent> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<Parent> getBaseMapper() {
        return null;
    }
}
