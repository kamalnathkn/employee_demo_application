package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Employee;

import jakarta.persistence.Entity;

public interface employeerepo extends JpaRepository<Employee, Long> {

	

	List<Employee> findAll();

	Employee save(Employee employee);

	Object findEmployeeById(Long id);

	void deleteEmployeeById(Long id);


}
