package com.app.array;

public class SecondLargest {
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
	int []arr= {3,4,3,5,5,5,6,6};
	int m=RemoveDuplicate.removeDuplicateElements(arr,arr.length);
	System.out.println("I "+m);
	System.out.println("Second Largest "+secondLargest(arr));

	int largest=arr[0];
	int secondLargest=arr[0];
	System.out.println("The given array is :");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"\t");
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>largest) {
			secondLargest=largest;
			largest=arr[i];
		}
		else if(arr[i]>secondLargest) {
			secondLargest=arr[i];
		}
	}
		
	System.out.println("\nSecond largest number is:" + secondLargest);

}
}
