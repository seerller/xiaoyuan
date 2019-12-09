package com.xiaoyuan.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoyuan.model.UserNotes;
import com.xiaoyuan.mapper.UserNotesMapper;
import com.xiaoyuan.service.IUserNotesService;
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
public class UserNotesServiceImpl implements IUserNotesService {

    @Override
    public boolean save(UserNotes entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<UserNotes> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<UserNotes> entityList, int batchSize) {
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
    public boolean remove(Wrapper<UserNotes> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(UserNotes entity) {
        return false;
    }

    @Override
    public boolean update(UserNotes entity, Wrapper<UserNotes> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<UserNotes> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(UserNotes entity) {
        return false;
    }

    @Override
    public UserNotes getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<UserNotes> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<UserNotes> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public UserNotes getOne(Wrapper<UserNotes> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<UserNotes> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<UserNotes> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<UserNotes> queryWrapper) {
        return 0;
    }

    @Override
    public List<UserNotes> list(Wrapper<UserNotes> queryWrapper) {
        return null;
    }

    @Override
    public IPage<UserNotes> page(IPage<UserNotes> page, Wrapper<UserNotes> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<UserNotes> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<UserNotes> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<UserNotes> page, Wrapper<UserNotes> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<UserNotes> getBaseMapper() {
        return null;
    }
}
