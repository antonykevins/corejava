package com.codes.challenges;

import java.util.Scanner;

public class SumOfDigitsInString {
	// Sum Of Numbers hidden in a Sentence
	// Add the numbers found in middle of String
		
	// Input : 'Hello24How78are67you'
	// Format : 24 + 78 + 67
	// Output: 'Sum of the hidden numbers is 169'
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String with hidden numbers..");
		String str= sc.nextLine();
		processor(str);
	}
	
	static void processor(String st) {
		char ch[]=st.toCharArray();
		String temp="";
		int result=0;
		for (int i=0; i<ch.length-1;i++) {
			if(Character.isDigit(ch[i])) {
				temp+=st.charAt(i);
			}else {
				if(!temp.equals("")) {
					result += Integer.parseInt(temp);
					temp="";
				}
			}
		}
		System.out.println("Sum of the hidden numbers is "+result);

	}

}
