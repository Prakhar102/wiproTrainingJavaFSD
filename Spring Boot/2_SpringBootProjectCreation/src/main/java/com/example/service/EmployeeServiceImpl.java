package com.example.service;

import com.example.bean.Employee;
import com.example.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;
    @Override
    public Employee createEmp(Employee emp) {

        //Call Repository method
        return employeeRepo.save(emp);
    }

    @Override
    public Employee updateEmp(Integer id, Employee emp) {
        Employee existingEmployee = employeeRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));

        existingEmployee.setFirstName(emp.getFirstName());
        return employeeRepo.save(existingEmployee);
    }

    @Override
    public void deleteEmp(Integer id) {
        Employee existingEmployee = employeeRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));

        employeeRepo.delete(existingEmployee);
    }

    @Override
    public Employee getEmpById(Integer id) {
        return employeeRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
    }
}
