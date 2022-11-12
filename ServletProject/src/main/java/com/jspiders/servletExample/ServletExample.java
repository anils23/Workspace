package com.jspiders.servletExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletExample extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   resp.setContentType("text/html");
	   PrintWriter writer = resp.getWriter();
	
	   writer.println("<h1>REGISTRATION FORM</h1>");
	   writer.println("<form>");
	   writer.print("<label>First Name : </label>");
	   writer.println("<input type=\"text\" placeholder=\"First Name\" required>");
	   writer.println("<br>");
	   writer.println("<br>");
	   writer.print("<label>Last Name : </label>");
	   writer.println("<input type=\"text\" placeholder=\"Last Name\" required>");
	   writer.println("<br>");
	   writer.println("<br>");
	   writer.println("<label for=\"\">Gender</label>\r\n"
	   		+ "      <input type=\"radio\" name=\"gender\" id=\"1\">\r\n"
	   		+ "      <label for=\"\">Male</label>\r\n"
	   		+ "      <input type=\"radio\" name=\"gender\" id=\"2\">\r\n"
	   		+ "      <label for=\"\">Female</label>");
	   writer.println("<br>");
	   writer.println("<br>");
	   writer.print("<label for=\"\">Subjects</label><br>\r\n"
	   		+ "      <input type=\"checkbox\" name=\"\" id=\"\">\r\n"
	   		+ "      <label for=\"\">Core Java</label><br>\r\n"
	   		+ "      <input type=\"checkbox\" name=\"\" id=\"\">\r\n"
	   		+ "      <label for=\"\">SQL</label><br>\r\n"
	   		+ "      <input type=\"checkbox\" name=\"\" id=\"\">\r\n"
	   		+ "      <label for=\"\">Web Tech</label><br>\r\n"
	   		+ "      <input type=\"checkbox\" name=\"\" id=\"\">\r\n"
	   		+ "      <label for=\"\">J2EE</label><br>");
	   writer.println("<br>");
	   writer.print("<input type=\"submit\" value=\"Submit\">    ");
	   writer.println("<input type=\"reset\" value=\"Reset\">");
	   writer.println("<form>");
	}

}
