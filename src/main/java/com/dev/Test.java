package com.dev;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import associations.one_to_one.Address;
import associations.one_to_one.Person_OneToOneUnidirectional;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf = JPAUtils.getEntityManagerFactory("myPersistanceUnit");
		EntityManager em = emf.createEntityManager();
		
		/*Person_OneToOneUnidirectional p = new Person_OneToOneUnidirectional();
		p.setId(4);
		p.setAge(23);
		p.setName("Tinder");
		
		Address addr = new Address();
		addr.setCity("Ranchi");
		addr.setPin(834001);
		addr.setState("Jharkhand");
		addr.setAddress_id(104);
		
		p.setAddress(addr);*/
		
		em.getTransaction().begin();
		
		Person_OneToOneUnidirectional p = em.find(Person_OneToOneUnidirectional.class,4);
		em.remove(p);
		
//		em.persist(p);
		
		em.getTransaction().commit();
		
		em.close();
		
		emf.close();
		
	}
}










