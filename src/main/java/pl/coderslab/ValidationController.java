package pl.coderslab;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ValidationController {
	
	@Autowired
	Validator validator;
	
	@RequestMapping(value = "/validate", method = RequestMethod.GET)
	public String validateBook(Model model) {
		
		Book book = new Book();
		book.setTitle("Test");
		book.setRating(20);
		book.setAuthor(" ");
		
		Set<ConstraintViolation<Book>> constViol = validator.validate(book);
		
		model.addAttribute("violation", constViol);
		
		return "collection";
	}
	
	@RequestMapping(value = "/validBook", method = RequestMethod.GET)
	public String checkBook(Model model) {
		model.addAttribute("book", new Book());
		return "validateBook";
	}
	
	@RequestMapping(value = "/validBook", method = RequestMethod.POST)
	public String checkValidBook(@Valid Book book, BindingResult binding) {
		if(binding.hasErrors()) {
			return "validateBook";
		} else {
			// add to db / update
			return "success";
		}
	}
	
	@RequestMapping(value = "/validPerson", method = RequestMethod.GET)
	public String checkPerson(Model model) {
		model.addAttribute("person", new Person());
		return "validatePerson";
	}
	
	@RequestMapping(value = "/validPerson", method = RequestMethod.POST)
	public String checkValidPerson(@Valid Person person, BindingResult binding) {
		if(binding.hasErrors()) {
			return "validatePerson";
		} else {
			// add to db / update
			return "success";
		}
	}
	
	@RequestMapping(value = "/validAuthor", method = RequestMethod.GET)
	public String checkAuthor(Model model) {
		model.addAttribute("author", new Author());
		return "validateAuthor";
	}
	
	@RequestMapping(value = "/validAuthor", method = RequestMethod.POST)
	public String checkValidAuthor(@Valid Author author, BindingResult binding) {
		if(binding.hasErrors()) {
			return "validateAuthor";
		} else {
			// add to db / update
			return "success";
		}
	}
	
	@RequestMapping(value = "/validPublisher", method = RequestMethod.GET)
	public String checkPublisher(Model model) {
		model.addAttribute("publisher", new Publisher());
		return "validatePublisher";
	}
	
	@RequestMapping(value = "/validPublisher", method = RequestMethod.POST)
	public String checkValidPublisher(@Valid Publisher publisher, BindingResult binding) {
		if(binding.hasErrors()) {
			return "validatePublisher";
		} else {
			// add to db / update
			return "success";
		}
	}
	
	
}