package com.simplilearn.servlet;

import java.io.IOException;



import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.json.JSONArray;


import com.simplilearn.entity.students;
import com.simplilearn.util.HibernateUtil;




public class StudentList extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public StudentList() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		List<students> studentsList = session.createQuery("select p from students p").getResultList();
		PrintWriter out = response.getWriter();
	//	out.println("studentsList  :         " + studentsList);
	//	student s=new student();

		
		/*List<student> studlist = new ArrayList<student>();
		for(student student:studlist) {
			
			Map<String, List<student>> map = new HashMap<String, List<student>>();
			map.add(student.getId());
		}
		studlist.add(new Student("1726", "John", "New York"));
		map.put("New York", studlist);*/
		List<HashMap<Integer, students>> studentsMapList = new ArrayList<>();
		for (students student : studentsList) {
			HashMap<Integer, students> stduentMap = new HashMap<Integer,students>();
			//student s=new student();

			stduentMap.put(1,student);
			//stduentMap.put(s.getName());
			//out.println(student.getId()+"\n");
			//out.println(student.getName()+"\n");
			
			studentsMapList.add(stduentMap);
			//System.out.println(student.getId()+"\n");
			//System.out.println(student.getName()+"\n");
			
		}
		
		request.setAttribute("studRec",studentsMapList);
		RequestDispatcher rd=request.getRequestDispatcher("employee.jsp");
		
		//request.setAttribute("students",studentsMapList );
		// request.getRequestDispatcher("/list-student.jsp").forward(request, response);
		JSONArray jsonArray = new JSONArray(studentsMapList);
		System.out.println(jsonArray);
		
	//	request.getRequestDispatcher("dashboard.jsp?student" + jsonArray.toString()).forward(request, response);
		////request.getRequestDispatcher("dashboard.jsp").forward(request, response);
		
		
		//JSONArray jsonArray = new JSONArray(studentsMapList);
		request.getRequestDispatcher("dashboard.jsp?student=" + jsonArray.toString()).forward(request, response);
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
/*
	<%
			String students = request.getParameter("student");
			if (Objects.nonNull(students)) {
				%>
				<p>List of Students</p>
				<table class="table table-striped">
					<thead>
						<tr>
							<th>Id</th>
							<th>Name</th>
						</tr>
					</thead>
					<tbody>
						<%
							List<HashMap<Object, student>> studentsList = new ObjectMapper().readValue(students, List.class);
		
								for (HashMap<Object, student> eachMap : studentsList) {
									
									System.out.println(eachMap);
									System.out.println(eachMap.get("1"));
									//student studentId = (student) eachMap.get("1");
								//	System.out.println(eachMap.get("1").toString());
								//int ee =	 eachMap.get("1").getId();
									System.out.println("   "+eachMap.get("1").getId());
								
							
								
									
									
								//	String studentName = studentId.getName();//("studentName");
									%>
									<tr>
										<td>rupesh</td>
										<td>sai</td>
									</tr>
									<%
								}
						%>
					</tbody>
				</table>
				<%
				
			}
		%>


*/