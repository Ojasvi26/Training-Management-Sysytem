package com.tms.view;

import com.tms.dao.EmployeeDao;
import com.tms.dao.EmployeeDaoImpl;
import com.tms.employeeService.EmployeeServiceLogin;
import com.tms.util.InputUtil;
import com.tms.util.ValidateUtil;

public class EmpRegisterLoginDisplay {
	EmployeeServiceLogin empServiceLogin = new EmployeeServiceLogin();
	EmployeeDao empdao = new EmployeeDaoImpl();
	ValidateUtil validateUtil = new ValidateUtil();

	public void display() {
		while (true) {
			System.out.println("1-Register");
			System.out.println("2-Login");
			System.out.println("0- Go Back");
			int ch = InputUtil.intInput();

			switch (ch) {
			case 1:
				InputUtil.employeeRegisterDetails();
				break;
			case 2:
				loginDisplay();
				break;
			case 0:
				return;
			default:
				System.out.println("Invalid Option");
			}
		}
	}

	public void loginDisplay() {
		String email;
		System.out.println("Enter the details: \n");
		while (true) {
			System.out.println("Email- ");
			email = InputUtil.strInput();
			
			boolean check=validateUtil.checkEmployeeEmail(email);
			if(check) {
				break;
			}
		}
		while(true) {
			System.out.println("Password- ");
			boolean check=validateUtil.checkEmployeePassword(email);
			if(check) {
				break;
			}
		}
		

		System.out.println("You are logged in successfully...");

		System.out.println("This is your Dashboard"); //

		while (true) {
			System.out.println("1: View Batch info");
			System.out.println("2: Calendar");
			System.out.println("0: Logout-");
			int ch = InputUtil.intInput();

			switch (ch) {
			case 1:
				System.out.println("This Batch info");
				break;
			case 2:
				System.out.println("Calendar");
				break;
			case 0:
				System.out.println("You have been logged out successfully...");
				return;
			default:
				System.out.println("Invalid choice");

			}
		}
	}
}
