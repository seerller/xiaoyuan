package com.xiaoyuan.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoyuan.model.Class;
import com.xiaoyuan.mapper.ClassMapper;
import com.xiaoyuan.service.IClassService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ClassServiceImpl implements IClassService {
    @Autowired
    ClassMapper classMapper;

    @Override
    public int insert(Class record) {
        return 0;
    }

    @Override
    public Class selectByPrimaryKey(Integer classId) {
        return null;
    }

    @Override
    public List<Class> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Class record) {
        return 0;
    }

    @Override
    public int changeStatus(Class status) {
        return 0;
    }

    @Override
    public List<Class> selectClass() {
        return null;
    }

    @Override
    public int addClass(Class record) {
        return 0;
    }

    @Override
    public int updateClass(Class record) {
        return 0;
    }

    @Override
    public boolean save(Class entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<Class> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Class> entityList, int batchSize) {
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
    public boolean remove(Wrapper<Class> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(Class entity) {
        return false;
    }

    @Override
    public boolean update(Class entity, Wrapper<Class> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Class> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Class entity) {
        return false;
    }

    @Override
    public Class getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<Class> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<Class> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public Class getOne(Wrapper<Class> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Class> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Class> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<Class> queryWrapper) {
        return 0;
    }

    @Override
    public List<Class> list(Wrapper<Class> queryWrapper) {
        return null;
    }

    @Override
    public IPage<Class> page(IPage<Class> page, Wrapper<Class> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<Class> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<Class> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<Class> page, Wrapper<Class> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<Class> getBaseMapper() {
        return null;
    }

    public void save(java.lang.Class record) {
    }
}
