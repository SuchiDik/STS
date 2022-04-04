package com.cybage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstControler {

	
	// method return string or view ,view means html
	//when u working with thymleaf=html
	
	@RequestMapping("/sayHello")
	public String greet()
	{
		return "first1";  //html file name same
	}
	/*
//return model and view
	@RequestMapping("/welcome")
	public ModelAndView welcome()
	{
		return new ModelAndView("welcome,"user","Sara");
	}
	*/
}
