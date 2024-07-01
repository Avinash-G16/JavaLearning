package com.avinash;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String name = "Avinash";
		
		Student s = new Student(1, "Avinash");
		
		List<Student> studs = Arrays.asList(new Student(1,"Avinash"), new Student(2,"Gautam"));
		
		req.setAttribute("Studs", studs);
		
//		req.setAttribute("label", name);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
	}
}