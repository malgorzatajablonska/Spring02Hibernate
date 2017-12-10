package pl.coderslab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {
	@RequestMapping(value="/showForm", method = RequestMethod.GET)
	public String showPersonForm(@ModelAttribute Person person, Model model) {	
		
		return "index";
	}
	
	@Autowired
	private PersonDao personDao;
	
//	@RequestMapping(value="/showForm", method = RequestMethod.POST)
//	public String showDetail(@RequestParam String firstName, @RequestParam String lastName,	Model model)
//	{
//		//Person p = new Person("");
//		model.addAttribute("message", "First name: " + firstName);
//		return "success";
//	}
	
	@RequestMapping(value="/showForm", method = RequestMethod.POST)
	public String showDetail(@ModelAttribute Person person, Model model)
	{

		model.addAttribute("message", "First name: " + person.getFirstName());
		return "success";
	}
	
	@RequestMapping(value="/showSelectedUser", method = RequestMethod.GET)
	public String showSelectedUser(@ModelAttribute Person person, Model model)
	{
	//personDao.savePerson(person);
		//model.addAttribute("person", new Person("imię", "nazwisko"));
		return "register";
	}
	
	@RequestMapping(value="/showSelectedUser", method = RequestMethod.POST)
	public String showSelectedUser2(@ModelAttribute Person person, Model model)
	{
	personDao.savePerson(person);
	//	model.addAttribute("person", new Person("imię", "nazwisko"));
		return "success2";
	}
	
}
