package com.amazon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

//	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
//	    wordList.add(endWord);
//	    Queue<String> queue = new LinkedList<String>();
//	    queue.add(beginWord);
//	    int level = 0;
//	    while(!queue.isEmpty()){
//	        int size = queue.size();
//	        for(int i = 0; i < size; i++){
//	            String cur = queue.remove();
//	            if(cur.equals(endWord)){ return level + 1;}
//	            for(int j = 0; j < cur.length(); j++){
//	                char[] word = cur.toCharArray();
//	                for(char ch = 'a'; ch < 'z'; ch++){
//	                    word[j] = ch;
//	                    String check = new String(word);
//	                    if(!check.equals(cur) && wordList.contains(check)){
//	                        queue.add(check);
//	                        wordList.remove(check);
//	                    }
//	                }
//	            }
//	        }
//	        level++;
//	    }
//	    return 0;
//	}
//	
	
	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> reached = new HashSet();
        Queue<String> queue = new LinkedList();
        int level = 0;
        wordList.add(endWord);
        
        reached.add(beginWord);
        queue.add(beginWord);
        
        while(!queue.isEmpty())
        {
            int size = queue.size();
            
            for(int k = 0 ; k < size ; k++)
            {
                String word = queue.poll();
                char[] wordArray = word.toCharArray();
                if(endWord.equals(word)) return level+1;

                for(int i = 0 ; i < wordArray.length ; i++)
                {
                    char temp = wordArray[i];
                    for(char j = 'a' ; j <= 'z' ; j++)
                    {
                        wordArray[i] = j;
                        String wordFormed = new String(wordArray);

                        if(wordList.contains(wordFormed))
                        {

                            queue.add(wordFormed);
                            wordList.remove(wordFormed);

                        }
                    }

                    wordArray[i] = temp;
                }
            }
            level++;
        }
        
        return 0;
        
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> wordList = new ArrayList();
		//["hot","dot","dog","lot","log","cog"]
		wordList.add("hot");
		wordList.add("dot");
		wordList.add("dog");
		wordList.add("lot");
		wordList.add("log");
		wordList.add("cog");
		
		System.out.println(ladderLength("hit", "dog", wordList));
		
	}

}
