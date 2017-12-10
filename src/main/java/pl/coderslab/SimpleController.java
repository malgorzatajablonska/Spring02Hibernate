package pl.coderslab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

	@Autowired
	BookRepository bookRepository;
	
	@RequestMapping(value="/findBooksByTitle", method = RequestMethod.GET)
	@ResponseBody
	public String findBooksByTitle() {
		
		List <Book> ksiazki = bookRepository.findByTitleIgnoreCase("title2");
		
		for(Book ksiazka:ksiazki) {
			System.out.println("Tytuł: " + ksiazka.getTitle() + " autor: " + ksiazka.getAuthor());
		}
		return "wynik w konsoli";
	}
	
	@RequestMapping(value="/findBooksByCategoryName", method = RequestMethod.GET)
	@ResponseBody
	public String findBooksByCategoryName() {
		
		List <Book> ksiazki = bookRepository.findByCategoryName("kategoria1");
		
		for(Book ksiazka:ksiazki) {
			System.out.println("Tytuł: " + ksiazka.getTitle() + " autor: " + ksiazka.getAuthor());
		}
		return "wynik w konsoli";
	}
	
	@RequestMapping(value="/findBooksByCategoryId", method = RequestMethod.GET)
	@ResponseBody
	public String findBooksByCategoryId() {
		
		List <Book> ksiazki = bookRepository.findByCategoryId(1);
		
		for(Book ksiazka:ksiazki) {
			System.out.println("Tytuł: " + ksiazka.getTitle() + " autor: " + ksiazka.getAuthor());
		}
		return "wynik w konsoli";
	}
	
	@RequestMapping(value="/findBooksByAuthor", method = RequestMethod.GET)
	@ResponseBody
	public String findBooksByAuthor() {
		
		List <Book> ksiazki = bookRepository.findByAuthor("author2");
		
		for(Book ksiazka:ksiazki) {
			System.out.println("Tytuł: " + ksiazka.getTitle() + " autor: " + ksiazka.getAuthor());
		}
		return "wynik w konsoli";
	}
	
	@RequestMapping(value="/findBooksByPublisher", method = RequestMethod.GET)
	@ResponseBody
	public String findBooksByPublisher() {
		
		List <Book> ksiazki = bookRepository.findByPublisher("publisher1");
		
		for(Book ksiazka:ksiazki) {
			System.out.println("Tytuł: " + ksiazka.getTitle() + " autor: " + ksiazka.getAuthor());
		}
		return "wynik w konsoli";
	}
	
	@RequestMapping(value="/findBooksByRating", method = RequestMethod.GET)
	@ResponseBody
	public String findBooksByRating() {
		
		List <Book> ksiazki = bookRepository.findByRatingBetween(3,4);
		
		for(Book ksiazka:ksiazki) {
			System.out.println("Tytuł: " + ksiazka.getTitle() + " autor: " + ksiazka.getAuthor());
		}
		return "wynik w konsoli";
	}
	
	@RequestMapping(value="/findBooksByCategoryIdOrderbyTitle", method = RequestMethod.GET)
	@ResponseBody
	public String findBooksByCategoryIdOrderByTitle() {
		
		List <Book> ksiazki = bookRepository.findFirstByCategoryNameOrderByTitle("kategoria1");
		
		for(Book ksiazka:ksiazki) {
			System.out.println("Tytuł: " + ksiazka.getTitle() + " autor: " + ksiazka.getAuthor());
		}
		return "wynik w konsoli";
	
	
}
	@Autowired
	PublisherRepository publisherRepository;
	
	@RequestMapping(value="/findPublisherByNip", method = RequestMethod.GET)
	@ResponseBody
	public String findPublisherByNip() {
		
		List <Publisher> wydawcy = publisherRepository.findByNip(1181587422);
		
		for(Publisher wydawca :wydawcy) {
			System.out.println("Nazwa wydawcy: " + wydawca.getName() + " nip: " + wydawca.getNip() +  "regon: " + wydawca.getRegon());
		}
		return "wynik w konsoli";
}
	@RequestMapping(value="/findPublisherByRegon", method = RequestMethod.GET)
	@ResponseBody
	public String findPublisherByRegon() {
		
		List <Publisher> wydawcy = publisherRepository.findByRegon(17230132);
		
		for(Publisher wydawca :wydawcy) {
			System.out.println("Nazwa wydawcy: " + wydawca.getName() + " nip: " + wydawca.getNip() +  "regon: " + wydawca.getRegon());
		}
		return "wynik w konsoli";
}
	
	@RequestMapping(value="/findBooksByTitleSecond", method = RequestMethod.GET)
	@ResponseBody
	public String findBooksByTitleSecond() {
		
		List <Book> ksiazki = bookRepository.findBooksByTitle("title2");
		
		for(Book ksiazka:ksiazki) {
			System.out.println("Tytuł: " + ksiazka.getTitle() + " autor: " + ksiazka.getAuthor());
		}
		return "wynik w konsoli";
	}
	
	@RequestMapping(value="/findBooksByCategoryNameSecond", method = RequestMethod.GET)
	@ResponseBody
	public String findBooksByCategoryNameSecond() {
		
		List <Book> ksiazki = bookRepository.findBooksByCategoryNameSecond("kategoria1");
		
		for(Book ksiazka:ksiazki) {
			System.out.println("Tytuł: " + ksiazka.getTitle() + " autor: " + ksiazka.getAuthor());
		}
		return "wynik w konsoli";
	}
	
	@RequestMapping(value="/findBooksByRatingSecond", method = RequestMethod.GET)
	@ResponseBody
	public String findBooksByRatingBetweenSecond() {
		
		List <Book> ksiazki = bookRepository.findBooksByRatingBetween(3,4);
		
		for(Book ksiazka:ksiazki) {
			System.out.println("Tytuł: " + ksiazka.getTitle() + " autor: " + ksiazka.getAuthor());
		}
		return "wynik w konsoli";
	}
	

	@RequestMapping(value="/findBooksByPublisherSecond", method = RequestMethod.GET)
	@ResponseBody
	public String findBooksByPublisherSecond() {
		
		List <Book> ksiazki = bookRepository.findBooksByPublisher("publisher1");
		
		for(Book ksiazka:ksiazki) {
			System.out.println("Tytuł: " + ksiazka.getTitle() + " autor: " + ksiazka.getAuthor());
		}
		return "wynik w konsoli";
	}
	
	
	@RequestMapping(value="/findBooksByCategoryIdOrderbyTitleSecond", method = RequestMethod.GET)
	@ResponseBody
	public String findBooksByCategoryIdOrderByTitleSecond() {
		
		List <Book> ksiazki = bookRepository.findBooksByCategoryNameOrderByTitle("kategoria1");
		
		for(Book ksiazka:ksiazki) {
			System.out.println("Tytuł: " + ksiazka.getTitle() + " autor: " + ksiazka.getAuthor());
		}
		return "wynik w konsoli";
	
	
}
	@Autowired
	AuthorRepository authorRepository;
	
	@RequestMapping(value="/findAuthorsByEmailSecond", method = RequestMethod.GET)
	@ResponseBody
	public String findAuthorByEmail() {
		
		List <Author> autorzy = authorRepository.findAuthorsByEmail("aaa");
		
		for(Author autor :autorzy) {
			System.out.println("Imię autora: " + autor.getFirstName() +  "nazwisko: " + autor.getLastName() + " email: " + autor.getEmail());
		}
		return "wynik w konsoli";
}
	@RequestMapping(value="/findAuthorsByPeselSecond", method = RequestMethod.GET)
	@ResponseBody
	public String findAuthorByPesel() {
		
		List <Author> autorzy = authorRepository.findAuthorsByPesel("85");
		
		for(Author autor :autorzy) {
			System.out.println("Imię autora: " + autor.getFirstName() +  "nazwisko: " + autor.getLastName() + " email: " + autor.getEmail() + " pesel: " + autor.getPesel());
		}
		return "wynik w konsoli";
}
	
	 @RequestMapping(value = "/resetRating", method = RequestMethod.GET)
	    @ResponseBody
	    public String resetRating() {
	        bookRepository.resetRating(1);
	        return "wynik w konsoli";
	}
}