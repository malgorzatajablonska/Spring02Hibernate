package pl.coderslab;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImpl implements MyInterface {
	@PersistenceUnit
	private EntityManagerFactory emFactory;
	public BookRepositoryImpl() { }
	@Override
	public void resetRating(int rating) {

	EntityManager entityManager = emFactory.createEntityManager();
	Query query = entityManager.createQuery("UPDATE Book SET rating = :rating");
    query.setParameter("rating", rating);
    entityManager.joinTransaction();
    query.executeUpdate();
    entityManager.close();
	
	} 
	
	
//	update books set rating=2
//	Query queryp = entityManager.
//	createQuery("SELECT b FROM Book b where rating >:rating");
//	queryp.setParameter("rating", 4);
//
//	List<Book> booksp = query.getResultList();
	
	
	
}
