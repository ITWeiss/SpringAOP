package ru.maxima.spring.aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ru.maxima.spring.aop.aspect.LoggingAspect;
import ru.maxima.spring.aop.service.MyService;

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

}
