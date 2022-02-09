package com.tms.view;

import com.tms.util.DisplayUtil;
import com.tms.util.InputUtil;

public class HomeDisplay {
	
	public void homeDisplay() {
		EmpRegisterLoginDisplay erl = new EmpRegisterLoginDisplay();
		TrnRegisterLoginDisplay trl = new TrnRegisterLoginDisplay();
		DisplayUtil displayUtil = new DisplayUtil();
		while (true) {
			System.out.println("Enter the option:");
			System.out.println("1- Trainer");
			System.out.println("2- Employee");
			//System.out.println("3- Registered Employee List");
			System.out.println("0- Exit");
			System.out.println();
			int ch = InputUtil.intInput();

			switch (ch) {
			case 1:
				trl.display();
				break;
			case 2:
				erl.display();
				break;
//			case 3:
//					displayUtil.displayEmployeeList();
//					break;
			case 0:
				System.out.println("Thank You, Bye!");
				return;
			default:
				System.out.println("Please Enter a valid choice...\n");
			}
		}
	}

}
