package com.codes.challenges;

import java.util.Scanner;

public class StrongNumber {
	// Strong number is a special number whose sum of factorial of digits is 
	//  equal to the original number
	// Eg. 1! +4! +5! =  145
	
	//Case 1:	
	// Input : 145
	//Output: Sum of Modulous is 145
	//Output: 145 is a Strong Number
	
	//Case 2:
	//Input: 165
	//Output: Sum of Modulous is 841
	//Output: 165 is not a Strong Number
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please enter the number to verify strong number or not.. ");
		int num = sc.nextInt();
		checkStrongNumber(num);
	}
	
	static void checkStrongNumber(int num) {
		int actNum=num;
		int rem,pro=1,sum=0;
		while(num>0) {
			rem=num%10;
			for(int i=rem;i>0;i--) {
				pro *=i;
			}
			sum+=pro;
			num=num/10;
			pro=1;
		}
		System.out.println("Sum of Modulous is "+sum);
		if(sum==actNum) 
			System.out.println(actNum+" is a Strong Number");
		else
			System.out.println(actNum+" is not a Strong Number");
	}

}
