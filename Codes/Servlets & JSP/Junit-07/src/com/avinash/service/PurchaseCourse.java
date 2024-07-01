package com.avinash.service;
import com.learning.dao.Course;
public class PurchaseCourse {
	private Course course;
	public boolean proceedWithCourse(Course course)
	{
		return course.coursePurchased();
	}
}
