package com.sync.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[A-Za-z]");
		Matcher matcher = pattern.matcher("^[A-Za-z0-9_-]*$");

		while(matcher.find()) {
			System.out.print("Start index: " + matcher.start());
			System.out.print(" End index: " + matcher.end() + " ");
			System.out.println(" - " + matcher.group());
			System.out.println("=====>> "+matcher.matches());
			
		}
		Pattern pattern1 = Pattern.compile("abc");
		Matcher matcher1 =pattern1.matcher("abcabc");
		//System.out.println("------>> "+matcher1.matches());
		

	}

}
