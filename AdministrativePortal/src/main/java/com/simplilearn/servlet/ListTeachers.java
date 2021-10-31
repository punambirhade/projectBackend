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
import com.simplilearn.entity.teachers;
import com.simplilearn.util.HibernateUtil;

public class ListTeachers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ListTeachers() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try {
			
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();
		//	student s=new student();
			String hibernateQuery = "select _p from teachers _p";

			
			//Query query=session.createQuery("session.createQuery(hibernateQuery, student.class");
			
					
			List<teachers> productList = session.createQuery(hibernateQuery,teachers.class).getResultList();

			RequestDispatcher  rs=request.getRequestDispatcher("dashboard.jsp");
			
			rs.include(request, response);
			List<String> productNames = productList.stream().map(eachProducts -> eachProducts.getFname()).collect(Collectors.toList());
		System.out.println(" List of student is.. " + productNames);

			
			
		
			PrintWriter out = response.getWriter();
			
			//out.print(""<div class="container mt-3">"");
			

			out.print("<div class='container'  background-color: lightblue>");
			out.print("<h1> List of teachers:<h1>");
			out.print("<table class=\"table table-condensed\">");
			out.print("<thead>");
			out.print("<tr>");
			out.print("<th>id </th>");
			out.print("<th>fname </th>");
			out.print("<th>lname</th>");
			out.print("<th>age </th>");
			out.print("</tr>");
			out.print("</thead>");
			out.print("<tbody {background-color: lightblue}>");
			
			for( teachers eachProduct : productList) {
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
