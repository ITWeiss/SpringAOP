package ru.maxima.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.maxima.spring.aop.config.AppConfig;
import ru.maxima.spring.aop.service.MyService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService service = context.getBean(MyService.class);
        service.doSomething();
        context.close();
    }
}