package com.avinash;
import static org.junit.Assert.*;
public class JunitlearningTest
{
	@Test
	public void test()
	{
		Junitlearning j = new Junitlearning();
		int actual = j.divide(10,5);
		int expectedResult = 2;
		assertEquals(expectedResult, actual);
		//fail("Not yet implemented");
	}
}