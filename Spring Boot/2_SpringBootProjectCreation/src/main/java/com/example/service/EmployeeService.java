package com.example.service;

import com.example.bean.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee createEmp(Employee emp); // emp is Employee class OBJECT

    public Employee updateEmp(Integer id , Employee emp);
    public void deleteEmp(Integer id);
    public Employee getEmpById(Integer id);

//
//    public List<Employee> getAllEmp();


}
