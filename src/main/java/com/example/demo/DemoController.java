package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
	
@Controller
public class DemoController {

	
@GetMapping({"/","/login"})
public String getMassage(Model mod)
{ 
	
		String massage = "Welcome to world of DevOps for automation";
	mod.addAttribute("massage", massage);
	
	System.out.println("Welcome to world of DevOps for automation");
	return "login";
}
}
