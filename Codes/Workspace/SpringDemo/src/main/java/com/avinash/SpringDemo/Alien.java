package com.avinash.SpringDemo;

public class Alien 
{
	private int age;
	private Computer com;
//	private Laptop laptop;
//	public Laptop getLaptop() {
//		return laptop;
//	}
//	public Alien(int age) {s
//		this.age = age;
//	}
//	public void setLaptop(Laptop lap) {
//		this.laptop = lap;
//	}
	public int getAge() {
		return age;
	}
	public Computer getCom() {
		return com;
	}
	public void setCom(Computer com) {
		this.com = com;
	}
	public void setAge(int age) {
		System.out.println("Age is assigned");
		this.age = age;
	}
	public Alien()
	{
		System.out.println("Alien Object Created...");
	}
	public void code()
	{
		System.out.println("I am Coding");
		com.compile();
	}
}
