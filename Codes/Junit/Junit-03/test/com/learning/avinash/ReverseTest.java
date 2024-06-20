package com.learning.avinash;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseTest {

	@Test
	void test() {
		Reverse r = new Reverse();
		String actual = r.reverse("Java");
		String expected = "avaJ";
		assertEquals(expected, actual);
		assertEquals("neilA", r.reverse("Alien"));
		
		//fail("Not yet implemented");
	}

}
