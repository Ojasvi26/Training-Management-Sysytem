package com.tms.employeeService;

import java.util.List;

import com.tms.dao.EmployeeDaoImpl;
import com.tms.entity.Employee;

public class EmployeeServiceRegistration {
	EmployeeDaoImpl dao = new EmployeeDaoImpl();
	
	public String addEmployeeInfo
	(int id,String firstName, String lastName, String email, String password) {
		
		Employee employee = new Employee();
		employee.setId(id);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setEmail(email);
		employee.setPassword(password);
		dao.addEmployee(employee);
		return "Employee Added Successfully";
		
	}
	
}
