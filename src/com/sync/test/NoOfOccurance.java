package com.sync.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NoOfOccurance {

	public static void main(String[] args) {
		//String s = "Bangalore";
		System.err.println("Please enter any string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(findNoOfOccurances(s));
	}

	public static Map<Character, Integer> findNoOfOccurances(String str){
		System.out.println("Hello");
		Map<Character, Integer> hm = new HashMap<>();
		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if(hm.get(c)==null) {
				hm.put(c, 1);
			}
			else {
				int number = hm.get(c);
				number++;
				hm.put(c, number);
			}
		}
		return hm;
	}

}
