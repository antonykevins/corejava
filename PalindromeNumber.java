package com.codes.challenges;

import java.util.Scanner;

public class PalindromeNumber {
	// A palindrome number  is a number that remains the same when its digits are reversed
	// Eg. 153
	
	//Case 1:	
	// Input : 1221
	//Output : Palindrome Number
	
	//Case 2:
	//Input : 1231
	//Output: Not a Palindrome Number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please enter the number to verify Palindrome number or not.. ");
		int num = sc.nextInt();
		palindromeChecker(num);
		
	}
	
	static void palindromeChecker(int num) {
		int actNum=num;
		int rem=0,sum = 0,pro = 0,revNum = 0;
		while(num>0) {
			rem=num%10;
			revNum= revNum*10+rem;
			num=num/10;
		}
		if(revNum==actNum)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");
	}
}
