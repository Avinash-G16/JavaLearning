package com.avinash.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.avinash.spring.dao.AlienDao;
import com.avinash.spring.model.Alien;

@Controller
public class HomeController 
{
	@Autowired
	private AlienDao dao;
	
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
	
	@RequestMapping("addAlien")
	public String addAlien(/*Alien*/ @ModelAttribute("result") Alien a /*@RequestParam("aid")int aid,@RequestParam("aname")String aname*/)
	{
		dao.addAlien(a);
//		Alien a = new Alien();
//		a.setAid(aid);
//		a.setAname(aname);
//		m.addAttribute("alien",a);
		return "showAliens";
	}
	
	@GetMapping("getAliens")
	public String getAliens(Model m)
	{
		m.addAttribute("result",dao.getAliens());
		return "showAliens";
	}
	
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("name","Avinash");
	}
	@GetMapping("getAlien")
	public String getAlien(@RequestParam int aid, Model m)
	{
		m.addAttribute("result",dao.getAlien(aid));
		return "showAliens";
	}
	
	
}
