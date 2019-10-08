package com.app.array;

public class SecMaxNum {

	public static void main(String[] args) {
		int[] input = { 1, 5, 10, 11, 11, 4, 2, 8, 1, 8, 9, 8 };
        int large = 0, second = 0;

        for (int i = 0; i < input.length - 1; i = i + 2) {
            System.out.println(i);
            int fist = input[i];
            int sec = input[i + 1];
            if (sec >= fist) {
                int temp = fist;
                fist = sec;
                sec = temp;
            }
            if (fist >= second) {
                if (fist >= large) {
                    large = fist;
                } else {
                    second = fist;
                }

            }

            if (sec >= second) {
                if (sec >= large) {
                    large = sec;
                } else {
                    second = sec;
                }
            }
        }
System.out.println("second : "+second);
	}

}
