package pl.coderslab;

import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;


@Component
@Transactional
public class PersonDao {


	@PersistenceContext
	EntityManager entityManager;

	public void savePerson(Person entity) {
		entityManager.persist(entity);

	}
@Id
	public Person findById(long id) {

		return entityManager.find(Person.class, id);

	}
//	
//	
////	public void update(Person entity) {
////		entityManager.merge(entity);
////
////		}
	public void update(long id) {
		entityManager.merge(findById(id));

		}
//	public void delete(Person entity) {
//		entityManager.remove(entityManager.contains(entity) ?
//		entity : entityManager.merge(entity)); }
	
	
}