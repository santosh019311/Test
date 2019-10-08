package com.app.string;

public class reverseWithoutAPI {

	public static void main(String[] args) {
	String str="Santosh Kumar";
	String [] arr=str.split(" ");
	System.out.print("Reversed String of "+str+":");
	for(int i=arr.length-1;i>=0;i--) {
		char temp[]=arr[i].toCharArray();
		for(int j=temp.length-1;j>=0;j--) {
			System.out.print(temp[j]);
		}
		System.out.print(" ");
	}
	}

}
