package com.learning.avinash;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {

	@Test
	void testComputeSquareArea() {
		Shapes sh = new Shapes();
		assertEquals(576, sh.computeSquareArea(24));
		//fail("Not yet implemented");
	}
	
	@Test
	void testComputeCircleArea()
	{
		Shapes sh = new Shapes();
		assertEquals(78.5,sh.computeCircleArea(5),"Area of circle calculation is wrong"); //here string is getting evaluated even if test case is pass
	}
	
	@Test
	void testComputeCircleArea_Supplier()
	{
		Shapes sh = new Shapes();
		assertEquals(75.5, sh.computeCircleArea(5),()->"Area of circle calculation is wrong"); //here in supplier interface -> test case only gets evaluated if test case is failed.
	}
	
	@Test
	void testComputeRectangleArea()
	{
		Shapes sh = new Shapes();
//		assertNotEquals(500, sh.computeRectangleArea(10, 50));
		assertNotEquals(520, sh.computeRectangleArea(10,50));
	}
	
	@Test
	void test()
	{
		String stri = "junit";
		assertTrue(stri.equals("JUNIT"));
	}

}
