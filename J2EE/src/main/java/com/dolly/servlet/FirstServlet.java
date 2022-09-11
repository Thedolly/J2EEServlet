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
public void init() throws ServletException {
	// TODO Auto-generated method stub
	System.out.println("init call");
}
  @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  System.out.println("service call");
	 resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<h3>hiiiii</h3>");
		
	}
  @Override
	public void destroy() {
		// TODO Auto-generated method stub
	  
		System.out.println("destroy");
	}


}
