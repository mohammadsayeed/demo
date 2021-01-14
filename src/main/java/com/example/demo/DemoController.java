package com.example.demo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
