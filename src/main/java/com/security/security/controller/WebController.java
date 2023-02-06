package com.security.security.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.security.security.model.Employee;

@Controller
public class WebController {

	
	@GetMapping(value = {"/","/login"})
	public String getLogin() {
		return "login";
	}
	
	@GetMapping("/admin")
	public String getAdminPanel() {
		return "admin";
	}
	
	@GetMapping("/user")
	public String getUser() {
		return "user";
	}
	
	@GetMapping("/home")
	public String getHome() {
		return "home";
	}
	
	@GetMapping("/about")
	public String getAbout() {
		return "about";
	}
	
	    
}
