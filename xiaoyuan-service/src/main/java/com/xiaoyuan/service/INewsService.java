package com.xiaoyuan.service;

import com.xiaoyuan.model.News;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
public interface INewsService extends IService<News> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_news
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int deleteByPrimaryKey(Integer newsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_news
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int insert(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_news
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    News selectByPrimaryKey(Integer newsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_news
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    List<News> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_news
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int updateByPrimaryKey(News record);

    /**
     * 查询新闻
     * @return
     */
    List<News> selectNews();

    /**
     * 查询新闻详情
     * @param newsId
     * @return
     */
    News selectNewById(Integer newsId);

    /**
     * 新增新闻
     * @param record
     * @return
     */
    int addNews(News record);


    /**
     * 修改新闻
     * @param newsId
     * @return
     */
    int updateNews(Integer newsId);


    /**
     * 删除新闻
     * @param newsId
     * @return
     */
    int deleteNews(Integer newsId);

}
