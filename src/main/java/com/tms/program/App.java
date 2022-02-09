package com.tms.program;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tms.entity.Employee;

import static com.tms.util.HibernateUtil.getSessionFactory;

import com.tms.view.HomeDisplay;

public class App {
	public static void main(String[] args) {
				
		HomeDisplay hd = new HomeDisplay();
		hd.homeDisplay();
		
	}
}
