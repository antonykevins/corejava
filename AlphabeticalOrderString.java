package com.codes.challenges;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalOrderString {
	// Alphabetical Order of given word
	
	// Input :  bad boys
	// Output:  abbdosy
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be arranged in order..");
		String s = sc.nextLine();
		char c[]= s.toCharArray();
		//Arrays.sort(c); //Easy Approach :p
		char temp;
		for(int i =0;i<c.length-1;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]>c[j]) {
					temp=c[j];
					c[j]=c[i];
					c[i]=temp;
				}
			}
		}
		System.out.println("Arranged Order is ");
		System.out.println(c);
	}

}
