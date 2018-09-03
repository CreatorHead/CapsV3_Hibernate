package com.caps.beta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.caps.beta.dto.Movie;
import com.caps.beta.utils.HibernateUtils;


public class RemoveEntities {
	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tx = null;


		try {
			emf = HibernateUtils.getEMF();
			em = emf.createEntityManager();
			tx = em.getTransaction();

			tx.begin();

			Movie movie = em.find(Movie.class, 3);
			em.remove(movie);
			tx.commit();
			System.out.println("Movie Deleted");
		}catch(Exception e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			em.close();
			emf.close();
		}
	}
}
