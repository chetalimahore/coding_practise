package com.strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChars {
    public static int lengthOfLongestSubstring(String s) {
        int result = 0, i = 0 , j= 0;
        int length = s.length();
        HashSet<Character> set = new HashSet<>();
        
        
        while(i < length && j < length){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                result = Math.max(result, j - i);
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        
        return result;
    }
    
    
    
    public static void main(String args[]) {
    	System.out.println(lengthOfLongestSubstring("abcabcbb"));
    	
    }
}
