package com.audible.questions;

import java.util.Comparator;
import java.util.PriorityQueue;


public class Sellers {

	public static int returnProfit(int sellers[], int tickets) {
		int result = 0;
		int number ;
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				// TODO Auto-generated method stub
				return b-a;
				
			}
		});
		
		for(int i = 0 ; i < sellers.length ; i++) {
			pq.offer(sellers[i]);
		}
		
		for(int i = 0 ; i < tickets ;i++) {
			number = pq.poll();
			result += number;
			pq.offer(number - 1);
			
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sellers[] = {3,5};
		int tickets = 6;
		int result  = returnProfit(sellers, tickets);
		
		System.out.println(result);
	}

}
