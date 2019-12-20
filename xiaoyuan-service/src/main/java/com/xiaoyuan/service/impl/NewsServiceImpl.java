package com.xiaoyuan.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoyuan.model.News;
import com.xiaoyuan.mapper.NewsMapper;
import com.xiaoyuan.service.INewsService;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
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
public class NewsServiceImpl implements INewsService {
    @Autowired
    private NewsMapper newsMapper;

    private static Logger logger = LoggerFactory.getLogger("NewsServiceImpl.class");

    @Override
    public int deleteByPrimaryKey(Integer newsId) {
        return 0;
    }

    @Override
    public int insert(News record) {
        return 0;
    }

    @Override
    public News selectByPrimaryKey(Integer newsId) {
        return null;
    }

    @Override
    public List<News> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(News record) {
        return 0;
    }

    @Override
    public List<News> selectNews() {
        return null;
    }

    @Override
    public News selectNewById(Integer newsId) {
        return null;
    }

    @Override
    public int addNews(News record) {
        return 0;
    }

    /*@Override
    public String uploadPicture(String picture) {
        News upload = new News();
        upload.setPicture(picture);
        if(upload.getPicture() == null){
            return "图片地址为空";
        }
        int rowCount = newsMapper.insertPicture(upload.getPicture());
        logger.error(rowCount + "");
        if(rowCount > 0)
            return "图片地址存储失败";{
            return "图片地址存储成功";
        }
    }*/

    @Override
    public int updateNews(Integer newsId) {
        return 0;
    }


    @Override
    public int deleteNews(Integer newsId) {
        return 0;
    }


    @Override
    public boolean save(News entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<News> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<News> entityList, int batchSize) {
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
    public boolean remove(Wrapper<News> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(News entity) {
        return false;
    }

    @Override
    public boolean update(News entity, Wrapper<News> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<News> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(News entity) {
        return false;
    }

    @Override
    public News getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<News> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<News> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public News getOne(Wrapper<News> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<News> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<News> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<News> queryWrapper) {
        return 0;
    }

    @Override
    public List<News> list(Wrapper<News> queryWrapper) {
        return null;
    }

    @Override
    public IPage<News> page(IPage<News> page, Wrapper<News> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<News> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<News> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<News> page, Wrapper<News> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<News> getBaseMapper() {
        return null;
    }
}
