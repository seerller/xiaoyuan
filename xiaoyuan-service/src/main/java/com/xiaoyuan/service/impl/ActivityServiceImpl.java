package com.xiaoyuan.service.impl;

import com.xiaoyuan.model.Activity;
import com.xiaoyuan.mapper.ActivityMapper;
import com.xiaoyuan.service.IActivityService;
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
public class ActivityServiceImpl extends ServiceImpl<ActivityMapper, Activity> implements IActivityService {

}
