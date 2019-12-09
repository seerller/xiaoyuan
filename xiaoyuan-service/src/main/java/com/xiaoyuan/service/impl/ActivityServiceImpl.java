package com.xiaoyuan.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.additional.update.impl.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.additional.update.impl.UpdateChainWrapper;
import com.xiaoyuan.model.Activity;
import com.xiaoyuan.mapper.ActivityMapper;
import com.xiaoyuan.service.IActivityService;
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
public class ActivityServiceImpl  implements IActivityService {

    @Override
    public boolean save(Activity entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<Activity> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Activity> entityList, int batchSize) {
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
    public boolean remove(Wrapper<Activity> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(Activity entity) {
        return false;
    }

    @Override
    public boolean update(Activity entity, Wrapper<Activity> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Activity> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Activity entity) {
        return false;
    }

    @Override
    public Activity getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<Activity> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<Activity> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public Activity getOne(Wrapper<Activity> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Activity> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Activity> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<Activity> queryWrapper) {
        return 0;
    }

    @Override
    public List<Activity> list(Wrapper<Activity> queryWrapper) {
        return null;
    }

    @Override
    public IPage<Activity> page(IPage<Activity> page, Wrapper<Activity> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<Activity> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<Activity> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<Activity> page, Wrapper<Activity> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<Activity> getBaseMapper() {
        return null;
    }
}
