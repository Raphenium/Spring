package com.jackrutorial.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {
@RequestMapping("/hello")
public ModelAndView hello(HttpServletRequest request, HttpServletResponse res)
{
	
	String ISBN=request.getParameter("ISBN"); 
	
	if(ISBN.equals("ISBN1") || (ISBN.equals("ISBN10") || (ISBN.equals("ISBN100")))) 
	{
		String message = "Hurray! The book with ISBN " + ISBN + " is available";
		return new ModelAndView("hurray", "message", message);
	}
	else {
		return new ModelAndView("errorpage", "message", "Oops! This book is not available");
	}
}
}
