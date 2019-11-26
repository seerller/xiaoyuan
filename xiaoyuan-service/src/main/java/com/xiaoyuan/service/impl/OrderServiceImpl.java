package com.xiaoyuan.service.impl;

import com.xiaoyuan.model.Order;
import com.xiaoyuan.mapper.OrderMapper;
import com.xiaoyuan.service.IOrderService;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
