package com.caps.beta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.caps.beta.dto.Movie;

public class RetrievingEntities {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager em = emf.createEntityManager();
		
//		em.getTransaction().begin();
		
		Movie m = em.find(Movie.class, 2);
		System.out.println(m);
		
//		em.getTransaction().commit();
		
		em.close();
	}
}
