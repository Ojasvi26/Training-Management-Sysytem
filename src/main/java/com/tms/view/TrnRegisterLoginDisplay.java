package com.tms.view;

import com.tms.trainerService.TrainerServiceLogin;
import com.tms.util.InputUtil;
import com.tms.util.ValidateUtil;

public class TrnRegisterLoginDisplay {
	TrainerServiceLogin trnServiceLogin = new TrainerServiceLogin();
	ValidateUtil validateUtil = new ValidateUtil();

	public void display() {
		while (true) {
			System.out.println("----------------------------YOU HAVE ENTERED AS A TRAINER------------------------------- ");

			System.out.println("1-Register");
			System.out.println("2-Login");
			System.out.println("0- Go Back");
			int ch = InputUtil.intInput();

			switch (ch) {
			case 1:
				InputUtil.trainerRegisterDetails();
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
		System.out.println("Enter the details: \n");
		String email;
		while (true) {
			System.out.println("Email- ");
			email = InputUtil.strInput();
			boolean check=validateUtil.checkTrainerEmail(email);
			if(check) {
				break;
			}
		}
		while(true) {
			System.out.println("Password- ");
			boolean check=validateUtil.checkTrainerPassword(email);
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
