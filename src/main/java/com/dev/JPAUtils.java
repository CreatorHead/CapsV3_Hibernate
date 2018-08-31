package com.dev;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {
	
	private JPAUtils(){}
	
	private static final EntityManagerFactory emf = getEmf();
			
	private static EntityManagerFactory getEmf(){
		return Persistence.createEntityManagerFactory("myPersistenceUnit");
	}
	
	public static EntityManagerFactory getEntityManagerFactory(){
		return emf;
	}
}
