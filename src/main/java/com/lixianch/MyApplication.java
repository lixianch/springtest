package com.lixianch;

import com.lixianch.service.ClassService;
import com.lixianch.service.OrderService;
import com.lixianch.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * created by lixianch on 2023/2/14
 */
public class MyApplication {
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
//        context.registerShutdownHook();
//        OrderService bean = context.getBean(OrderService.class);
//        bean.queryOrder("PO20230214251002");
//        Thread.sleep(60000);
//        ClassService bean = context.getBean(ClassService.class);
//        bean.say();
//        bean = context.getBean(ClassService.class);
//        bean.say();
//        bean.say();

//        ClassService.say();
//        ClassService.say();

        StudentService bean = context.getBean(StudentService.class);
        bean.say();
    }
}
