package com.amazon;

import java.util.HashMap;
import java.util.Arrays;
import java.util.List;

public class MostCommonWord {

	 public static String mostCommonWord(String paragraph, String[] banned) {
	        String [] words = paragraph.replaceAll("[!?',;.]", "").toLowerCase().split(" ");
	        HashMap<String, Integer> map = new HashMap<String, Integer>();
	        List<String> list = Arrays.asList(banned);
	        String result = null;
	        int maximum = 0;
	        
	        //O(n) time to insert into map if the word is not present in the banned list
	        for(String word: words){
	            if(map.containsKey(word)){
	                map.put(word, map.get(word) + 1);
	            }
	            else{
	               if(!list.contains(word)){
	                    map.put(word, 1);
	                }
	            }
	        }
	        
	        for(String key : map.keySet()){
	            int value = map.get(key);
	            if(value > maximum){
	                maximum = value;
	                result = key;
	            }
	        }
	        
	        return result;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paragraph = "a, a, a, a, b,b,b,c, c";
		String [] banned = {"a"};
		
		String test = "chetalimahore";
		
		System.out.println(test.substring(0,7));
		
		System.out.println(mostCommonWord(paragraph, banned));
	}

}
