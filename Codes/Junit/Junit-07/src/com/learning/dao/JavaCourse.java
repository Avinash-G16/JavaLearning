package com.learning.dao;

public class JavaCourse implements Course {
	@Override
	public boolean coursePurchased()
	{
		System.out.println("Java Course purchased");
		System.out.println("It is not connecting to db hence result is false");
		return false;
	}
}
