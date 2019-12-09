package com.xiaoyuan.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoyuan.model.Advertisement;
import com.xiaoyuan.mapper.AdvertisementMapper;
import com.xiaoyuan.service.IAdvertisementService;
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
public class AdvertisementServiceImpl implements IAdvertisementService {

    @Override
    public boolean save(Advertisement entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<Advertisement> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Advertisement> entityList, int batchSize) {
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
    public boolean remove(Wrapper<Advertisement> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(Advertisement entity) {
        return false;
    }

    @Override
    public boolean update(Advertisement entity, Wrapper<Advertisement> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Advertisement> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Advertisement entity) {
        return false;
    }

    @Override
    public Advertisement getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<Advertisement> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<Advertisement> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public Advertisement getOne(Wrapper<Advertisement> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Advertisement> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Advertisement> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<Advertisement> queryWrapper) {
        return 0;
    }

    @Override
    public List<Advertisement> list(Wrapper<Advertisement> queryWrapper) {
        return null;
    }

    @Override
    public IPage<Advertisement> page(IPage<Advertisement> page, Wrapper<Advertisement> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<Advertisement> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<Advertisement> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<Advertisement> page, Wrapper<Advertisement> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<Advertisement> getBaseMapper() {
        return null;
    }
}
