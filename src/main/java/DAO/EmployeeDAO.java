package DAO;

import java.util.List;

import Entity.Employee;

public interface EmployeeDAO {
	public void addEmployee(Employee employee);
	
	public List<Employee> getEmployee();
	
	public boolean mail(String email);
	
	public boolean pass(String password);
}
