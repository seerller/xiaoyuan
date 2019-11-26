package com.xiaoyuan.service.impl;

import com.xiaoyuan.model.Staff;
import com.xiaoyuan.mapper.StaffMapper;
import com.xiaoyuan.service.IStaffService;
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
public class StaffServiceImpl extends ServiceImpl<StaffMapper, Staff> implements IStaffService {

}
