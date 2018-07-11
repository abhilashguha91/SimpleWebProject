package com.test.project.myservletpkg;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/*
 * This mapts the URL pattern with the class, but we have be sure there are no web.xml files
 * from where the jvm is reading the servlet and the filters.
 * Delete the web.xml file in case you use the annotations. This will help you get rid of the error 404 when 
 * it trie to reach for a filter.
 */
@WebFilter(urlPatterns = {"/begin"}, initParams = { 
		   @WebInitParam(name = "test-param", value = "Initialization Paramter")}) 
public class MyWebFilter implements Filter{

	// This method is called when the filter is initialized, generally when a server is starting and it creates the Servlet and Filter instances in it's container.
	public void init(FilterConfig config) throws ServletException { 
	      // Get init parameter  
	      String testParam = config.getInitParameter("test-param");
	            
	      //Print the init parameter  
	      System.out.println("Test Param: " + testParam);  
	   } 

	 /*
	  * This is the action method, it is executed immediately when the urlPatterns match.
	  * This was a crutial way in JEE of doing pre servlet processes. 
	  * like credential authentication, logging, auditing etc. 
	  */
	 public void doFilter(ServletRequest request, ServletResponse response,
	      FilterChain chain) throws IOException, ServletException { 
		  
	      // Log the current timestamp. 
	      System.out.println("Time " + new Date().toString());  
	         
	      // Pass request back down the filter chain 
	      chain.doFilter(request,response); 
	   }

	   public void destroy( ) {
	      /* Called before the Filter instance is removed  
	      from service by the web container*/ 
	   } 
	
}
