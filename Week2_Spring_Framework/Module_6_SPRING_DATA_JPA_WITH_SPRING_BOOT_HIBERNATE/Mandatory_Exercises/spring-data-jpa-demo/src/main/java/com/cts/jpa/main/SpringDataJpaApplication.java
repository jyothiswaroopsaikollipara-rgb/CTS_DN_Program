package com.cts.jpa.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.cts.jpa.entity.Employee;
import com.cts.jpa.service.EmployeeService;

@SpringBootApplication(scanBasePackages = "com.cts.jpa")
@EntityScan(basePackages = "com.cts.jpa.entity")
@EnableJpaRepositories(basePackages = "com.cts.jpa.repository")

public class SpringDataJpaApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringDataJpaApplication.class, args);

    }

   @Bean
CommandLineRunner run(EmployeeService employeeService) {

    return args -> {

        // CREATE
        Employee employee = new Employee("Swaroop", "IT");
        employeeService.saveEmployee(employee);

        System.out.println("\n===== Employee Created =====");

        // READ
        System.out.println("\n===== Employee List =====");

        employeeService.getAllEmployees()
                .forEach(System.out::println);

        // UPDATE
        employeeService.updateEmployee(1L, "HR");

        System.out.println("\n===== After Update =====");

        employeeService.getAllEmployees()
                .forEach(System.out::println);

        // DELETE
        employeeService.deleteEmployee(1L);

        System.out.println("\n===== After Delete =====");

        employeeService.getAllEmployees()
                .forEach(System.out::println);
    };
}
    }
