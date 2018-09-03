package com.caps.beta;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.caps.beta.dto.Movie;
import com.caps.beta.utils.HibernateUtils;

import associations.many_to_many.Students_Bidirectional;
import associations.many_to_many.Students_Unidirectional;
import associations.many_to_many.Teacher;
import associations.many_to_many.Teacher_Bidirectional;
import associations.one_to_many.Bucket_Bidirectional;
import associations.one_to_many.IceCube;
import associations.one_to_many.Pencil;
import associations.one_to_many.PencilBox_UniDirectional;
import associations.one_to_one.User_OneToOneBidirectional;
import associations.one_to_one.VoterCard;

public class PersistenceLifeCycleExamples {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = HibernateUtils.getEMF();
		EntityManager em = emf.createEntityManager();
		
//		Movie m = new Movie();
//		m.setMovieId(4);
//		m.setName("Delhi belly");
//		m.setRating(9.5);
//		m.setSummery("Bhag Bhag DK Bose");
		
		em.getTransaction().begin();
		
		Movie m = em.find(Movie.class, 4);
		System.out.println("After Retrival: "+em.contains(m));
		
		em.detach(m);
		System.out.println("After Detached: "+em.contains(m));
		m = em.merge(m);
		
		System.out.println("After Merge: "+em.contains(m));
		
		em.getTransaction().commit();
		em.close();
		
		
	}
}









