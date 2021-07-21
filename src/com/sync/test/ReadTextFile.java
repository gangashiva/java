package com.sync.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadTextFile {
	private static boolean flag = false;
	public static void main(String[] args) {

		if(flag) {
			System.out.println("flag: "+flag);
		}
		if(!flag) {
			System.out.println("!flag: "+flag);
		}
		File file = new File("/Users/gmum0001/Desktop/shiva/Test/Test/src/com/sync/test/data.txt");
		//File directory = new File("./");
		System.out.println(file.getAbsolutePath());
		String readLine = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			System.out.println("Reading file using Bufferd reader");
			while((readLine= br.readLine())!=null) {
				System.out.println(readLine);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
