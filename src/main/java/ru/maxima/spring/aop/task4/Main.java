package ru.maxima.spring.aop.task4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ru.maxima.spring.aop.task4.service.DataService;
import ru.maxima.spring.aop.task4.service.MyService;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        MyService service = context.getBean(MyService.class);
        service.doSomething();

        DataService service1 = context.getBean(DataService.class);
        service1.processData("Тестовые данные");
//        service1.processData(""); // Должно выбросить исключение

        context.close();

    }
}