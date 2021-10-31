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

import com.simplilearn.entity.classes;
import com.simplilearn.util.HibernateUtil;

public class classesAndteachers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public classesAndteachers() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try {
			
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();
			
			String hibernateQuery = "select _p from classes _p";

			
			//Query query=session.createQuery("session.createQuery(hibernateQuery, student.class");
			
					
			List<classes> productList = session.createQuery(hibernateQuery,classes.class).getResultList();
			
			 RequestDispatcher  rs=request.getRequestDispatcher("dashboard.jsp");
				
				rs.include(request, response);
				
				 RequestDispatcher  rs1=request.getRequestDispatcher("mapping.jsp");
					
					rs1.include(request, response);

			
			List<Integer> productNames = productList.stream().map(eachProducts -> eachProducts.getSection()).collect(Collectors.toList());
		System.out.println(" List classes and teachers " + productNames);

			
		
			PrintWriter out = response.getWriter();
			
			//out.print(""<div class="container mt-3">"");
			
			out.print("<div class='container'>");
			out.print("<h3>Class And teachers Mapping:<h1>");
			out.print("<table class=\"table table-condensed\">");
			out.print("<thead>");
			out.print("<tr>");
			out.print("<th>id </th>");
			out.print("<th>Section </th>");
			out.print("<th>Teacher Name </th>");
			
			
			out.print("</tr>");
			out.print("</thead>");
			out.print("<tbody>");
			
			for(classes eachProduct : productList) {
				out.println("<tr><td> "+ eachProduct.getId() +"</td><td>"+ eachProduct.getSection()+"</td><td>"+eachProduct.getTeachername()+"</td><tr>");
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
