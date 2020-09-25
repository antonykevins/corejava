package com.codes.challenges;

import java.util.Scanner;

public class PrimeNumber {
	// Prime number is a number that is divisible only by itself and 1.
	// Eg. 2, 3, 5, 7, 11
		
	//Case 1:	
	// Input : 29
	//Output: 29 is a Prime number
		
	//Case 2:
	//Input: 28
	//Output: 28 is Not a prime number 
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please enter the number to verify prime number or not.. ");
		int num = sc.nextInt();
		for(int i=2; i<= num/2;i++) {
			if(num %i ==0) {
				System.out.println(num+" is Not a prime number ");
				System.exit(1);
			}
		}
		System.out.println(num+ " is a Prime number");
		
	}
		


}
