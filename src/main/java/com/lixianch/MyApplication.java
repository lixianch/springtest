package com.lixianch;

import com.lixianch.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * created by lixianch on 2023/2/14
 */
public class MyApplication {
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        context.registerShutdownHook();
        OrderService bean = context.getBean(OrderService.class);
        bean.queryOrder("PO20230214251002");
//        Thread.sleep(60000);
    }
}
