package org.sakaiproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class ControllerLogin {

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
	
}
