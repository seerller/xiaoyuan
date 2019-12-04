package com.xiaoyuan.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoyuan.model.Students;
import com.xiaoyuan.mapper.StudentsMapper;
import com.xiaoyuan.service.IStudentsService;
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
public class StudentsServiceImpl implements IStudentsService {

    @Override
    public int deleteByPrimaryKey(Integer studentId) {
        return 0;
    }

    @Override
    public int insert(Students record) {
        return 0;
    }

    @Override
    public Students selectByPrimaryKey(Integer studentId) {
        return null;
    }

    @Override
    public List<Students> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Students record) {
        return 0;
    }

    @Override
    public List<Students> selectStudents() {
        return null;
    }

    @Override
    public int changeStudentsSchool(Students schoolname) {
        return 0;
    }

    @Override
    public int changeStudentsClass(Students classname) {
        return 0;
    }

    @Override
    public boolean save(Students entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<Students> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Students> entityList, int batchSize) {
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
    public boolean remove(Wrapper<Students> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(Students entity) {
        return false;
    }

    @Override
    public boolean update(Students entity, Wrapper<Students> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Students> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Students entity) {
        return false;
    }

    @Override
    public Students getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<Students> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<Students> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public Students getOne(Wrapper<Students> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Students> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Students> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<Students> queryWrapper) {
        return 0;
    }

    @Override
    public List<Students> list(Wrapper<Students> queryWrapper) {
        return null;
    }

    @Override
    public IPage<Students> page(IPage<Students> page, Wrapper<Students> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<Students> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<Students> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<Students> page, Wrapper<Students> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<Students> getBaseMapper() {
        return null;
    }
}
