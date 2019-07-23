package com.amazon;

public class ValidAnagrams {

	public static boolean isAnagram(String s, String t) {
        int arr[] = new int[26];
        int index = 0;
        
        for(int i = 0; i < s.length() ; i++)
        {
            index = s.charAt(i) - 'a';
            arr[index]++;
        }
        
        for(int i = 0; i < t.length() ; i++)
        {
            index = t.charAt(i) - 'a';
            arr[index]--;
        }
        
        for(int i = 0; i < arr.length ; i++)
        {
            if(arr[i] != 0){
                 return false;
            }
            
        }
        
        return true;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("anagram", "anagramc"));
	}

}
