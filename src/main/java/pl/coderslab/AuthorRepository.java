package pl.coderslab;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AuthorRepository extends JpaRepository <Author, Integer>{
	
	@Query("select a  from Author a where a.email LIKE :email%")
	 List<Author> findAuthorsByEmail(@Param("email") String podanyemail);
	
	@Query("select a  from Author a where a.pesel LIKE :pesel%")
	 List<Author> findAuthorsByPesel(@Param("pesel") String podanyfragmentpeselu);

}
