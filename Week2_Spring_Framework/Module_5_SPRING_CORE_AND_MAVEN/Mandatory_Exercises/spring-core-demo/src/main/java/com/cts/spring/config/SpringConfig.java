package com.cts.spring.config;

import com.cts.spring.dependency.Car;
import com.cts.spring.dependency.Engine;
import com.cts.spring.service.GreetingService;
import com.cts.spring.service.GreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public GreetingService greetingService() {

        return new GreetingServiceImpl();

    }
     @Bean
    public Engine engine() {

        return new Engine();

    }

    @Bean
    public Car car() {

        return new Car(engine());

    }
}