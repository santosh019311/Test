package com.app.array;

public class SecondLargest1 {
	public static int secondLargest(int[] input) {
        int largest,secondLargest;

        if(input[0] > input[1]) {
            largest = input[0];
            secondLargest = input[1];
        }
        else {
            largest = input[1];
            secondLargest = input[0];
        }

        for(int i = 2; i < input.length; i++) {
            if((input[i] <= largest) && input[i] > secondLargest) {
                secondLargest = input[i];
            }

            if(input[i] > largest) {
                secondLargest = largest;
                largest = input[i];
            }
        }

        return secondLargest;
    }
	public static void main(String[] args) {
		int []arr= {2,4,3,2,5,5};
		System.out.println("Second Largest :"+secondLargest(arr));
	}
}
