package com.sync.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpDemo {

	public static void main(String[] args) {
		System.out.println("Hello");
		Arrays.asList("AAAAé 4546DDDD,éDDDDD".split("[\\p{L}]+")).forEach(System.out::println);
		//[\\p{L}]	,
		//[\\P{L}]  AAAA DDDD DDDDD
		
		Pattern pattern = Pattern.compile("[\\p{L}' -!]+");
		Matcher matcher = pattern.matcher("abcdABCD'-");
		System.out.println("======>> "+matcher.matches());
		

	}

}
