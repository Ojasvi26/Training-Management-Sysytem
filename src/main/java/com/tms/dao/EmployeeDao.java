package com.tms.dao;

import java.util.List;

import org.hibernate.Session;

import com.tms.entity.Employee;

public interface EmployeeDao {
	
	public void addEmployee(Employee employee);
	
	//public List<Employee> getEmployee();
	
	public Employee getEmployeeByEmail(String email);
	
	public boolean validateEmployeeByEmail(String email);
	
}
