package ru.maxima.spring.aop.task2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ru.maxima.spring.aop.task2.aspect.LoggingAspect;
import ru.maxima.spring.aop.task2.aspect.TransactionAspect;
import ru.maxima.spring.aop.task2.aspect.ValidationAspect;
import ru.maxima.spring.aop.task2.service.DataService;
import ru.maxima.spring.aop.task2.service.MyService;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }

    @Bean
    public MyService myService() {
        return new MyService();
    }

    @Bean
    public ValidationAspect validationAspect() {
        return new ValidationAspect();
    }

    @Bean
    public DataService dataService() {
        return new DataService();
    }

    @Bean
    public TransactionAspect transactionAspect() {
        return new TransactionAspect();
    }

}
