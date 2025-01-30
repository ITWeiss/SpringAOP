package ru.maxima.spring.aop.task4.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidationAspect {

    @Before("execution(* ru.maxima.spring.aop.task4.service.DataService.processData(..)) && args(data)")
    public void validateInput(JoinPoint joinPoint, String data) {
        if (data == null || data.trim().isEmpty()) {
            throw new IllegalArgumentException("Входные данные не могут быть пустыми");
        }
        System.out.println("Данные успешно проверены: " + data);
    }
}
