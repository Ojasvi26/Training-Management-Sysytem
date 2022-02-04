package Util;

import EmployeeService.EmployeeServiceLogin;

public class ValidateUtil {
	EmployeeServiceLogin empServiceLogin = new EmployeeServiceLogin();
	
	public boolean checkEmail()
	{
		String email = InputUtil.strInput();
		boolean check = empServiceLogin.getEmail(email);
		if (!check) {
            System.out.println("Sorry, Employee is not Registered...\n");
            System.out.println("Please Enter registered email...\n");
            return false;
        }
		return check;
	}
	public boolean checkPassword()
	{
		String password = InputUtil.strInput();
		boolean check = empServiceLogin.getPassword(password);
		if (!check) {
            System.out.println("Password does not match...\n");
            System.out.println("Re-enter your Password...\n");
            return false;
        }
		return check;
		
	}
}
