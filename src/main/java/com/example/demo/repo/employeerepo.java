
package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Employee;
@Repository
public interface employeerepo extends JpaRepository<Employee, Long> {

	

	List<Employee> findAll();

	

	Object findEmployeeById(Long id);

	void deleteEmployeeById(Long id);
	


   // List<Employee> findBynameOrderByidAsc(String name);
  
	List<Employee> findEmployeeByname(String name);
	
	@Query(value = "SELECT * FROM Employee u ", 
			  nativeQuery = true)
			List<Employee> findAllActiveUsersNative();


	

}
