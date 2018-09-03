package com.caps.beta;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.caps.beta.dto.Car;
import com.caps.beta.dto.Movie;
import com.caps.beta.utils.HibernateUtils;

public class StoreCarUsingHibernate {
	public static void main(String[] args) {
		System.out.println("Enter a Car Name: ");
		Scanner in = new Scanner(System.in);
		Car c = new Car();
		c.setName(in.nextLine());
		System.out.println("Enter Car ID: ");
		c.setId(Integer.parseInt(in.nextLine()));
		System.out.println("Enter Car color: ");
		c.setColor(in.nextLine());
		System.out.println("Enter the Price: ");
		c.setPrice(Double.parseDouble(in.nextLine()));

		new StoreCarUsingHibernate().save(c);
		in.close();
	}

	public void save(Car car) {
		
		//Create an Object of EntityManagerFactory
		EntityManagerFactory emf = HibernateUtils.getEMF();

		
		//Create Object of EnitityManager
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(car);
		tx.commit();
		System.out.println("Data inserted");

	}
	
}











