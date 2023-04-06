package com.example.demo.model;
//
//import java.io.Serializable;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//@Entity
//public class Employee implements Serializable {
//   @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//   @Column(nullable = false, updatable = true)
//    private Long id;
//   @Column 
//   private String name;
//   @Column 
//   private String email;
//   @Column 
//   private String jobTitle;
//   @Column 
//   private String phone;
//   @Column
//   private String imageUrl;
//   @Column
//    private String employeeCode;
//  // @Column(nullable = true)
//   int idtest;
//  
//
//@Column(nullable = false)
//   double idtest1;
// 
//public Employee()
//{}
//public Employee(Long id, String name, String email, String jobTitle, String phone, String imageUrl, String employeeCode,
//		int idtest, double idtest1) {
//	
//	this.id = id;
//	this.name = name;
//	this.email = email;
//	this.jobTitle = jobTitle;
//	this.phone = phone;
//	this.imageUrl = imageUrl;
//	this.employeeCode = employeeCode;
//	this.idtest = idtest;
//	this.idtest1 = idtest1;
//}
//    public int getIdtest() {
//	return idtest;
//}
//
//public void setIdtest(int idtest) {
//	this.idtest = idtest;
//}
//
//public double getIdtest1() {
//	return idtest1;
//}
//
//public void setIdtest1(double idtest1) {
//	this.idtest1 = idtest1;
//}
//
//    public Long getId() {
//        return id;
//    }
//    public void setId(Long id) {
//        this.id = id ;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getJobTitle() {
//        return jobTitle;
//    }
//
//    public void setJobTitle(String jobTitle) {
//        this.jobTitle = jobTitle;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getImageUrl() {
//        return imageUrl;
//    }
//
//    public void setImageUrl(String imageUrl) {
//        this.imageUrl = imageUrl;
//    }
//
//    public String getEmployeeCode() {
//        return employeeCode;
//    }
//
//    public void setEmployeeCode(String employeeCode) {
//        this.employeeCode = employeeCode;
//    }
//
//    @Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", jobTitle=" + jobTitle + ", phone="
//				+ phone + ", imageUrl=" + imageUrl + ", employeeCode=" + employeeCode + ", idtest=" + idtest
//				+ ", idtest1=" + idtest1 + "]";
//	}
//}

//
import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = true)
    private Long id;
    @Column 
    private String name;
    @Column 
    private String email;
    @Column 
    private String jobTitle;
    @Column 
    private String phone;
    @Column
    private String imageUrl;
    @Column
    private String employeeCode;
    @Column(nullable = false)
    private int idtest;
    @Column
    private double idtest1;
    
    public Employee() {}
    
    public Employee(Long id, String name, String email, String jobTitle, String phone, String imageUrl, String employeeCode,
    		int idtest, double idtest1) {	
    	this.id = id;
    	this.name = name;
    	this.email = email;
    	this.jobTitle = jobTitle;
    	this.phone = phone;
    	this.imageUrl = imageUrl;
    	this.employeeCode = employeeCode;
    	this.idtest = idtest;
    	this.idtest1 = idtest1;
    }
    
    public int getIdtest() {
    	return idtest;
    }
    
    public void setIdtest(int idtest) {
    	this.idtest = idtest;
    }
    
    public double getIdtest1() {
    	return idtest1;
    }
    
    public void setIdtest1(double idtest1) {
    	this.idtest1 = idtest1;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", jobTitle=" + jobTitle + ", phone="
				+ phone + ", imageUrl=" + imageUrl + ", employeeCode=" + employeeCode + ", idtest=" + idtest
				+ ", idtest1=" + idtest1 + "]";
	}
}
