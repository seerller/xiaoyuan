package com.xiaoyuan.service;

import com.xiaoyuan.model.Order;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
public interface IOrderService extends IService<Order> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_order
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int deleteByPrimaryKey(Integer orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_order
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_order
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    Order selectByPrimaryKey(Integer orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_order
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    List<Order> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_order
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int updateByPrimaryKey(Order record);

    List<Order> selectOrders();

}
