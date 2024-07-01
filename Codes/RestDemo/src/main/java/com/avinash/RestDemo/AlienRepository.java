package com.avinash.RestDemo;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository 
{
	List<Alien> aliens;
	public AlienRepository()
	{
		aliens = new ArrayList<>();
		Alien a1 = new Alien();
		a1.setAid(1);
		a1.setName("avinash");
		a1.setPoints(60);
		Alien a2 = new Alien();
		a2.setAid(2);
		a2.setName("gautam");
		a2.setPoints(70);
		aliens.add(a1);
		aliens.add(a2);
	}
	public List<Alien> getAliens()
	{
		return aliens;
	}
	
	public Alien getAlien(int id)
	{
		Alien a1 = null;
		for(Alien a : aliens)
		{
			if(a.getAid()==id)
			{
				return a;
			}
		}
		return new Alien();
	}
	public void create(Alien al) 
	{
		aliens.add(al);
	}
	
	
	
}
