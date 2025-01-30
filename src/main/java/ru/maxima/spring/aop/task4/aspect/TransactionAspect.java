package ru.maxima.spring.aop.task4.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionAspect {

    @Around("execution(* ru.maxima.spring.aop.task4.service.*.*(..))")
    public Object manageTransaction(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Начало транзакции");
        Object result;
        try {
            result = joinPoint.proceed();
            System.out.println("Подтверждение транзакции");
        } catch (Exception e) {
            System.out.println("Откат транзакции");
            throw e;
        }
        return result;
    }
}
