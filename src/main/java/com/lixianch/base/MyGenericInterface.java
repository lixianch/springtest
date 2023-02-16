package com.lixianch.base;

import org.springframework.core.GenericTypeResolver;

import java.lang.reflect.Type;

/**
 * created by lixianch on 2023/2/15
 */
public class MyGenericInterface {
    class Food{
        private String foodName;
    }
    interface Eat<T> {
        void eat(T thing);
    }
    interface  Run {
        void run();
    }

    class Dog implements Eat<Food>,Run {

        @Override
        public void eat(Food thing) {

        }

        @Override
        public void run() {

        }
    }

    public static void main(String[] args) {
//        Class<Dog> dogClass = Dog.class;
//        Type[] types = dogClass.getGenericInterfaces();
//        Class<?>[] itfs = dogClass.getInterfaces();
//        System.out.println("types=" + types + "itfs=" + itfs);
        Class<?> aClass = GenericTypeResolver.resolveTypeArgument(Dog.class, Eat.class);
        System.out.println(aClass);
    }
}
