package com.app.string1;

import java.util.Arrays;

public class SortStringApi {

	public static void main(String[] args) {
		String s = "Santosh";
		char[] chars = s.toLowerCase().toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		System.out.println(sorted);
	}

}
