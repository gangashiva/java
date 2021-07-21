package com.sync.test;

public class PalindromeTest {
	public static void main(String[] args) {
		System.out.println(isPalindrome("madamn"));
	}
	
	public static boolean isPalindrome(String str) {
		boolean flag=false;
		int j=str.length()-1;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
				flag=true;
			}
			else {
				flag=false;
			}
			
		}
		return flag;
	}

}
