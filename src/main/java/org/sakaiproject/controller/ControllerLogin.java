package org.sakaiproject.controller;

import org.sakaiproject.client.ServiceLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class ControllerLogin {

	@Autowired
	protected ServiceLogin callServi;
	
	@GetMapping(value = "/")
	public String index() {
		return "index";
	}
	
	@GetMapping(value = "/login")
	public String login() {
		return "login";
	}
	
	@PostMapping(value = "/home")
	public String home(Model model, @RequestParam String id, @RequestParam String pw) {
		model.addAttribute("res", id+ "   "+pw);
		return "home";
	}
	
	@GetMapping(value = "/home")
	public String prueba(Model model) {
		
		model.addAttribute("res", callServi.login("123", "321"));
		
		return "home";
	}
	
	
}
