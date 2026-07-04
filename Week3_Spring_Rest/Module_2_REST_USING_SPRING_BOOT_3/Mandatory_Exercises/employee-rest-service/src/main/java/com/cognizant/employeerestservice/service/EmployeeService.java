package com.cognizant.employeerestservice.service;

import com.cognizant.employeerestservice.bean.Employee;
import com.cognizant.employeerestservice.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }
}