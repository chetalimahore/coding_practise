package com.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeKSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int arr[] = { 12, 13, 14, 15, 16, 17, 18 }; 
//		  
//        // to index is within the range 
//        int[] copy = Arrays.copyOfRange(arr, 2, 6); 
//        for (int i : copy) 
//            System.out.print(i + "  "); 
//  
//        System.out.println(); 
//        // to index is out of range 
//        // It assigns Zero to all the index out of range 
//        int[] copy1 = Arrays.copyOfRange(arr, 4, arr.length ); 
//  
//        for (int i : copy1) 
//            System.out.print(i + "  "); 
        
		
//		String s = "abba";
//		
//		System.out.println(s.substring(1, 3));
		
		int nums[] = {1,3,-1,-3,5,3,6,7};
		
		
		maxSlidingWindow(nums, 3);
		
	}
	
		public static int[] maxSlidingWindow(int[] nums, int k) {
        
        //
       // int max[] = new int[nums.length-k+1];
        
        List<Integer> list = new ArrayList();
        
        int maximum; int p = 0;
        
        for(int i = 0 ; i <= nums.length - k; i++){
            
            maximum = nums[i];
            
            for(int j = i+1 ; j < k+i ; j++){
                if(nums[j] > maximum) {
                    maximum = nums[j];
                }
            }
            
            list.add(maximum);
        }
        
        int arr[] = new int[list.size()];
        for(int i = 0 ; i < arr.length ; i++) {
        	
            arr[i] = list.get(i);
            System.out.println(arr[i]);
        }
        
        return arr;
    }

}
