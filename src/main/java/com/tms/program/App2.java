package com.tms.program;

import static com.tms.util.HibernateUtil.getSessionFactory;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tms.entity.Employee;

public class App2 {
	public static void main(String[] args) {
		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Employee> query = criteriaBuilder.createQuery(Employee.class);
		Root<Employee> root = query.from(Employee.class);
		query.select(root).where(criteriaBuilder.equal(root.get("email"), "ojasvi@gmail.com"));
		Query<Employee> employeeQuery = session.createQuery(query);
		Employee result = employeeQuery.getSingleResult();
		System.out.println(result); 
	}
}
