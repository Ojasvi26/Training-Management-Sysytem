package com.tms.util;

import com.tms.employeeService.EmployeeServiceLogin;
import com.tms.trainerService.TrainerServiceLogin;

public class ValidateUtil {
	EmployeeServiceLogin empServiceLogin = new EmployeeServiceLogin();
	TrainerServiceLogin trnServiceLogin = new TrainerServiceLogin();
	
	public boolean checkEmployeeEmail(String email)
	{
		
		boolean check = empServiceLogin.getEmail(email);
		if (!check) {
            System.out.println("Sorry, Employee is not Registered...");
            System.out.println("Please Enter registered email...\n");
            return false;
        }
		return check;
	}
	public boolean checkEmployeePassword(String email)
	{
		String password = InputUtil.strInput();
		
		boolean check = empServiceLogin.getPassword(email, password);
		if (!check) {
            System.out.println("Password does not match...\n");
            System.out.println("Re-enter your Password...\n");
            return false;
        }
		return check;
		
	}
	
	public boolean checkTrainerEmail(String email)
	{
		boolean check = trnServiceLogin.getEmail(email);
		if (!check) {
            System.out.println("Sorry, Employee is not Registered...\n");
            System.out.println("Please Enter registered email...\n");
            return false;
        }
		return check;
	}
	public boolean checkTrainerPassword(String email)
	{
		String password = InputUtil.strInput();
		boolean check = trnServiceLogin.getPassword(email, password);
		if (!check) {
            System.out.println("Password does not match...\n");
            System.out.println("Re-enter your Password...\n");
            return false;
        }
		return check;
		
	}
}
