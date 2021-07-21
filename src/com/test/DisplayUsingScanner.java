package com.test;

import java.util.Scanner;

public class DisplayUsingScanner {

	public static void main(String[] args) {
		System.out.println("Please enter any string");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("Entered String is: "+input);
		if(input.contains("t")) {
			System.out.println("t");
		}
		if(input.contains("r")) {
			System.out.println("r");
		}
		if(input.contains("m")) {
			System.out.println("m");
		}

	}

}
