package com.cognizant.springlearn.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.bean.Employee;

@Repository
public class EmployeeDao {

    private ApplicationContext context =
            new ClassPathXmlApplicationContext("employee.xml");

    public Employee getEmployee() {

        return context.getBean("employee", Employee.class);
    }
}