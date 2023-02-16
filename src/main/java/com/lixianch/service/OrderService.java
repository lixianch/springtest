package com.lixianch.service;

import com.lixianch.dao.OrderMapper;
import com.lixianch.entity.OrderDO;
import org.springframework.context.Lifecycle;
import org.springframework.context.LifecycleProcessor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * created by lixianch on 2023/2/14
 */
@Service
public class OrderService {
    @Resource
    private OrderMapper orderMapper;

    public void queryOrder(String orderNo){
        OrderDO orderDO = orderMapper.queryOrderByNo(orderNo);
        System.out.println("erpNo=" + orderDO.getErpNo());
    }

}
