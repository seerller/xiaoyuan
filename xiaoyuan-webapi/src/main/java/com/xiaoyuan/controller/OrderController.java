package com.xiaoyuan.controller;


import com.xiaoyuan.controller.common.BaseController;
import com.xiaoyuan.model.Order;
import com.xiaoyuan.service.impl.OrderServiceImpl;
import com.xiaoyuan.tools.MessageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
@Api(value = "/Order", description = "订单管理模块")
@RestController
@RequestMapping("/mapper/order")
public class OrderController extends BaseController {
    @Autowired
    OrderServiceImpl orderService;
    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    @ApiOperation(value = "查询所有订单信息", notes = "查询所有订单信息")
    public MessageBean selectAll(){
        return selectAll();
    }
    @RequestMapping(value = "/selectOrders", method = RequestMethod.GET)
    @ApiOperation(value = "查看订单", notes = "查看订单")
    public MessageBean selectOrders(){
        return selectOrders();
    }
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation(value = "新增订单", notes = "新增订单")
    public void insert(Order record){
        orderService.insert(record);
    }
    @RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
    @ApiOperation(value = "修改订单", notes = "修改订单")
    public void updateByPrimaryKey(Order record){
        orderService.updateByPrimaryKey(record);
    }
    @RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.POST)
    @ApiOperation(value = "删除订单", notes = "删除订单")
    public void  deleteByPrimaryKey(Integer orderId){
        orderService.deleteByPrimaryKey(orderId);
    }

}
