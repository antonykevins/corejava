package com.codes.challenges;

import java.util.Scanner;

public class ArmstrongNumber {
	// Armstrong number is a number that is equal to the sum of cubes of its digits
	// Eg. 153
	// (1*1*1)=1  
	// (5*5*5)=125  
	// (3*3*3)=27
	// 1 + 125 + 27 = 153
	
	//Case 1:	
	// Input : 153
	// Output: Sum of the cubes of digits is 153
	// Output: 153 is a Armstrong Number
	
	//Case 2:
	//Input : 143
	//Output:Sum of the cubes of digits is 92
	//Output: 143 is not a Armstrong Number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please enter the number to verify Armstrong number or not.. ");
		int num = sc.nextInt();
		checkArmstrongNumber(num);
	}
	

	static void checkArmstrongNumber(int num) {
		int actNum=num;
		int rem,pro=1,sum=0;
		while(num>0) {
			rem=num%10;
			for(int i=3;i>0;i--) { //changed the loop count as its cube 
				pro *=rem; //changed one variable from Strong number code
			}
			sum+=pro;
			num=num/10;
			pro=1;
		}
		System.out.println("Sum of the cubes of digits is "+sum);
		if(sum==actNum) 
			System.out.println(actNum+" is a Armstrong Number");
		else
			System.out.println(actNum+" is not a Armstrong Number");
	}

}
