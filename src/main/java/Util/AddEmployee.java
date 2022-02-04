package Util;

import EmployeeService.EmployeeServiceRegistration;

public class AddEmployee {
	EmployeeServiceRegistration empServiceRegistration = new EmployeeServiceRegistration();
	
	public void add()
	{
		empServiceRegistration.
		addEmployeeInfo("Ojasvi", "Hardas", "ojasvi@gmail.com", "qwerty");
		empServiceRegistration.
		addEmployeeInfo("Ruchika", "Gandhe", "ruchika@gmail.com", "qwerty");
		empServiceRegistration.
		addEmployeeInfo("Ritu", "Burman", "ritu@gmail.com", "qwerty");
		empServiceRegistration.
		addEmployeeInfo("Vibhanshu", "Chawla", "vibhanshu@gmail.com", "qwerty");
		empServiceRegistration.
		addEmployeeInfo("Tom", "Jerry", "tom@gmail.com", "qwerty");
	}
}
