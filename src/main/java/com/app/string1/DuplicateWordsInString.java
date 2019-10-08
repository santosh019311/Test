package com.app.string1;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInString {
	static void duplicateWords(String inputString) {
		String[] words = inputString.split(" ");
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		for (String word : words) {
			if (wordCount.containsKey(word.toLowerCase())) {
				wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase()) + 1);
			} else {
				wordCount.put(word.toLowerCase(), 1);
			}

			Set<String> wordsInString = wordCount.keySet();
			for (String word1 : wordsInString) {
				if (wordCount.get(word1) > 1) {

					System.out.println(word1 + " : " + wordCount.get(word1));
				}
			}
		}
	}

	public static void main(String[] args) {
		duplicateWords("Hello sathya and sathya");
		duplicateWords("Java is java again java");
		duplicateWords("Super Man Bat Man Spider Man");
	}

}
