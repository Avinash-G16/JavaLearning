package com.learning.avinash;

public class Reverse {
	public String reverse(String str) {
		char[] charArray = str.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		while(left<right)
		{
			char temp = charArray[left];
			charArray[left++] = charArray[right];
			charArray[right--] = temp;
		}
		return new String(charArray);
	}
}
