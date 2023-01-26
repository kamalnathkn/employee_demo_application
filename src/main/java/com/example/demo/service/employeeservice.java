package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.employeerepo;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.UUID;
@Service
@Transactional

public class employeeservice {
	 private final employeerepo employeeRepo;

	    @Autowired
	    public employeeservice(employeerepo employeeRepo) {
	        this.employeeRepo = employeeRepo;
	    }

	   
	    public List<Employee> findAllEmployees() {
	        return employeeRepo.findAll();
	    }

	    public Employee updateEmployee(Employee employee) {
	        return employeeRepo.save(employee);
	    }

	    

	    public void deleteEmployee(Long id){
	        employeeRepo.deleteEmployeeById(id);
	    }
	}

