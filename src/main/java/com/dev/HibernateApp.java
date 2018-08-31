package com.dev;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HibernateApp {
	
	public static void main(String[] args) {
		
		Movie m = new Movie();
		m.setId(1);
		m.setName("Logan");
		m.setRating(9);
		m.setSummery("Action");
		
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		m = em.find(Movie.class, 1);
		System.out.println(m);
		tx.commit();
	}
}
