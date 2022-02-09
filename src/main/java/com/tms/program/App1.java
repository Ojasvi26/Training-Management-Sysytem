package com.tms.program;

import static com.tms.util.HibernateUtil.getSessionFactory;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tms.entity.Employee;

public class App1 {
	public static void hibernateFunc() {
		Session session = getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstName("Harry");
		employee.setLastName("Potter");
		employee.setEmail("harry@gmail.com");
		employee.setPassword("12345");
		
//	saveEmployee(session, employee);
//		getEmployee(session);
//		updateEmployee(session);
//		deleteEmployee(session);
//		getAllEmployees(session);
//		getSingleRecord(session);
		
		
	}

	private static void getSingleRecord(Session session) {
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Employee> query = criteriaBuilder.createQuery(Employee.class);
		Root<Employee> root = query.from(Employee.class);
		query.select(root).where(criteriaBuilder.equal(root.get("id"), 2));
		
		Query<Employee> employeeQuery = session.createQuery(query);
		Employee result = employeeQuery.getSingleResult();
		System.out.println(result);
	}

	private static void getAllEmployees(Session session) {
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Employee> query = criteriaBuilder.createQuery(Employee.class);
		Root<Employee> root = query.from(Employee.class);
		query.select(root);
		Query<Employee> employeeQuery = session.createQuery(query);
		employeeQuery.getResultList().forEach(System.out :: println);
	}

	private static void deleteEmployee(Session session) {
		Employee retEmp = session.get(Employee.class, 1);
		session.delete(retEmp);
		session.getTransaction().commit();
	}

	private static void updateEmployee(Session session) {
		Employee retEmp = session.get(Employee.class, 1);
		retEmp.setPassword("12345");
		session.merge(retEmp);
		session.getTransaction().commit();
	}

	private static void getEmployee(Session session) {
		Employee retEmp = session.get(Employee.class, 1);
		System.out.println(retEmp);
	}

	private static void saveEmployee(Session session, Employee employee) {
		session.save(employee);
		session.getTransaction().commit();
		
		System.out.println("Record saved");
	}
}
