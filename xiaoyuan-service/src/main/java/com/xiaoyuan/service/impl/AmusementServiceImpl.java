package com.xiaoyuan.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoyuan.model.Amusement;
import com.xiaoyuan.mapper.AmusementMapper;
import com.xiaoyuan.service.IAmusementService;
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
public class AmusementServiceImpl  implements IAmusementService {

    @Override
    public int deleteByPrimaryKey(Integer amusemenId) {
        return 0;
    }

    @Override
    public int insert(Amusement record) {
        return 0;
    }

    @Override
    public Amusement selectByPrimaryKey(Integer amusemenId) {
        return null;
    }

    @Override
    public List<Amusement> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Amusement record) {
        return 0;
    }

    @Override
    public List<Amusement> selectAmusment() {
        return null;
    }

    @Override
    public int addAmusement(Amusement record) {
        return 0;
    }

    @Override
    public int updateAmusement(Integer amusementId) {
        return 0;
    }

    @Override
    public int deleteAmusementById(Integer amusementId) {
        return 0;
    }

    @Override
    public boolean save(Amusement entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<Amusement> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Amusement> entityList, int batchSize) {
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
    public boolean remove(Wrapper<Amusement> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(Amusement entity) {
        return false;
    }

    @Override
    public boolean update(Amusement entity, Wrapper<Amusement> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Amusement> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Amusement entity) {
        return false;
    }

    @Override
    public Amusement getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<Amusement> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<Amusement> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public Amusement getOne(Wrapper<Amusement> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Amusement> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Amusement> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<Amusement> queryWrapper) {
        return 0;
    }

    @Override
    public List<Amusement> list(Wrapper<Amusement> queryWrapper) {
        return null;
    }

    @Override
    public IPage<Amusement> page(IPage<Amusement> page, Wrapper<Amusement> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<Amusement> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<Amusement> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<Amusement> page, Wrapper<Amusement> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<Amusement> getBaseMapper() {
        return null;
    }
}
