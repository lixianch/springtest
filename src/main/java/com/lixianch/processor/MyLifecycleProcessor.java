package com.lixianch.processor;

import org.springframework.context.LifecycleProcessor;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * created by lixianch on 2023/2/16
 */
@Component
public class MyLifecycleProcessor implements SmartLifecycle {

    @Override
    public void start() {
        System.out.println("start life cycle");
    }

    @Override
    public void stop() {
        System.out.println("stop life cycle");
    }

    @Override
    public boolean isRunning() {
        return false;
    }

    public int getPhase() {
        return 1;
    }
//    @Override
//    public void onRefresh() {
//        System.out.println("on refresh life cycle processor");
//    }
//
//    @Override
//    public void onClose() {
//        System.out.println("on close life cycle processor");
//    }
}
