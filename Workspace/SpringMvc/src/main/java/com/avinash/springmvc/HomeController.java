package com.avinash.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController 
{
	@GetMapping("/")
	public String home()
	{
		return "index";
//		System.out.println("Home page request");
	}
	@RequestMapping("add")
	public String add(@RequestParam("num1")int i,@RequestParam("num2")int j, Model m /*HttpSession session*//*HttpServletRequest req*/)
	{
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		ModelAndView mv = new ModelAndView();
		
		int res = i+j;
//		
//		mv.addObject("num3", res);
		m.addAttribute("num3", res);
//		mv.setViewName("result");
//		HttpSession session = req.getSession();
//		session.setAttribute("num3", res);
//		return mv;
		return "result";
	}
}