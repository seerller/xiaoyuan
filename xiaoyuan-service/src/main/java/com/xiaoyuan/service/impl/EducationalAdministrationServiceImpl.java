package com.xiaoyuan.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoyuan.model.EducationalAdministration;
import com.xiaoyuan.mapper.Educational_administrationMapper;
import com.xiaoyuan.service.IEducationalAdministrationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoyuan.tools.MessageBean;
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
public class EducationalAdministrationServiceImpl implements IEducationalAdministrationService {
    @Autowired
    EducationalAdministrationServiceImpl educationalAdministrationService;

    @Override
    public int updateByPrimaryKey(EducationalAdministration record) {
        return 0;
    }

    @Override
    public List<Educational_administrationMapper> selectCource() {
        return null;
    }

    @Override
    public EducationalAdministration selectCourceByCourceId(Integer courceId) {
        return null;
    }

    @Override
    public int addCource(EducationalAdministration record) {
        return 0;
    }

    @Override
    public int updateCource(EducationalAdministration record) {
        return 0;
    }

    @Override
    public int deleteCourceByTeachername(EducationalAdministration teachername) {
        return 0;
    }

    @Override
    public boolean save(EducationalAdministration entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<EducationalAdministration> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<EducationalAdministration> entityList, int batchSize) {
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
    public boolean remove(Wrapper<EducationalAdministration> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(EducationalAdministration entity) {
        return false;
    }

    @Override
    public boolean update(EducationalAdministration entity, Wrapper<EducationalAdministration> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<EducationalAdministration> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(EducationalAdministration entity) {
        return false;
    }

    @Override
    public EducationalAdministration getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<EducationalAdministration> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<EducationalAdministration> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public EducationalAdministration getOne(Wrapper<EducationalAdministration> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<EducationalAdministration> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<EducationalAdministration> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<EducationalAdministration> queryWrapper) {
        return 0;
    }

    @Override
    public List<EducationalAdministration> list(Wrapper<EducationalAdministration> queryWrapper) {
        return null;
    }

    @Override
    public IPage<EducationalAdministration> page(IPage<EducationalAdministration> page, Wrapper<EducationalAdministration> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<EducationalAdministration> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<EducationalAdministration> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<EducationalAdministration> page, Wrapper<EducationalAdministration> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<EducationalAdministration> getBaseMapper() {
        return null;
    }
}
