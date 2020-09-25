package com.codes.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccurancesInString {
	//Character count in a string
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to see repeated elements..");
		String str = sc.nextLine();
		duplicatesCalculator(str);
	}
	
	static void duplicatesCalculator(String s) {
		char[]ch = s.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(int i=0; i<ch.length;i++) {
			if(charMap.containsKey(ch[i])) {
				charMap.put(ch[i], charMap.get(ch[i]) + 1);
			}else{
				charMap.put(ch[i], 1);
			}
		}
		for (Map.Entry<Character, Integer>map : charMap.entrySet()) {
			System.out.println("Character is "+map.getKey()+" count is "+map.getValue());
		}
	}
}
