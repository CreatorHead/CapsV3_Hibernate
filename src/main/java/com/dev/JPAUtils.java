package com.dev;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {
	
	private JPAUtils(){}
	
	private static final EntityManagerFactory emf = getEmf();
	private static final EntityManagerFactory mysqlEMF = getEmfMySql();
			
	private static EntityManagerFactory getEmf(){
		return Persistence.createEntityManagerFactory("myPersistanceUnit");
	}
	
	private static EntityManagerFactory getEmfMySql(){
		return Persistence.createEntityManagerFactory("mySQL2");
	}
	
	public static EntityManagerFactory getEntityManagerFactory(String unitName){
		EntityManagerFactory returnEmf = null;
		if(unitName.equals("myPersistanceUnit")) {
			returnEmf = emf;
		}else if(unitName.equals("mySQL2")) {
			returnEmf = mysqlEMF;
		}
		return returnEmf;
	}
}
