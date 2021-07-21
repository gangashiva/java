package com.sync.test;

import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String args[]){  
		//System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true  
		//System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)  
		//System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true  
		//System.out.println("======>>> "+Pattern.matches("[a-zA-Z]{6}", "[a-zA-Z]"));//false ($ is not matched)  
	String regex = "^[A-Za-z0-9_-]*$";
	if(regex.contains("^[A-Za-z")||(regex.contains("^[a-zA-Z"))) {
		System.out.println("Yes");
	}
else {
	System.out.println("No....!");
}
	}

}
