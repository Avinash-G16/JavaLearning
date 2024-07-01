package com.avinash.RestDemo;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alien 
{
	private String name;
	private int points;
	private int aid;
	public int getAid() {
		return aid;
	}
	@Override
	public String toString() {
		return "Alien [name=" + name + ", points=" + points + ", aid=" + aid + "]";
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
}
