package com.codes.challenges;

import java.util.Scanner;

public class BiggestSmallestInt {
	// Biggest and Smallest digit in an array
	
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter an int ");
			arr[i] = sc.nextInt();
		}
		int biggest=arr[0];
		int smallest=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>biggest)
				biggest=arr[i];
			if(arr[i]<smallest)
				smallest=arr[i];
		}
		System.out.println("Biggest is "+biggest);
		System.out.println("Smallest is "+smallest);
	}
}
