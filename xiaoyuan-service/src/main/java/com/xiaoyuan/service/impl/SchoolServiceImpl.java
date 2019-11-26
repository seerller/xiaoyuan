package com.xiaoyuan.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoyuan.model.School;
import com.xiaoyuan.mapper.SchoolMapper;
import com.xiaoyuan.service.ISchoolService;
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
public class SchoolServiceImpl  implements ISchoolService {

    @Autowired
    SchoolMapper schoolMapper;

    @Override
    public java.util.List<School> selectAll() {
        return schoolMapper.selectAll();
    }

    @Override
    public School selectByPrimaryKey(Integer schoolId) {
        return null;
    }

    @Override
    public int updateByPrimaryKey(School record) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer schoolId) {
        return 0;
    }

    @Override
    public int insert(School record) {
        return 0;
    }

    @Override
    public boolean save(School entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<School> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<School> entityList, int batchSize) {
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
    public boolean remove(Wrapper<School> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(School entity) {
        return false;
    }

    @Override
    public boolean update(School entity, Wrapper<School> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<School> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(School entity) {
        return false;
    }

    @Override
    public School getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<School> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<School> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public School getOne(Wrapper<School> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<School> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<School> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<School> queryWrapper) {
        return 0;
    }

    @Override
    public List<School> list(Wrapper<School> queryWrapper) {
        return null;
    }

    @Override
    public IPage<School> page(IPage<School> page, Wrapper<School> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<School> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<School> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<School> page, Wrapper<School> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<School> getBaseMapper() {
        return null;
    }
}
