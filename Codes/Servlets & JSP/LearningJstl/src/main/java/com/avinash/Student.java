package com.avinash;

public class Student 
{
	int rollno;
	String Name;
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		Name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", Name=" + Name + "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

}
