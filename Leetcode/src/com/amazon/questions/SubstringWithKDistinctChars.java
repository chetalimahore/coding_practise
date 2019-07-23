package com.amazon.questions;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class SubstringWithKDistinctChars {

	public static List<String> substringWithKDistinctChars(String input, int k)
	{
		List<String> result = new ArrayList();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0 ; i+k < input.length() ; i++) {
			String temp = input.substring(i, i+k);
			boolean containsDuplicate = false;
			map.clear();
			char[] arr = temp.toCharArray();
			for(char c : arr) {
				if(map.containsKey(c)) {
					containsDuplicate = true;
					break;
				}
				else {
					map.put(c,1);
				}
			}
			
			if(!containsDuplicate) {
				result.add(temp);
			}
			
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "awaglknagawunagwkwagl";
		int k = 4;
		
		System.out.println(substringWithKDistinctChars(input, k));
	}

}
