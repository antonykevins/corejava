package com.codes.challenges;

import java.util.Scanner;

public class DuplicateElementArray {
	//Duplicate element in int array
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array..");
		int size=sc.nextInt();
		int[] arr = new int[size];
		int sum = 0,temp=0;
		for(int i=0;i<size;i++) {
			System.out.println("Enter the number "+(i+1));
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<size-1;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate is "+arr[i]);
				}
			}
		}
		
	}

}
