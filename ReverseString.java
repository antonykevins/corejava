package com.codes.challenges;

import java.util.Scanner;



public class ReverseString {
	// 1. Reverse A String
	
	// Input : 'Hello'
	// Output: 'olleH'
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the String.. ");
		String str = sc.nextLine();
		reverse(str);
	}
	static void reverse(String str) {
		char[] ch = str.toCharArray();
		String result="";
		for(int i=str.length()-1;i>=0;i--) {
			result +=ch[i];
		}
		System.out.println(result);
	}
}
