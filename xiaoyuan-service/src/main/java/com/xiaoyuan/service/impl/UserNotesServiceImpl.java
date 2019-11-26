package com.xiaoyuan.service.impl;

import com.xiaoyuan.model.UserNotes;
import com.xiaoyuan.mapper.UserNotesMapper;
import com.xiaoyuan.service.IUserNotesService;
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
public class UserNotesServiceImpl extends ServiceImpl<UserNotesMapper, UserNotes> implements IUserNotesService {

}
