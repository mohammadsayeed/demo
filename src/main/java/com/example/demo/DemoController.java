package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	
@GetMapping("/")
public String getMassage()
{
	return "Welcome to world of DevOps for automation";
}
}
