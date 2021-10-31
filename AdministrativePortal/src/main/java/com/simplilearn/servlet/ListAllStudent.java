package com.simplilearn.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.simplilearn.entity.students;
import com.simplilearn.util.HibernateUtil;


public class ListAllStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ListAllStudent() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();
		
			String hibernateQuery = "select _p from students _p";
			
			List<students> productList = session.createQuery(hibernateQuery, students.class).getResultList();
			
            RequestDispatcher  rs=request.getRequestDispatcher("dashboard.jsp");
			
			rs.include(request, response);
			List<String> productNames = productList.stream().map(eachProducts -> eachProducts.getFname()).collect(Collectors.toList());
		  System.out.println(" List of student is.. " + productNames);
		  
		
			PrintWriter out = response.getWriter();
			
			
			out.print("<div class='container'>");
			out.print("<h1> List of Students:<h1>");
			out.print("<table class=\"table table-condensed\">");
			out.print("<thead>");
			out.print("<tr>");
			out.print("<th>id </th>");
			out.print("<th>Fname </th>");
			out.print("<th>Lname </th>");
			out.print("<th>age </th>");
			//out.print("<th>aclass </th>");
			out.print("</tr>");
			out.print("</thead>");
			out.print("<tbody>");
			
			for(students eachProduct : productList) {
				out.println("<tr><td> "+ eachProduct.getId() +"</td><td>"+ eachProduct.getFname()+"</td><td>"+eachProduct.getLname()
							+"</td><td>"+eachProduct.getAge()+ "</td><tr>");
			}
			out.print("</tbody>");
			out.print("</table>");
			out.print("<div>");
			

			session.close();
			System.out.println("Hibernate Session closed!");
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
