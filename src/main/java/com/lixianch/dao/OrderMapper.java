package com.lixianch.dao;

import com.lixianch.entity.OrderDO;
import org.springframework.stereotype.Repository;

/**
 * created by lixianch on 2023/2/14
 */
@Repository
public class OrderMapper {
    public OrderDO queryOrderByNo(String poNO){
        OrderDO orderDO = new OrderDO();
        orderDO.setOrderNo(poNO);
        orderDO.setErpNo(poNO + "erp");
        return orderDO;
    }
}
