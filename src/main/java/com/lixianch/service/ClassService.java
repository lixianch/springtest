package com.lixianch.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * created by lixianch on 2023/2/17
 */
@Service
public class ClassService implements BeanFactoryAware {
//    @Resource
    private StudentService studentService;
    private static ApplicationContext context;
    private static BeanFactory beanFactory;
    public static void say(){
        beanFactory.getBean(StudentService.class).say();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.context = applicationContext;
//    }

//    @Lookup
//    public abstract StudentService getStudentService();
}
