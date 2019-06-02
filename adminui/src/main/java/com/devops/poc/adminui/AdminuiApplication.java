package com.devops.poc.adminui;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.web.context.ServletContextAware;

@SpringBootApplication
public class AdminuiApplication implements ServletContextInitializer, ServletContextAware{

	public static void main(String[] args) {
		SpringApplication.run(AdminuiApplication.class, args);
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		servletContext.setInitParameter("javax.faces.PROJECT_STAGE", "Development");
		servletContext.setInitParameter("primefaces.THEME", "delta");
		servletContext.setInitParameter("primefaces.FONT_AWESOME", "true");
		servletContext.setInitParameter("com.sun.faces.enableRestoreView11Compatibility", "true");
		servletContext.setInitParameter("javax.faces.DATETIMECONVERTER_DEFAULT_TIMEZONE_IS_SYSTEM_TIMEZONE", "true");
		servletContext.setInitParameter("primefaces.MOVE_SCRIPTS_TO_BOTTOM", "true");	
	}
	
	@Override
	public void setServletContext(ServletContext servletContext) {
		servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());		
	}	

}
