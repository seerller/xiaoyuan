package com.xiaoyuan.service.impl;

import com.xiaoyuan.model.UserInfo;
import com.xiaoyuan.mapper.UserInfoMapper;
import com.xiaoyuan.service.IUserInfoService;
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
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
