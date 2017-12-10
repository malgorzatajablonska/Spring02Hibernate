package pl.coderslab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class BookController {

	@Autowired
	private BookDao bookDao;

@RequestMapping("/addBook")
@ResponseBody
public String addBook(){

Book book = new Book();
book.setTitle("Thinking in Java");

book.setAuthor("Bruce Eckel");
bookDao.saveBook(book);
return "Id dodanej książki to:" + book.getId(); }

@RequestMapping("/findBook")
@ResponseBody
public String findBook() {
	Book book = bookDao.findById(2);
	return "Id znalezionej książki to:" + book.getId();
	
}
//@RequestMapping("/editBook")
//@ResponseBody
//public String editBook() {
//	Book book = bookDao.update(3);
//	
//	return "Nazwa obiektu to: " + book.getTitle();
//}

//public void update(Book entity) {
//entityManager.merge(book);




//@RequestMapping("/editBook/(id)")
//@ResponseBody
//public String editBook(){
//Book book = new Book();
//book.setTitle("newName");
//
//book.setAuthor("newAuthor");
//bookDao.update(book);
//return "Id dodanej książki to:" + book.getId(); }


}