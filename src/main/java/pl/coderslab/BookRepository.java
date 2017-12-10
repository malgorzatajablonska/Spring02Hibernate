package pl.coderslab;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends JpaRepository <Book, Integer>, MyInterface{
	
	 List<Book> findByTitleIgnoreCase(String title);
	 
	 List<Book> findByCategoryName(String category);
	 
	 List<Book> findByCategoryId(int id);
	 
	 List<Book> findByAuthor(String author);
	 
	 List<Book> findByPublisher(String publisher);

	 List<Book> findByRatingBetween(int start, int end);
	 
	 List<Book> findFirstByCategoryNameOrderByTitle(String category);
	 
	 @Query("select b  from Book b where b.title= :title")
	 List<Book> findBooksByTitle(@Param("title") String title);
	 
	 @Query("select b  from Book b where b.category.name= :catName")
	 List<Book> findBooksByCategoryNameSecond(@Param("catName") String catName);
	 
	 @Query("select b  from Book b where b.rating between :rating and :rating2")
	 List<Book> findBooksByRatingBetween(@Param("rating") int rating, @Param("rating2") int rating2);
	 
	 @Query("select b  from Book b where b.publisher = :publisher")
	 List<Book> findBooksByPublisher(@Param("publisher") String publisher);
	 
	 @Query("select b  from Book b where b.category.name = :category ORDER BY title")
	 List<Book> findBooksByCategoryNameOrderByTitle(@Param("category") String category);
	 
	 
	
	 
	 

}
