package com.example.controller;

import com.example.bean.Employee;
import com.example.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empapi")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
     @PostMapping("/add")
//    public String addEmp(@RequestBody Employee emp){
//
//        employeeService.createEmp(emp);  // data collected by @RequestBody
//        return "Employee Added Successfully";
//    }

    public ResponseEntity<Employee> addEmp(@Valid @RequestBody Employee emp){

        Employee employee = employeeService.createEmp(emp);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmpById(@PathVariable Integer id) {
        Employee employee = employeeService.getEmpById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmp(@PathVariable Integer id, @RequestBody Employee emp) {
        Employee employee = employeeService.updateEmp(id, emp);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmp(@PathVariable Integer id) {
        employeeService.deleteEmp(id);
        return new ResponseEntity<>("Employee Deleted Successfully", HttpStatus.OK);
    }

//    @GetMapping("/viewlall")
//    public ResponseEntity<List<Employee>> getAllEmps() {
//
//    }
}
