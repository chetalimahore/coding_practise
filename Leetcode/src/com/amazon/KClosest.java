package com.amazon;

import java.util.Comparator;

import java.util.PriorityQueue;


import java.util.*;


public class KClosest {

	public static int[][] kClosest(int[][] points, int K) {
        
        //number of rows will be equal to K and number of columns will be 2 for x and y coordinate
        int result[][] = new int[K][2];
        
        if(points.length == 0) return result;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(K, 
                new Comparator<int[]>() {
            
                //point1 is considered to be an array of x1,y1 and point2 is another array of x2,y2, 
                    //we want to sort them in ascending order so that we have the least on top
                
                @Override
                public int compare(int[] point1, int[]point2){
                
                    return ((point1[0] * point1[0] + point1[1] * point1[1]) - (point2[0] * point2[0] + point2[1] * point2[1]));
                    
                }        
        });
    
        for(int i = 0 ; i < points.length ; i++){
            pq.offer(points[i]);
        }                       
                                    
        //after getting the least distance point from peek, we can remove it from the heap, so that the heap
        // is again heapified and we get the least on top
        for(int i = 0 ; i < K; i++){
            // result[i][0] = pq.peek()[0];
            // result[i][1] = pq.peek()[1];
            // pq.remove(pq.peek());
            result[i] = pq.poll();
        }                                                                                                                 
               
        return result;
    }
	
	
	
	
	
	public static List<Pair> findKClosest(int numDestinations, List<Pair> allLocations, int numDeliveries){
		
		//min distance - max heap
		List<Pair> result = new ArrayList();
		
		PriorityQueue<Pair> pq = new PriorityQueue<>(numDeliveries, new Comparator<Pair>() {
			
			@Override
			public int compare(Pair pair1, Pair pair2) {
				return ((pair2.x*pair2.x) + (pair2.y * pair2.y) - (pair1.x*pair1.x) + (pair1.y * pair1.y));
			}
		});
		
		for(Pair pair : allLocations) {
			pq.offer(pair);
			if(pq.size() > numDeliveries) {
				pq.poll();
			}
		}
		
		for(int i = 0 ; i < numDeliveries ;i++) {
			result.add(pq.poll());
		}
		
		return result;
		
	}
	
	
	public static void main(String args[]) {
//		int points[][] = {{1,3},{-2,2}};
//		int K = 1;
//		
//		int result[][]= kClosest(points, K);
//		
//		System.out.println(result[0][0] + " " + result[0][1]);
		
		List<Pair> allLocations = new ArrayList();
		Pair p1 = new Pair(3,3);
		Pair p2 = new Pair(5,-1);
		Pair p3 = new Pair(-2,4);
		
		int numDestinations = 3;
		int numDeliveries = 2;
		
		allLocations.add(p1);
		allLocations.add(p2);
		allLocations.add(p3);
		
		List<Pair> result = findKClosest(numDestinations, allLocations, numDeliveries);
		
		for(Pair p: result) {
			System.out.println(p.x + " " + p.y);
		}
		
	}

}

class Pair {
	int x;
	int y;
	
	Pair(int xcor, int ycor){
		x = xcor;
		y = ycor;
	}
}
