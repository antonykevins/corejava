package com.codes.challenges;

import java.util.Scanner;

public class SortLengthyWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the words to be sorted..");
		String s = sc.nextLine();
		String[]c = s.split(" ");
		String temp ="";
		for(int i=0; i <c.length-1;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i].length()>c[j].length()) {
					temp=c[j];
					c[j]=c[i];
					c[i]=temp;
				}
					
			}
		}
		for (String string : c) {
			System.out.println(string);
		}
	}

}
