package com.ust.springsrv3.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@Autowired
	public ReloadableResourceBundleMessageSource message;

	@RequestMapping("/employee")
	public String getresponce(Model m){
		
	System.out.println(message.getMessage("one",null,Locale.getDefault()));
			return "b";
	}
	
}
