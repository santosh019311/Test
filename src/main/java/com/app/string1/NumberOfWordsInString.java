package com.app.string1;

import java.util.Scanner;

public class NumberOfWordsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		String[] words = s.trim().split(" ");
		System.out.println("Words in string  " + words.length);
	}

}
