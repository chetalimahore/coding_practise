package com.amazon;

public class FirstDistinctChar {

	public static int firstUniqChar(String s) {
        if(s.length() == 0)
            return -1;
        
        int minIdx = s.length();
        
        for(char i = 'a'; i<='z'; i++){
            int fp = s.indexOf(i);
            int lp = s.lastIndexOf(i);
            if(fp != -1 && fp == lp)
                minIdx = Math.min(minIdx, fp);
        }
        
        return minIdx == s.length() ? -1 : minIdx;
    }
	
	public static int findFirstChar(String s) {
		int bucket[]= new int[26];
        
        for(int i = 0 ; i < s.length(); i++){
            bucket[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0 ; i < s.length() ;i++){
            if(bucket[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        
        return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First uniq char"+ findFirstChar("goag"));
	}

}
