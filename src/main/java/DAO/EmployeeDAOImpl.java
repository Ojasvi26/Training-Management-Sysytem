package DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private static Map<Integer, Employee> eMap = new HashMap<Integer, Employee>();
	private static int empId=0;
	
	@Override
	public void addEmployee(Employee employee) {
		employee.setId(empId);
		eMap.put(empId++, employee);
	}
	
	@Override
	public List<Employee> getEmployee() {
		List<Employee> empList = new ArrayList<Employee>();
		for (int id : eMap.keySet()) {
            empList.add(eMap.get(id));
        }
		return empList;
	}
	@Override
	public boolean mail(String email) {
		for (int id : eMap.keySet()) {
            if (eMap.get(id).getEmail().equals(email))
               return true;
        }
	return false;
	}
	@Override
	public boolean pass(String password) {
		for (int id : eMap.keySet()) {
            if (eMap.get(id).getPassword().equals(password))
               return true;
        }
		return false;
	}
}
