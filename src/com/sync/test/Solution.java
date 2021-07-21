package com.sync.test;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution
{
public static void main(String[] args){
 Scanner in = new Scanner(System.in);
 int testCases = Integer.parseInt(in.nextLine());
 while(testCases>0){
    String pattern = in.nextLine();
     try
     {
         Pattern.compile(pattern);
     }
     catch(Exception e)
     {
        // System.out.println(e.toString());
         System.out.println("Invalid");
     }
     System.out.println("Valid");
   }
}
}