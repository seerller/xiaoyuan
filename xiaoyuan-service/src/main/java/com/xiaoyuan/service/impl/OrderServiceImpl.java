package com.xiaoyuan.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.additional.update.impl.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.additional.update.impl.UpdateChainWrapper;
import com.xiaoyuan.model.Order;
import com.xiaoyuan.mapper.OrderMapper;
import com.xiaoyuan.service.IOrderService;
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
public class OrderServiceImpl implements IOrderService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public int deleteByPrimaryKey(Integer orderId) {
        return 0;
    }

    @Override
    public int insert(Order record) {
        return 0;
    }

    @Override
    public Order selectByPrimaryKey(Integer orderId) {
        return null;
    }

    @Override
    public List<Order> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Order record) {
        return 0;
    }

    @Override
    public List<Order> selectOrders() {
        return null;
    }

    @Override
    public boolean save(Order entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<Order> entityList) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<Order> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Order> entityList) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Order> entityList, int batchSize) {
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
    public boolean remove(Wrapper<Order> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(Order entity) {
        return false;
    }

    @Override
    public boolean update(Order entity, Wrapper<Order> updateWrapper) {
        return false;
    }

    @Override
    public boolean update(Wrapper<Order> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Order> entityList) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Order> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Order entity) {
        return false;
    }

    @Override
    public Order getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<Order> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<Order> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public Order getOne(Wrapper<Order> queryWrapper) {
        return null;
    }

    @Override
    public Order getOne(Wrapper<Order> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Order> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Order> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<Order> queryWrapper) {
        return 0;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public List<Order> list(Wrapper<Order> queryWrapper) {
        return null;
    }

    @Override
    public List<Order> list() {
        return null;
    }

    @Override
    public IPage<Order> page(IPage<Order> page, Wrapper<Order> queryWrapper) {
        return null;
    }

    @Override
    public IPage<Order> page(IPage<Order> page) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<Order> queryWrapper) {
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
    public List<Object> listObjs(Wrapper<Order> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<Order> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<Order> page, Wrapper<Order> queryWrapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<Order> page) {
        return null;
    }

    @Override
    public BaseMapper<Order> getBaseMapper() {
        return null;
    }

    @Override
    public QueryChainWrapper<Order> query() {
        return null;
    }

    @Override
    public LambdaQueryChainWrapper<Order> lambdaQuery() {
        return null;
    }

    @Override
    public UpdateChainWrapper<Order> update() {
        return null;
    }

    @Override
    public LambdaUpdateChainWrapper<Order> lambdaUpdate() {
        return null;
    }

    @Override
    public boolean saveOrUpdate(Order entity, Wrapper<Order> updateWrapper) {
        return false;
    }
}
