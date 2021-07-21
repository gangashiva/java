package com.sync.test;

public class CyclicRotation {
	public static void main(String[] args) {
		System.out.println(isCyclicRotation("water", "aterw"));
		
	}
	
	public static boolean isCyclicRotation(String originalString, String rotatedSting) {
		String resultString = originalString.concat(originalString);
		if(originalString.length()==rotatedSting.length() && resultString.contains(rotatedSting)) {
			return true;
		}
		else {
			return false;
		}
	}

}
