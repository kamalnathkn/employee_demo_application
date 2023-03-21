package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Employee;
import com.example.demo.repo.employeerepo;
import com.example.demo.service.employeeservice;



@RestController
@RequestMapping("/employee")
public class employeecontroller {
	private final employeeservice employeeService;
	 private final employeerepo employeeRepo;

	 
   
	public employeecontroller(employeeservice employeeService,employeerepo employeeRepo) {
        this.employeeService = employeeService;
        this .employeeRepo= employeeRepo;
       
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees () {
     // List<Employee> employees = employeeService.findAllEmployees();
        System.out.println("in line 31");
        List<Employee> employees = employeeService.findAllEmployees();
//        List<Employee> check =new ArrayList<Employee>();
//        for(Employee em1  :employees)
//      	  {
//      	  Double idtest11 = em1.getIdtest1();
//      	
//      	 System.out.println("check11");
//      	 if(idtest11==null)
//      	  {
//      		 System.out.println("1check1");
//        double value = (idtest11 != null) ? idtest11.doubleValue() : Double.NaN;
//        em1.setIdtest1(value);
//        check.add(em1);
//      	  }}
//        System.out.println("check1");
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    @GetMapping("/all212")
    public List<Employee> displaynull() {
    	 System.out.println("in line 31");
        List<Employee> employees = employeeService.findAllEmployees();
        List<Employee> check =new ArrayList<Employee>();
//         System.out.println("check1222");
        for(Employee em1  :employees)
       	  {
//        	 System.out.println("check1666");
//        	 Double idtest11 = em1.getIdtest1();
//       	
//       	 System.out.println("check11");
//       	 if(idtest11==null)
//       	  {
//       		 System.out.println("1check1");
//         double value = (idtest11 != null) ? idtest11.doubleValue() : Double.NaN;
//         em1.setIdtest1(value);
//         check.add(em1);
//       	  }}
    	 Double idtest11 = em1.getIdtest1();
    	 System.out.println("line before if");
    	    if (idtest11 == null) {
    	        em1.setIdtest1(Double.NaN);
    	    } else {
    	        em1.setIdtest1(idtest11);
    	    }
    	    check.add(em1);
         System.out.println("check1");}
         return (check);
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
      List<Employee> employees = employeeService.findAllEmployees();
      
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
    @GetMapping("/Findbyname/{name}")
    public List<Employee> findbyname(@PathVariable String name ) {
    	System.out.println("in find by name from controller");
       return employeeRepo.findEmployeeByname(name);
       
}
    @GetMapping("/FindbyId/{id}")
    public Optional<Employee> findbyid(@PathVariable Long id ) {
       return  employeeService.findById(id);
       
}
    
    @GetMapping("/Findbyquery")
    public List<Employee> findbyquerymethod() {
       return  employeeRepo.findAllActiveUsersNative();
           
}  
//    @GetMapping("/orderby/{name}")
//    public List<Employee> findbyid(@PathVariable String name ) {
//       return  employeeRepo. findAllOrderById();
       
//}
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
//   @GetMapping("/add")
//   public  void AddEmployees () {
//	   System.out.println("in line 103");
//	   Employee employee=new Employee();
//	   List<Employee> final1= new ArrayList<Employee>();
//	   List<Employee> employees = employeeService.findAllEmployees();
//	   int count =1;
//	   for(Employee addem  :employees) {
//		 count ++;
//		 System.out.println(count);
//		 addem.setPhone("435698");
//		   System.out.println("in for loop");   
//		   System.out.println(addem.getId()); 
//			employee.setId((addem.getId()+count));
//		   employee.setEmail(addem.getEmail());
//			  employee.setEmployeeCode("2523");
//			   employee.setPhone("9434");
//			  employee.setImageUrl("www.mag1");
//			   employee.setJobTitle("tt1");
//			   employee.setName("kamal");
//		   final1.add(employee);   
//		   
////		   if (addem.getId()==1001) {
////		employee.setId((long) (1005+1));
////	 	   employee.setEmail(addem.getEmail());
////	  employee.setEmployeeCode("252345");
////	   employee.setPhone("943425");
////	  employee.setImageUrl("www.mag");
////	   employee.setJobTitle("tt");
////	   employee.setName("kamal");
////	  }
////		   employeeRepo.save(employee);
//		   System.out.println("in for loop before insert query ");  
//		   employeeRepo.saveAll(final1);
//		   System.out.println("in for loop end ");  
//		   count ++;
//		   
//	   } 
////   employeeRepo.saveAll(final1);
////	   final1.add(employee);
////	   }employeeRepo.saveAll(final1);
//   }}
    
    

@GetMapping("/add")
  public  void AddEmployees () {
	   System.out.println("in line 103");
	   Employee employee=new Employee();
	   List<Employee> final1= new ArrayList<Employee>();
	   List<Employee> employees = employeeService.findAllEmployees();
	   int count =1;
	  
	 // for(Employee addem  :employees) {
		 employee.setImageUrl(null);
		// count ++;
	 
		 System.out.println(count);
		 employee.setPhone("435698");
		   System.out.println("in for loop");   
		//   System.out.println(addem.getId()); 
		//	employee.setId((long) count);
		//   employee.setEmail(addem.getEmail());
			  employee.setEmployeeCode("2523");
			   employee.setPhone("9434");
			//  employee.setImageUrl("www.mag1");
			   employee.setJobTitle("tt1");
			   employee.setName("kamal");
		//employee.setIdtest1(7);
			 employeeRepo.save(employee);
		  // final1.add(employee);   
		   
//		   if (addem.getId()==1001) {
//		employee.setId((long) (1005+1));
//	 	   employee.setEmail(addem.getEmail());
//	  employee.setEmployeeCode("252345");
//	   employee.setPhone("943425");
//	  employee.setImageUrl("www.mag");
//	   employee.setJobTitle("tt");
//	   employee.setName("kamal");
//	  }
//		   employeeRepo.save(employee);
		   System.out.println("in for loop before insert query ");  
		   employeeRepo.saveAll(final1);
		   System.out.println("in for loop end ");  
		   count ++;
		   
	   } 
//  employeeRepo.saveAll(final1);
//	   final1.add(employee);
//	   }employeeRepo.saveAll(final1);
  }

    
