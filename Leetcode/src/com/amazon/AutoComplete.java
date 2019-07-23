package com.amazon;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;


public class AutoComplete {
	
	TrieNode root;
	String prefix;
	
	class TrieNode{
		Map<Character, TrieNode> map;
		Map<String, Integer> counts;
		boolean isWord;
		
		public TrieNode() {
			map = new HashMap<Character, TrieNode>();
			counts = new HashMap<String, Integer>();  // the importance of saving the string along with counts is when we 
			//reach that character, we can easily retrieve
			isWord = false;
		}
	}
	
	class Pair{
		String str;
		int count;
		
		Pair(String s, int c){
			str = s;
			count = c;
		}
	}
	
	public AutoComplete(String[] sentences, int times[]) {
		
		root = new TrieNode();
		prefix = "";
		
		for(int i = 0; i < sentences.length ; i++) {
			addSentence(sentences[i], times[i]);
		}
	}
	
	private void addSentence(String sentence, int count) {
		TrieNode curr = root;
		
		
		char[] charArray = sentence.toCharArray();
		for(char ch: charArray) {
			TrieNode next = curr.map.get(ch);
			
			if(next == null) {
				next = new TrieNode();
				curr.map.put(ch, next);
			}
			curr = next;
			curr.counts.put(sentence, curr.counts.getOrDefault(sentence, 0) + count);  // for every trienode, if the character is diff, then the count will be diff too
		}
		
		curr.isWord = true;
	}
	
	public List<String> input(char c){
		if(c == '#') {
			addSentence(prefix , 1);
			prefix = "";
			return new ArrayList<>();
		}
		
		TrieNode curr = root;
		prefix = prefix + c;
		char arr[] = prefix.toCharArray();
		
		for(char ch: arr) {
			TrieNode next = curr.map.get(ch);
			if(next == null) {
				return new ArrayList<>();  // there are no corresponding matchhes, so return {}
			}
			curr = next;
		}
		
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a, b) -> b.count - a.count);
		
		for(String s : curr.counts.keySet()) {
			pq.add(new Pair(s, curr.counts.get(s)));
		}
		
		List<String> result = new ArrayList();
		
		for(int i = 0; i < 3 && !pq.isEmpty() ; i++) {
			Pair p = pq.poll();
			result.add(p.str);
		}
		
		return result;
	}
	
	
	
	public static void main(String args[]) {
		
		String []sentences = {"i love you", "i hate you"};
		int counts[] = {3,2};
		AutoComplete autoComplete = new AutoComplete(sentences, counts);
		
		List<String> result = autoComplete.input('i');
		System.out.println(result.size());
	}
}
