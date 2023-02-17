package com.lixianch.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

/**
 * created by lixianch on 2023/2/17
 */
@Service
//@Scope(scopeName = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
//@Scope(scopeName = "prototype")
public class StudentService {
    @Value("${studentService.slogan}")
    private String slogan;
    public void say(){
        System.out.println(this + slogan);
    }
}
