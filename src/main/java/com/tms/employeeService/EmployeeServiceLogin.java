package com.tms.employeeService;

import com.tms.dao.EmployeeDaoImpl;
import com.tms.entity.Employee;

public class EmployeeServiceLogin {
	EmployeeDaoImpl dao = new EmployeeDaoImpl();
	
	public boolean getEmail(String email) {
		return dao.validateEmployeeByEmail(email);
		
	}
	public boolean getPassword(String email,String password) {
		Employee e=dao.getEmployeeByEmail(email);
		if(password.equals(e.getPassword()))
			return true;
		else
			return false;
	}
}
