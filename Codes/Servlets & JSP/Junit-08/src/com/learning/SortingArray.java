package com.learning;

import java.util.Arrays;

public class SortingArray {
	public int[] sortingArrays(int[] array) {
//		Arrays.sort(array);
//		return array;
		
		for(int i = 0; i<1000000;i++)
		{
			Arrays.sort(array);
		}
		return array;
	}
}
