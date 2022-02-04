package Util;

import java.util.List;

import EmployeeService.EmployeeServiceRegistration;
import Entity.Employee;

public class DisplayUtil {
	EmployeeServiceRegistration empRegistrationService  = new EmployeeServiceRegistration();
	
	public void displayEmployeeList() {
		List<Employee> employee = empRegistrationService.employeeList();
		 if (employee.size() == 0) {
	            System.out.println("Sorry, No Employee is registered...\n");
	            return;
	        }
	       displayEmployee(employee);
	}
	public void displayEmployee(List<Employee> employee) {
		for(Employee emp : employee) {
			System.out.println("First Name - "+ emp.getFirstName());
			System.out.println("Last Name - "+ emp.getLastName());
			System.out.println("Email - "+ emp.getEmail());
			System.out.println();
		}
		  System.out.println("\n\n");
	}
}
