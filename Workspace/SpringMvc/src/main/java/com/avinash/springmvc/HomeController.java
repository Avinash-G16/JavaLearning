package com.avinash.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController 
{
	@GetMapping("/")
	public String home()
	{
		return "index.jsp";
//		System.out.println("Home page request");
	}
	@RequestMapping("add")
	public String add(HttpServletRequest req)
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int res = i+j;
		HttpSession session = req.getSession();
		session.setAttribute("num3", res);
		return "result.jsp";
	}
}
