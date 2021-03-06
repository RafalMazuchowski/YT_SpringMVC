package pl.javasolutions.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pl.javasolutions.pojo.User;
import pl.javasolutions.validator.UserValidator;

@Controller
public class RegisterController {
	
	@Autowired
	UserValidator userValidator;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		
		binder.addValidators(userValidator);

	}
	
	
	@PostMapping(value = "/register")
	public String postRegister(@ModelAttribute("user") @Validated User user, BindingResult bindungResult) {
		
		if(bindungResult.hasErrors()) {
			return "register";
		}
		return "home";
	}
	
	@GetMapping(value = "/register")
	public String register(Model model) {
		
		model.addAttribute("user", new User());
		return "register";
	}

}
