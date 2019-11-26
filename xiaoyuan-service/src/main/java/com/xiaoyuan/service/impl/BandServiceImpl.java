package com.xiaoyuan.service.impl;

import com.xiaoyuan.model.Band;
import com.xiaoyuan.mapper.BandMapper;
import com.xiaoyuan.service.IBandService;
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
public class BandServiceImpl extends ServiceImpl<BandMapper, Band> implements IBandService {

}
