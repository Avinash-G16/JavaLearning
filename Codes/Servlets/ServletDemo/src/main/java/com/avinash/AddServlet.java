package com.avinash;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class AddServlet extends HttpServlet
{
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
//	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
//	{
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int result = i+j;
//		PrintWriter out = res.getWriter();
//		out.println("result is : "+result);
//	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int result = i+j;
//		result *= result;
//		req.setAttribute("k", result); //key value pair
		
//		HttpSession session = req.getSession();
//		session.setAttribute("k", result);
		
		Cookie cookie = new Cookie("k", result + "");//key value
		
		res.addCookie(cookie);
		
		
		res.sendRedirect("sq?k="+result);
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
//		
//		PrintWriter out = res.getWriter();
//		out.println("result is : "+result);
	}
}
