package com.codes.challenges;

import java.util.Scanner;

public class FibonacciSeries {
	// The Fibonacci Sequence is the series of numbers.
	// The next number is found by adding up the two numbers before it
	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
		
	//Case 1:	
	// Input : 10
	//Output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

	public static void main(String[] args) {
		int a=0,b=1,c;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please enter the range of fibonacci series.. ");
		int num = sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<num;i++) {
			c = a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
