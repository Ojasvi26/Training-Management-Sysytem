package EmployeeService;

import DAO.EmployeeDAOImpl;

public class EmployeeServiceLogin {
	EmployeeDAOImpl dao = new EmployeeDAOImpl();
	public boolean getEmail(String email) {
		return dao.mail(email);
	}
	public boolean getPassword(String password) {
		return dao.pass(password);
	}
}
