package com.codes.challenges;

import java.util.Scanner;

public class SumOfDigits {
	// Sum the individual numbers in a given number
	// Input : '6543'
	// Output: 'Sum of Digits is 18'
	public static void main(String[] args) {
		int rem=0, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number..");
		int n= sc.nextInt();
		while(n>0) {
			rem=n%10;
			sum += rem;
			rem=0;
			n=n/10;
		}
		System.out.println("Sum of Digits is "+sum);

	}

}
