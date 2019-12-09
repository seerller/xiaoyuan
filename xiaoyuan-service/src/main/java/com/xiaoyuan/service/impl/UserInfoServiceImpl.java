package com.xiaoyuan.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoyuan.model.UserInfo;
import com.xiaoyuan.mapper.UserInfoMapper;
import com.xiaoyuan.service.IUserInfoService;
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
public class UserInfoServiceImpl implements IUserInfoService {

    @Override
    public boolean save(UserInfo entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<UserInfo> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<UserInfo> entityList, int batchSize) {
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
    public boolean remove(Wrapper<UserInfo> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(UserInfo entity) {
        return false;
    }

    @Override
    public boolean update(UserInfo entity, Wrapper<UserInfo> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<UserInfo> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(UserInfo entity) {
        return false;
    }

    @Override
    public UserInfo getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<UserInfo> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<UserInfo> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public UserInfo getOne(Wrapper<UserInfo> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<UserInfo> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<UserInfo> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<UserInfo> queryWrapper) {
        return 0;
    }

    @Override
    public List<UserInfo> list(Wrapper<UserInfo> queryWrapper) {
        return null;
    }

    @Override
    public IPage<UserInfo> page(IPage<UserInfo> page, Wrapper<UserInfo> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<UserInfo> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<UserInfo> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<UserInfo> page, Wrapper<UserInfo> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<UserInfo> getBaseMapper() {
        return null;
    }
}
