package com.cts.jpa.service;

import com.cts.jpa.entity.Employee;
import com.cts.jpa.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Create
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Read
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Update
    public Employee updateEmployee(Long id, String department) {

        Employee employee = employeeRepository.findById(id).orElse(null);

        if (employee != null) {
            employee.setDepartment(department);
            return employeeRepository.save(employee);
        }

        return null;
    }

    // Delete
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}