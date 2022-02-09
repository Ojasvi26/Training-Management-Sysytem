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
import com.tms.entity.Trainer;

public class TrainerDaoImpl implements TrainerDao {

    @Override
    public void addTrainer(Trainer trainer) {
    	Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(trainer);
		session.getTransaction().commit();
		
		System.out.println("Record saved");
    }

   


	@Override
	public Trainer getTrainerByEmail(String email) {
		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Trainer> query = criteriaBuilder.createQuery(Trainer.class);
		Root<Trainer> root = query.from(Trainer.class);
		query.select(root).where(criteriaBuilder.equal(root.get("email"), email));
		Query<Trainer> trainerQuery = session.createQuery(query);
		Trainer result = trainerQuery.getSingleResult();
		return result;
	}

	@Override
	public boolean validateTrainerByEmail(String email) {
		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Trainer> query = criteriaBuilder.createQuery(Trainer.class);
		Root<Trainer> root = query.from(Trainer.class);
		query.select(root).where(criteriaBuilder.equal(root.get("email"), email));
		Query<Trainer> trainerQuery = session.createQuery(query);
		return(!trainerQuery.getResultList().isEmpty());
	}
}
