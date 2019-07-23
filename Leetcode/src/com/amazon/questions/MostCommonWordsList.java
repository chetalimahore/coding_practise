package com.amazon.questions;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MostCommonWordsList {

	public static List<String> mostCommonWordsList(String literatureText, List<String> wordsToExclude){
		
		String[] words = literatureText.split(" ");
		List<String> list = new ArrayList();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int maximumCount = 0;
		int count = 0;
		
		for(String word : words) {
			if(!wordsToExclude.contains(word)) {
				map.put(word, map.getOrDefault(word,0) + 1);
				count = map.get(word);
				maximumCount = maximumCount > count ? maximumCount : count;
			}
		}
		
		for(String key : map.keySet()) {
			count = map.get(key);
			if(count == maximumCount) {
				list.add(key);
			}
		}
		
		return list;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String literatureText = "jack and jill went to the market to buy cheese and bread cheese is jack favourite food";
		List<String> wordsToExclude = Arrays.asList("and", "he", "the", "to", "is");
		
		String literatureText = "";
		
		List<String> result = mostCommonWordsList(literatureText, wordsToExclude);
		
		for(String word: result) {
			System.out.println(word);
		}
	}

}
