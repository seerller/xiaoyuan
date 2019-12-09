package com.xiaoyuan.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoyuan.model.Band;
import com.xiaoyuan.mapper.BandMapper;
import com.xiaoyuan.service.IBandService;
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
public class BandServiceImpl implements IBandService {

    @Override
    public boolean save(Band entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<Band> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Band> entityList, int batchSize) {
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
    public boolean remove(Wrapper<Band> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(Band entity) {
        return false;
    }

    @Override
    public boolean update(Band entity, Wrapper<Band> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Band> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Band entity) {
        return false;
    }

    @Override
    public Band getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<Band> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<Band> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public Band getOne(Wrapper<Band> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Band> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Band> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<Band> queryWrapper) {
        return 0;
    }

    @Override
    public List<Band> list(Wrapper<Band> queryWrapper) {
        return null;
    }

    @Override
    public IPage<Band> page(IPage<Band> page, Wrapper<Band> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<Band> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<Band> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<Band> page, Wrapper<Band> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<Band> getBaseMapper() {
        return null;
    }
}
