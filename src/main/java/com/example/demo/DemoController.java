package com.example.demo;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
	
@Controller
public class DemoController {

	
@GetMapping({"/","/login"})
public ModelAndView  getMassage(Model mod, HttpServletResponse response)
{ 
	
		String massage = "Welcome to world of DevOps for automation";
	mod.addAttribute("massage", massage);
	
	System.out.println("Welcome to world of DevOps for automation");
	//response.sendRedirect("login.jsp");
	//return "login";
	//return new RedirectView("/login.jsp");
	return new ModelAndView("login");
}
}
