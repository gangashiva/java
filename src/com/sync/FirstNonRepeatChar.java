package com.sync;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatChar {

  public static void main(String[] args) {
    System.out.println(findFirstNonRepeatingChar("ababcd"));
  }

  public static int findFirstNonRepeatingChar(String str){
    Map<Character, Integer> characterFrequenyMap = new HashMap<>();
    char[] chars = str.toCharArray();//aba
    for (char ch : chars){
      characterFrequenyMap.put(ch,characterFrequenyMap.getOrDefault(ch,0) + 1);
    }
    for (int i = 0; i<chars.length; i++)
    {
      char ch = chars[i];
      if (characterFrequenyMap.get(ch) == 1){
        return i;
      }
    }
    return -1;
  }

}
