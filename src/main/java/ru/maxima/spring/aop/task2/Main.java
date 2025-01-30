package ru.maxima.spring.aop.task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.maxima.spring.aop.task2.config.AppConfig;
import ru.maxima.spring.aop.task2.service.DataService;
import ru.maxima.spring.aop.task2.service.MyService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService service = context.getBean(MyService.class);
        service.doSomething();

        DataService service1 = context.getBean(DataService.class);
        service1.processData("Тестовые данные");
//      service1.processData(""); // Должно выбросить исключение

        context.close();

    }
}