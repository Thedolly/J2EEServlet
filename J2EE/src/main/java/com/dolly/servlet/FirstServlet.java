package com.dolly.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */

public class FirstServlet extends HttpServlet {
	
  @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  
	  String name = req.getParameter("name");
	  String desg = req.getParameter("desg");
	  String tech = req.getParameter("techskills");
	  
	  System.out.println("name = "+name);
	  System.out.println("desg = "+desg);
	  System.out.println("techskills = "+tech);
		
	}
 

}
