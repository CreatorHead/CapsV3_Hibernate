package com.caps.beta;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.caps.beta.dto.Movie;
import com.caps.beta.utils.HibernateUtils;

public class StoreMovieUsingHibernate {
	public static void main(String[] args) {
		System.out.println("Enter a Movie Name: ");
		Scanner in = new Scanner(System.in);
		Movie m = new Movie();
		m.setName(in.nextLine());
		System.out.println("Enter movie ID: ");
		m.setMovieId(Integer.parseInt(in.nextLine()));
		System.out.println("Enter movie Summery: ");
		m.setSummery(in.nextLine());
		System.out.println("Enter the Rating: ");
		m.setRating(Double.parseDouble(in.nextLine()));

		new StoreMovieUsingHibernate().save(m);
		in.close();
	}

	public void save(Movie movie) {
		
		//Create an Object of EntityManagerFactory
		EntityManagerFactory emf = HibernateUtils.getEMF();

		
		//Create Object of EnitityManager
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(movie);
		tx.commit();

	}
	
}











