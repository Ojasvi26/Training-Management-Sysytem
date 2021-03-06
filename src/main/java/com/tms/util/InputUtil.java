package com.tms.util;

import java.util.Scanner;

import com.tms.employeeService.EmployeeServiceRegistration;
import com.tms.trainerService.TrainerServiceRegisteration;
import com.tms.util.InputUtil;

public class InputUtil {
	public static int intInput() {
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			int n = Integer.parseInt(str);
			return n;
		} catch (Exception e) {
			return -1;
		}
	}

	public static String strInput() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		return str;
	}

	public static void employeeRegisterDetails() {
		
		System.out.println("Enter the details: ");
		System.out.println("Enter your Employee Id- ");
		int id = InputUtil.intInput();
		System.out.println("Enter your First Name- ");
		String firstName = InputUtil.strInput();
		System.out.println("Enter your Last Name- ");
		String lastName = InputUtil.strInput();
		System.out.println("Email- ");
		String email = InputUtil.strInput();
		while (true) {
			System.out.println("Password- ");
			String password = InputUtil.strInput();
			System.out.println("Confirm Password- ");
			String confirmPassword = InputUtil.strInput();
			if (!confirmPassword.equals(password)) {
				System.out.println("----------Passwords does not match------------");
				System.out.println("Re-enter:");

			} else {
			
				System.out.println("correct");
				EmployeeServiceRegistration employeeServiceRegiteration = 
						new EmployeeServiceRegistration();
				String msg = employeeServiceRegiteration.
						addEmployeeInfo(id,firstName, lastName, email, password);
				System.out.println(msg);
				break;
			}

		}
	}
		public static void trainerRegisterDetails() {

			System.out.println("Enter the details: ");
			System.out.println("Enter your Trainer Id- ");
			int id = InputUtil.intInput();
			System.out.println("Enter your First Name- ");
			String firstName = InputUtil.strInput();
			System.out.println("Enter your Last Name- ");
			String lastName = InputUtil.strInput();
			System.out.println("Email- ");
			String email = InputUtil.strInput();
			while (true) {
				System.out.println("Password- ");
				String password = InputUtil.strInput();
				System.out.println("Confirm Password- ");
				String confirmPassword = InputUtil.strInput();
				if (!confirmPassword.equals(password)) {
					System.out.println("----------Passwords does not match------------");
					System.out.println("Re-enter:");

				} else {
				
					System.out.println("correct");
					TrainerServiceRegisteration trainerServiceRegisteration = 
							new TrainerServiceRegisteration();
					String msg = trainerServiceRegisteration.
							addTrainerInfo(id,firstName, lastName, email, password);
					System.out.println(msg);
					break;
				}

			}

	}
}


