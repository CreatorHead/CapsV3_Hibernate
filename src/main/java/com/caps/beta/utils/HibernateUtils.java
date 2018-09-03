package com.caps.beta.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class HibernateUtils {

	private HibernateUtils() {}
	
	private static final EntityManagerFactory emf = retrieveEMF();
			
	
	private static EntityManagerFactory retrieveEMF() {
		return Persistence.createEntityManagerFactory("myPersistenceUnit");
	}
	
	public static EntityManagerFactory getEMF() {
		return emf;
	}
}
