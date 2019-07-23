package com.microsoft;

public class isPalindrome {

	public static boolean isOneEditDistance1(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        int count = 0;
        
        for(int i = 0, j= 0 ; i < len1 && j < len2 ; ){
            if(s.charAt(i) == t.charAt(j)){
                i++; j++;
                continue;
            }
            else 
            {
                if(len1 > len2){
                   // len1 = len1 - 1;
                    i++;
                }
                else if(len1 < len2){
                    //len2 = len2 - 1;
                    j++;
                }
                else{
                    i++;j++;
                }
                
                count++;
                
                if(count > 1) {
                    return false;
                }
            }
        }
        
        return true;
    }
	
	public static boolean isOneEditDistance2(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        int count = 0;
        int i =0, j=0;
        
         if( (len1 == 0 || len2 == 0) && (Math.abs(len1-len2) == 1)){
             return true;
         }
        
        for( ; i < len1 && j < len2 ; ){
            if(s.charAt(i) == t.charAt(j)){
                i++; j++;
                continue;
            }
            else 
            {
                if(len1 > len2){
                    //len1 = len1 - 1;
                    i++;
                }
                else if(len1 < len2){
                    //len2 = len2 - 1;
                    j++;
                }
                else{
                    i++;j++;
                }
                
                count++;
                if(count > 1)return false;
                
            }
        }
        
        if(i < len1 || j < len2) {
        	count++;
        }
        
        return count == 1 ;
    }
	
	

	public static boolean isOneEditDistance(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        int i = 0 , j = 0;
        boolean flag = false;
//        
//        String s1 = len1< len2 ? s :t;
//        String s2 = len1 < len2 ? t:s;
//        
        while(i < len1 && j < len2) {
        	if(s.charAt(i) != t.charAt(j)) {
        		if(flag) return false;
        		flag = true;
        	}
        	i++; j++;
        }
        
        return true;
         
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isOneEditDistance2("cab", "ad"));
	}

}
