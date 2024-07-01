package com.learning;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestException {

	@Test
	void testSortingArrayException() {
//		try {
			SortingArray sa = new SortingArray();
			int unsorted[] = {2,1,4};
////			int unsorted[] = null;
//			int[] arr = sa.sortingArrays(unsorted);
//			for(int n: arr)
//			{
//				System.out.println(n+ " ");
//			}
//			fail(); // it will not happen if code generates an exception
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println(e);
//		}
		assertThrows(NullPointerException.class,()->sa.sortingArrays(unsorted));
		//fail("Not yet implemented");
	}

}
