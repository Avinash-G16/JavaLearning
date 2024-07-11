package com.avinash.HibernateDemo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop 
{
	@Id
	private int lid;
	private String lname;
	
	private int price;
	
//	@ManyToOne
//	private Alien alien;
	
//	@ManyToOne
//	private Student student;
//	@ManyToMany
//	private List<Student> students = new ArrayList<Student>();
	
	
//public List<Student> getStudents() {
//		return students;
//	}
//	public void setStudents(List<Student> students) {
//		this.students = students;
//	}
	//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
//	public Alien getAlien() {
//		return alien;
//	}
//	public void setAlien(Alien alien) {
//		this.alien = alien;
//	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
}