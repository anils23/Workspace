package com.te;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	 
		
		String parameter = req.getParameter("firstName");
		String parameter2 = req.getParameter("lastName");		
		
		PrintWriter writer = resp.getWriter();
		writer.println("Welcome to Techno elevate" +" "+ parameter +" "+ parameter2);
	
		
	}

}
