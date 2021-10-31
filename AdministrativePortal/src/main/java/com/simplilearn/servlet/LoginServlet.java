package com.simplilearn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println("Username :- "+ username + " Password :- "+ password);
		

		if (username == null | "".equals(username)) {
			response.sendRedirect("invalid.jsp?errorCode=1");
		} else if (password == null | "".equals(password)) {
			response.sendRedirect("invalid.jsp?errorCode=2");
		} else {
			if ("Admin".equals(username) && "admin@123".equals(password)) {
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				request.getRequestDispatcher("dashboard.jsp").forward(request, response);
			}
			else {
				PrintWriter out = response.getWriter();
				out.print("<h2><center>Invalid username and password</center></h2>");
			}
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
