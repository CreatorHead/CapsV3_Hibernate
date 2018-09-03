package jpql.examples;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.caps.beta.dto.Movie;
import com.caps.beta.utils.HibernateUtils;


public class PassingParameters {
	public static void main(String[] args) {
		EntityManagerFactory factory = HibernateUtils.getEMF();
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//In JPQL the positional parameters starts with 1 and it is appended
		//by the positional number
		TypedQuery<Movie> query = em
				.createQuery("FROM Movie m where m.movieId= ?1 ",Movie.class);
		query.setParameter(1, 3);
		
		List<Movie> list = query.getResultList();
		
		for(Movie s:list){
			System.out.println(s.getName());
		}
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
