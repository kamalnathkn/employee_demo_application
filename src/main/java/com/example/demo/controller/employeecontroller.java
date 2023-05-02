package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.employeeservice;

@RestController
@RequestMapping("/employee")
public class employeecontroller {
	private final employeeservice employeeService;

    public employeecontroller(employeeservice employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees () {
        List<Employee> employees = employeeService.findAllEmployees();
        System.out.println("in line 31");
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }


    @GetMapping("/all2")
    public List<Employee> getAllEmployees2 () {
        List<Employee> employees = employeeService.findAllEmployees();
        System.out.println("in line 33");
        return (employees);
    }
    @GetMapping("/all1")
    public String getAllEmployees1 () {
//        List<Employee> employees = employeeService.findAllEmployees();
        System.out.println("in line 32");
        return("employees1");
    }
    

    
    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        Employee updateEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
        //commit check
        //commit\
        
    }
}

