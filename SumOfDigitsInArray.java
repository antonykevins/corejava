package com.codes.challenges;

import java.util.Scanner;

public class SumOfDigitsInArray {
	// Sum Of Numbers in User input array

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array..");
		int size=sc.nextInt();
		int[] arr = new int[size];
		int sum = 0,temp=0;
		for(int i=0;i<size;i++) {
			System.out.println("Enter the element "+(i+1));
			arr[i] = sc.nextInt();
		}
		for (int i : arr) {
			System.out.println("Elements are :"+arr[i]);
			sum+=arr[i];
		}
		System.out.println("Sum of elements is "+sum);
		
	}

}
