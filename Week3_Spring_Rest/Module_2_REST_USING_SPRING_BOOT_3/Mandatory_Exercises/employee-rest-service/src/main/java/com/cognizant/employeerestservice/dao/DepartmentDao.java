package com.cognizant.employeerestservice.dao;

import com.cognizant.employeerestservice.bean.Department;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentDao {

    @SuppressWarnings("unchecked")
    public List<Department> getAllDepartments() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("employee.xml");

        return (List<Department>) context.getBean("departmentList");
    }
}