package com.learning.avinash;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseTest {
	Reverse r = new Reverse();
	@Test
	void testReverseStringOneWord() 
	{
		assertEquals("matuaG", r.reverse("Gautam"));
		//fail("Not yet implemented");
	}
	
	@Test
	void testReverseStringMultipleWords()
	{
		assertEquals("ysae si avaJ", r.reverse("Java is easy"));
	}

}