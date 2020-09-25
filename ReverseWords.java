package com.codes.challenges;

import java.util.Scanner;

public class ReverseWords {
	// 2. Reverse A Sentence
	// Im a Lazy Coder.. Copied reverse method from previous program :p
	
	// Input : 'Hello, How are you?'
	// Output: ',olleH woH era ?uoy'
	
	public static void main(String[] args) {
		String result="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence to be reversed..");
		String sentence = sc.nextLine();
		String[]words = sentence.split(" ");
		for (String string : words) {
			result += reverse(string) + " ";
		}
		System.out.println(result);

	}
	static String reverse(String str) {
		char[] ch = str.toCharArray();
		String localResult="";
		for(int i=str.length()-1;i>=0;i--) {
			localResult +=ch[i];
		}
		return localResult;
	}

}
