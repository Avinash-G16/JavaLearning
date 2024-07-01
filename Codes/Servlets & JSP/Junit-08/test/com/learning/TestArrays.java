package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestArrays {

	@Test
	void test() {
		int[] expected = {2,4,6,8};
		int[] actual = {4,6,8,2};
//		int[] actual = {2,4,6,8};
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
		//assertEquals(expected, actual) //it will fail because it checks references not the actual data
		//fail("Not yet implemented");
	}

}
