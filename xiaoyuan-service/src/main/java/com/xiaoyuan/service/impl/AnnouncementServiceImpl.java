package com.xiaoyuan.service.impl;

import com.xiaoyuan.model.Announcement;
import com.xiaoyuan.mapper.AnnouncementMapper;
import com.xiaoyuan.service.IAnnouncementService;
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
public class AnnouncementServiceImpl extends ServiceImpl<AnnouncementMapper, Announcement> implements IAnnouncementService {

}
