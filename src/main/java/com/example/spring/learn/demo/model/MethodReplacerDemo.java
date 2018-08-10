package com.example.spring.learn.demo.model;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class MethodReplacerDemo implements MethodReplacer {

    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("I am a replacer ^_^ .");
        return null;
    }
}
