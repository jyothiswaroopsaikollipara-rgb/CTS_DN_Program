package com.cts.spring.main;

import com.cts.spring.config.SpringConfig;
import com.cts.spring.dependency.Car;
import com.cts.spring.service.GreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        GreetingService greetingService =
                context.getBean(GreetingService.class);

        greetingService.greet();

        Car car = context.getBean(Car.class);

        car.drive();

    }

}