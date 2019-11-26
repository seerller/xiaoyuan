package com.xiaoyuan.service.impl;

import com.xiaoyuan.model.News;
import com.xiaoyuan.mapper.NewsMapper;
import com.xiaoyuan.service.INewsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements INewsService {

}
