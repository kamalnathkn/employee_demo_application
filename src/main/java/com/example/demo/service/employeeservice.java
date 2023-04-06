package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Employee;
import com.example.demo.repo.employeerepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

//import javax.persistence.Query;
import jakarta.persistence.Query;
import java.util.List;
import java.util.Optional;



@Service
@Transactional

public class employeeservice {
	 private final employeerepo employeeRepo;

	    @PersistenceContext
	    private EntityManager entityManager;
	    
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
	    
	    public Optional<Employee> findById(Long id){
	        return employeeRepo.findById(id);
	    }
	    
	    public String tocheck(){
	        return "insevicelayer";
	    }
	   public List<Employee> queryexecution()
	   {
		   String sql = "SELECT * FROM EMPLOYEE";
		   Query query = entityManager.createNativeQuery(sql);
		   return query.getResultList();
	   }
	}

