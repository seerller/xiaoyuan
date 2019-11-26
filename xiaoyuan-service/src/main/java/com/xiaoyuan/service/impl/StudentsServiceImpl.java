package com.xiaoyuan.service.impl;

import com.xiaoyuan.model.Students;
import com.xiaoyuan.mapper.StudentsMapper;
import com.xiaoyuan.service.IStudentsService;
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
public class StudentsServiceImpl extends ServiceImpl<StudentsMapper, Students> implements IStudentsService {

}
