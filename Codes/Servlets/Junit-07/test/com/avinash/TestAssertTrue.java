package com.avinash;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAssertTrue {

	@Test
	void test() {
//		String str = "Junit";
//		assertTrue(str.equals("JUNIT"));
		//fail("Not yet implemented");
		String str = "Junit5";
		assertFalse(str.length()<5);
	}

}
