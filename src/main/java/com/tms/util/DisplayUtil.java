package com.tms.util;

import java.util.List;

import com.tms.employeeService.EmployeeServiceRegistration;
import com.tms.entity.Employee;
import com.tms.entity.Trainer;
import com.tms.trainerService.TrainerServiceRegisteration;

public class DisplayUtil {
	EmployeeServiceRegistration empRegistrationService  = new EmployeeServiceRegistration();
	TrainerServiceRegisteration trnRegistrationService =  new TrainerServiceRegisteration();

//		public void displayEmployeeList() {
//			List<Employee> employee = empRegistrationService.employeeList();
//			 if (employee.size() == 0) {
//		            System.out.println("Sorry, No Employee is registered...\n");
//		            return;
//		        }
//		       displayEmployee(employee);
//		}
		public void displayEmployee(List<Employee> employee) {
			for(Employee emp : employee) {
				System.out.println("First Name - "+ emp.getFirstName());
				System.out.println("Last Name - "+ emp.getLastName());
				System.out.println("Email - "+ emp.getEmail());
				System.out.println();
			}
			  System.out.println("\n\n");
		}
		
//		public void displayTrainerList() {
//			List<Trainer> trainer = trnRegistrationService.trainerList();
//			 if (trainer.size() == 0) {
//		            System.out.println("Sorry, No Employee is registered...\n");
//		            return;
//		        }
//		       displayTrainer(trainer);
//		}
		public void displayTrainer(List<Trainer> trainer) {
			for(Trainer trn : trainer) {
				System.out.println("First Name - "+ trn.getFirstName());
				System.out.println("Last Name - "+ trn.getLastName());
				System.out.println("Email - "+ trn.getEmail());
				System.out.println();
			}
			  System.out.println("\n\n");
		}
		

}
