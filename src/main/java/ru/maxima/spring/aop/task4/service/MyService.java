package ru.maxima.spring.aop.task4.service;

import org.springframework.stereotype.Component;

@Component
public class MyService {
    public void doSomething() {
        System.out.println("Работа метода doSomething()");
    }
}
