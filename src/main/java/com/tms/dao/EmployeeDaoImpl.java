package com.tms.dao;

import static com.tms.util.HibernateUtil.getSessionFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tms.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	@Override
	public void addEmployee(Employee employee) {
		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		
		System.out.println("Record saved");
	}
	
	@Override
	public Employee getEmployeeByEmail(String email) {
		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Employee> query = criteriaBuilder.createQuery(Employee.class);
		Root<Employee> root = query.from(Employee.class);
		query.select(root).where(criteriaBuilder.equal(root.get("email"), email));
		Query<Employee> employeeQuery = session.createQuery(query);
		Employee result = employeeQuery.getSingleResult();
		return result;
		
	}

	@Override
	public boolean validateEmployeeByEmail(String email) {
		
		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Employee> query = criteriaBuilder.createQuery(Employee.class);
		Root<Employee> root = query.from(Employee.class);
		query.select(root).where(criteriaBuilder.equal(root.get("email"), email));
		Query<Employee> employeequery = session.createQuery(query);
		return(!employeequery.getResultList().isEmpty());
	}
	
	
}
