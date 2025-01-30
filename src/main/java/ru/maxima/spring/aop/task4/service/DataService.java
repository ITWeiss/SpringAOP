package ru.maxima.spring.aop.task4.service;

import org.springframework.stereotype.Component;

@Component
public class DataService {
    public void processData(String data) {
        System.out.println("Обработка данных: " + data);
    }
}
