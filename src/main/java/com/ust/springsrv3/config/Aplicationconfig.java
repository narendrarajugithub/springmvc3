package com.ust.springsrv3.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.ust.springsrv3.controller.MyController;

public class Aplicationconfig implements WebApplicationInitializer  {

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		// TODO Auto-generated method stub
		
		System.out.println("start config");
		
		AnnotationConfigWebApplicationContext rootContext =new AnnotationConfigWebApplicationContext();
		 rootContext.register(SpringConfig.class);
		 	
		 //ServiceConfig.class, JPAConfig.class, SecurityConfig.class
		 	
		 container.addListener(new ContextLoaderListener(rootContext));
	        ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(rootContext));
	        dispatcher.setLoadOnStartup(1);
	        dispatcher.addMapping("/");
		
	        System.out.println("end of config");
	}
	
	

}
