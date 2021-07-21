package com.sync.test;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		System.out.println("User input string more then  charactors are not valid!".length());
		List<String> al = new ArrayList<>();
		al.add("Hello");
		al.add("Hi");
		al.add("Shivu");
		
		//System.out.println(al);
		//System.out.println(al.toString());
		//System.out.println(encode("hello"));
		System.out.println(encode(al.toString()));
	}
	
	public static String encode(String str) {
		System.out.println("str: "+str);
		return str;
	}

}
