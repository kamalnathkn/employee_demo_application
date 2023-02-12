package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
import com.example.demo.repo.employeerepo;
import com.example.demo.service.employeeservice;

import jakarta.persistence.Column;

@RestController
@RequestMapping("/employee")
public class employeecontroller {
	private final employeeservice employeeService;
	 private final employeerepo employeeRepo;
 Employee employee;
    public employeecontroller(employeeservice employeeService,employeerepo employeeRepo) {
        this.employeeService = employeeService;
        this .employeeRepo= employeeRepo;
       
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
    
    @GetMapping("/gitpush")
    public String getAllEmployees4 () {
//        List<Employee> employees = employeeService.findAllEmployees();
        System.out.println("in line 32");
        return employeeService.tocheck();
    }
    
    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        Employee updateEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }

//    @DeleteMapping("/delete/{id}")
    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
//    @GetMapping("/FindbyId/{id}")
//    public   Optional<Employee> findbyid(@PathVariable("id") Long id ) {
//       return  employeeService.findById(id);
//       
    
    @GetMapping("/FindbyId/{id}")
    public Optional<Employee> findbyid(@PathVariable Long id ) {
       return  employeeService.findById(id);
       
}
    
    @GetMapping("/all21")
    public List<Employee> getAllEmployees21 ( Employee employee) {  
	   System.out.println("in line 85");
	   List<Employee> employees1 =new ArrayList<Employee>();
	   List<Employee> employees = employeeService.findAllEmployees();
for(Employee addem  :employees) {
//if(addem.getId() ==1001)
//{
//      
//        System.out.println("in line 91");
//        
//        employees1.add(addem);
//       
//}

if(addem.getId() ==1001)
{
	System.out.println("in line 91");
	employees1.add(addem);
}
}
return employees1;
       
}
   @GetMapping("/add")
   public  void AddEmployees () {
	   System.out.println("in line 103");
	   Employee employee=new Employee();
	   List<Employee> employees = employeeService.findAllEmployees();
	   employee.setEmail("kamal@gmail.com");
	   employee.setEmployeeCode("252345");
	   employee.setPhone("94342525252");
	   employee.setImageUrl("www.mag");
	   employee.setJobTitle("tt");
	   employee.setName("kamal");
	   employeeRepo.save(employee);
	  
   }
}
