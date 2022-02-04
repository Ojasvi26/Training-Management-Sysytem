package EmployeeService;

import java.util.List;

import DAO.EmployeeDAOImpl;
import Entity.Employee;

public class EmployeeServiceRegistration {
	EmployeeDAOImpl dao = new EmployeeDAOImpl();
	
	public String addEmployeeInfo
	(String firstName, String lastName, String email, String password) {
		
		Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setEmail(email);
		employee.setPassword(password);
		dao.addEmployee(employee);
		return "Employee Added Successfully";
		
	}
	public List<Employee> employeeList(){
		return dao.getEmployee();
	}
	
}
