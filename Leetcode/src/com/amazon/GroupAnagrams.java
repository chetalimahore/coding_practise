package com.amazon;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class GroupAnagrams {

	public static List<List<String>> groupAnagrams(String[] strs) {
        boolean added[] = new boolean[strs.length];
        List<List<String>> result = new ArrayList();
        boolean flag = true;
    
        for(int i = 0 ; i < strs.length ;i++)
        {
            added[i] = true;
            int arr[] = new int[256];
            List<String> list = new ArrayList();
            list.add(strs[i]);
            
            //store the character count of string in arr
           
            for(int k = i+1; k < strs.length ;k++)
            {

                if(added[k] == false)
                {
            	 for(int j = 0; j < strs[i].length() ; j++)
                 {
                     arr[strs[i].charAt(j) - 'a']++;
                 }
            	
                    for(int m = 0; m < strs[k].length() ; m++)
                    {
                        arr[strs[k].charAt(m) - 'a']--;
                    }

                    for(int m = 0; m < arr.length ; m++)
                    {
                        if(arr[m] != 0){
//                        	System.out.println("not matched = " + strs[k]);
                             flag = false;
                             Arrays.fill(arr, 0);
                             break;
                        }
                        
                        if(flag == false)
                        	break;
                        //System.out.println("value after break = "+ m);
                    }
                    
                }
                
                if(flag)
                {
                    list.add(strs[k]);
                    added[k] = true;
                }
            
            }
            result.add(list);
        }
        
        return result;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"eat","tea","tan","ate"};
		System.out.println(groupAnagrams(strs));
	}

}
