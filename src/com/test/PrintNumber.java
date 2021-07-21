package com.test;

import java.util.Scanner;

public class PrintNumber {
	public static void main(String[] args) {
		System.out.println("Please enter any input");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		boolean result=isNumber(input);
		if(result) {
		 int resultValue = Integer.parseInt(input);
		  int a = resultValue/10;
		  int b = resultValue%10;
		  int sum = a+b;
		  if ((resultValue%sum)==0) {
			  System.out.println(resultValue+" is divisible by: "+sum);
		  }
		  else {
			  System.out.println(resultValue+" is not divisible by "+sum); 
		  }
		}
	}
	public static boolean isNumber(String inputdata) {
		try {
			int intValue = Integer.parseInt(inputdata);
			return true;
		} catch (NumberFormatException e) {
			System.err.println("The Given input: "+inputdata+" is not a number");
		}
		return false;
	}
}
