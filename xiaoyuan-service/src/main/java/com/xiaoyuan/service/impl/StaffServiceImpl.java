package com.xiaoyuan.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.additional.update.impl.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.additional.update.impl.UpdateChainWrapper;
import com.xiaoyuan.model.Staff;
import com.xiaoyuan.mapper.StaffMapper;
import com.xiaoyuan.service.IStaffService;
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
public class StaffServiceImpl implements IStaffService {

    @Override
    public boolean save(Staff entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<Staff> entityList) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<Staff> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Staff> entityList) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Staff> entityList, int batchSize) {
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
    public boolean remove(Wrapper<Staff> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(Staff entity) {
        return false;
    }

    @Override
    public boolean update(Staff entity, Wrapper<Staff> updateWrapper) {
        return false;
    }

    @Override
    public boolean update(Wrapper<Staff> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Staff> entityList) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Staff> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Staff entity) {
        return false;
    }

    @Override
    public Staff getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<Staff> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<Staff> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public Staff getOne(Wrapper<Staff> queryWrapper) {
        return null;
    }

    @Override
    public Staff getOne(Wrapper<Staff> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Staff> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Staff> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<Staff> queryWrapper) {
        return 0;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public List<Staff> list(Wrapper<Staff> queryWrapper) {
        return null;
    }

    @Override
    public List<Staff> list() {
        return null;
    }

    @Override
    public IPage<Staff> page(IPage<Staff> page, Wrapper<Staff> queryWrapper) {
        return null;
    }

    @Override
    public IPage<Staff> page(IPage<Staff> page) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<Staff> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps() {
        return null;
    }

    @Override
    public List<Object> listObjs() {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public List<Object> listObjs(Wrapper<Staff> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<Staff> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<Staff> page, Wrapper<Staff> queryWrapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<Staff> page) {
        return null;
    }

    @Override
    public BaseMapper<Staff> getBaseMapper() {
        return null;
    }

    @Override
    public QueryChainWrapper<Staff> query() {
        return null;
    }

    @Override
    public LambdaQueryChainWrapper<Staff> lambdaQuery() {
        return null;
    }

    @Override
    public UpdateChainWrapper<Staff> update() {
        return null;
    }

    @Override
    public LambdaUpdateChainWrapper<Staff> lambdaUpdate() {
        return null;
    }

    @Override
    public boolean saveOrUpdate(Staff entity, Wrapper<Staff> updateWrapper) {
        return false;
    }

    @Override
    public int deleteByPrimaryKey(Integer status_id) {
        return 0;
    }

    @Override
    public int insert(Staff record) {
        return 0;
    }

    @Override
    public Staff selectByPrimaryKey(Integer status_id) {
        return null;
    }

    @Override
    public List<Staff> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Staff record) {
        return 0;
    }
}
