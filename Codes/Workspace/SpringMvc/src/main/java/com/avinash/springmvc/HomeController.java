package com.avinash.springmvc;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.avinash.springmvc.model.Alien;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController 
{
	@Autowired
	AlienRepo repo;
	
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
	
	@GetMapping("getAliens")
	public String getAliens(Model m)
	{
//		List<Alien> aliens = Arrays.asList(new Alien(101, "Navin"), new Alien(102, "Rose"));
		
		
		m.addAttribute("result", repo.findAll());
		return "showAliens";
	}
	
	@GetMapping("getAlien")
	public String getAlien(@RequestParam int aid, Model m)
	{
//		List<Alien> aliens = Arrays.asList(new Alien(101, "Navin"), new Alien(102, "Rose"));
		
		
		m.addAttribute("result", repo.getReferenceById(aid));
		return "showAliens";
	}
	
	@GetMapping("getAlienByName")
	public String getAlienByName(@RequestParam String aname, Model m)
	{
//		List<Alien> aliens = Arrays.asList(new Alien(101, "Navin"), new Alien(102, "Rose"));
		
		
		m.addAttribute("result", repo.find(aname));
		return "showAliens";
	}
	
//	@RequestMapping(value = "addAlien",method=RequestMethod.POST) 
	@PostMapping(value="addAlien")
	public String addAlien(Alien a/*@ModelAttribute("alien") Alien a*/ /*@RequestParam("aid")int aid,@RequestParam("aname")String aname*/)
	{
		
//		Alien a = new Alien();
//		a.setAid(aid);
//		a.setAname(aname);
//		m.addAttribute("alien",a);
		
		repo.save(a);
		return "result";
	}
	
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("name","Avinash");
	}
	
}
