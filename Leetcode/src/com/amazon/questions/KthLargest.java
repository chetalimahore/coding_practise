package com.amazon.questions;

import java.util.Comparator;
import java.util.PriorityQueue;


//23280666818846


public class KthLargest {
	
	public static int findKthLargest(int[] nums, int k) {
        
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {

			//return a-b - arranges in ascending order
			
			//a-b > 1, that means the first number is greater than second number, it will replace 
			//a-b < 1, that means first number is smaller than second number, it wont replace 
			//a-b == 0, that means no need to sort
			
			@Override
			public int compare(Integer a, Integer b) {
				// TODO Auto-generated method stub
				return a-b;
				
			}
			
			
			//return b-a : arranges in descending order
			
			//a-b > 1, that means the first number is greater than second number, it wont replace 
			//a-b < 1, that means first number is smaller than second number, it will replace 
			//a-b == 0, that means no need to sort
			
//			@Override
//			public int compare(Integer a, Integer b)
//			{
//				return b-a;
//			}
			
		});
		
		for(int i = 0; i < nums.length; i++) {
			pq.add(nums[i]);
			if(pq.size() > k) {
				System.out.println(pq.poll());
			}
		}
		
		
		return pq.peek();
    }

	public static int thirdMax(int[] nums) {
	        
	        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>(){
	            
	            @Override
	            public int compare(Integer a, Integer b){
	                return b-a; //sorts in ascending order
	            }
	        });
	        
	        for(int i = 0 ; i < nums.length; i++){
	            pq.add(nums[i]);
	            if(pq.size() > 3) {
	                pq.poll();
	            }
	        }
	        
	        int size = pq.size();
	        
	        if(size >= 3) {
	            while(size > 1)
	            {
	                pq.poll();
	                size--;
	            }
	            return pq.peek();
	        }
	        else{
	            return pq.peek();
	        }
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,3,4,5};
		//int nums[] = {3,2,1};
		
		//System.out.println(thirdMax(nums));
		System.out.println(findKthLargest(nums, 2));
		
		
	}

}
