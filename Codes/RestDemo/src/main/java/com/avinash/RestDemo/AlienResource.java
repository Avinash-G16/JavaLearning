package com.avinash.RestDemo;

import java.util.Arrays;
import java.util.List;

import jakarta.websocket.server.PathParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource 
{
	AlienRepository repo = new AlienRepository();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAlien()
	{
		System.out.println("getAlien is called");
//		Alien a1 = new Alien();
//		a1.setName("avinash");
//		a1.setPoints(60);
//		Alien a2 = new Alien();
//		a2.setName("gautam");
//		a2.setPoints(70);
//		List<Alien> aliens = Arrays.asList(a1,a2);
		return repo.aliens;
	}
	
	@POST
	@Path("alien")
	public Alien createAlien(Alien al)
	{
		System.out.println(al);
		repo.create(al);
		return al;
	}
	
	@GET
	@Path("alien/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Alien getOneAlien(@PathParam("id") int id)
	{
		return repo.getAlien(101);
	}
	
}
