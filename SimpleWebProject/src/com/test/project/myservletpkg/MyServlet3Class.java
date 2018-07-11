package com.test.project.myservletpkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * The WebServlet annotation works as a direct mapper of the request URL pattern to the servlet class
 * Thus eliminating the need for the web.xml mapping.
 * But for this annotation to read the application must not have a web.xml
 */
@WebServlet(value = "/begin") 
public class MyServlet3Class extends HttpServlet {
	 
	   
	   public void doPost(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
	      
	      // Set response content type
	      response.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      out.println("<h1> Hi, " + request.getParameter("name") + "</h1>");
	   }

}
