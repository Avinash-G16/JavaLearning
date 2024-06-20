package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class JunitTrial {

	@BeforeAll
	static void beforeAll() //no need of static if TestInstance is used
	{
		//before all tests only once
	}
	
	Shapes shape;
	@BeforeEach 
	void init()
	{
		//before every test
		shape = new Shapes();
		System.out.println("Before test");
	}
	@AfterEach 
	void destroy()
	{
		//after every test
		shape = new Shapes();
		System.out.println("Before test");
	}
	@AfterAll
	static void afterAll() //no need of static if TestInstance is used
	{
		//after all tests only once
	}
	@Test
	void test() {
		
		assertEquals(6,6);
		//fail("Not yet implemented");
	}
	
	@Test
	void testComputeSquareArea()
	{
		assertEquals(576, shape.computeSquareArea(24));
	}
}
