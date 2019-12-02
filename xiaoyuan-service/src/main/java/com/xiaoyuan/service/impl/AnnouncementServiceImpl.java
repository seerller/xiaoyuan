package com.xiaoyuan.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoyuan.model.Announcement;
import com.xiaoyuan.mapper.AnnouncementMapper;
import com.xiaoyuan.service.IAnnouncementService;
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
public class AnnouncementServiceImpl  implements IAnnouncementService {

    @Override
    public boolean save(Announcement entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<Announcement> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Announcement> entityList, int batchSize) {
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
    public boolean remove(Wrapper<Announcement> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(Announcement entity) {
        return false;
    }

    @Override
    public boolean update(Announcement entity, Wrapper<Announcement> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Announcement> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Announcement entity) {
        return false;
    }

    @Override
    public Announcement getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<Announcement> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<Announcement> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public Announcement getOne(Wrapper<Announcement> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Announcement> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Announcement> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<Announcement> queryWrapper) {
        return 0;
    }

    @Override
    public List<Announcement> list(Wrapper<Announcement> queryWrapper) {
        return null;
    }

    @Override
    public IPage<Announcement> page(IPage<Announcement> page, Wrapper<Announcement> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<Announcement> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<Announcement> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<Announcement> page, Wrapper<Announcement> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<Announcement> getBaseMapper() {
        return null;
    }

    @Override
    public int deleteByPrimaryKey(Integer announcementId) {
        return 0;
    }

    @Override
    public int insert(Announcement record) {
        return 0;
    }

    @Override
    public Announcement selectByPrimaryKey(Integer announcementId) {
        return null;
    }

    @Override
    public List<Announcement> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Announcement record) {
        return 0;
    }
}
