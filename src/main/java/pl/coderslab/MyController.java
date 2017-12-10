package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value = "/simple", method = RequestMethod.GET)
	public String simple() {
		return "index2";
	}

}