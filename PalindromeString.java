package com.codes.challenges;

import java.util.Scanner;

public class PalindromeString {
	// Palindrome string has the characters that are read the same backward as forward
	// Eg. Civic
	
	//Case 1:	
	// Input : Abba
	//Output : Palindrome String
	
	//Case 2:
	//Input : BoneyM
	//Output: Not a Palindrome String
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please enter the Word to verify Palindrome or not.. ");
		String str = sc.nextLine();
		str.toLowerCase(); //Incase od starting in Uppercase
		palindromeChecker(str);
		
	}
	
	static void palindromeChecker(String str) {
		char[]ch = str.toCharArray();
		int j= ch.length-1;
		int i=0;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
					System.out.println("Not a Palindrome String");
					System.exit(1);
				}
			i++;
			j--;
		}
		System.out.println("Palindrome String");;
	}

}


