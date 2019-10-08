package com.app.string;

import java.util.HashMap;

public class EachCharCountInString {
	static void characterCount(String inputString) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		// converting given string into char array
		char[] charArray = inputString.toCharArray();
		// checking each char of the string
		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				// If char is present in charCountMap, incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				charCountMap.put(c, 1);
			}

		}
		// Printing the charCountMap
		System.out.println(charCountMap);
	}

	public static void main(String[] args) {
		characterCount("Java J2EE Java JSP J2EE");

		characterCount("All Is Well");

		characterCount("Done And Gone");
	}
}
