package com.cognizant.employeerestservice.dao;

import com.cognizant.employeerestservice.bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao {

    @SuppressWarnings("unchecked")
    public List<Employee> getAllEmployees() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("employee.xml");

        return (List<Employee>) context.getBean("employeeList");
    }
}