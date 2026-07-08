package com.cognizant.springlearn.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.bean.Department;

@Repository
public class DepartmentDao {

    private ApplicationContext context =
            new ClassPathXmlApplicationContext("employee.xml");

    public Department getDepartment() {

        return context.getBean("department", Department.class);
    }
}