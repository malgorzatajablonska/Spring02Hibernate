package pl.coderslab;

import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;



@Component
@Transactional
public class BookDao {
	@PersistenceContext
	EntityManager entityManager;

	public void saveBook(Book entity) {
		entityManager.persist(entity);

	}
@Id
	public Book findById(long id) {

		return entityManager.find(Book.class, id);

	}
//	
//	
////	public void update(Book entity) {
////		entityManager.merge(entity);
////
////		}
	public void update(long id) {
		entityManager.merge(findById(id));

		}
//	public void delete(Book entity) {
//		entityManager.remove(entityManager.contains(entity) ?
//		entity : entityManager.merge(entity)); }
	
	
}