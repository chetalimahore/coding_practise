package com.amazon;

public class MedianTwoSortedArrays {

public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
	 if(nums1.length == 0 && nums2.length == 0){
         return 0.0;
     }

     if(nums1.length > nums2.length){
         return findMedianSortedArrays(nums2, nums1);
     }
     
     int l1 = nums1.length;
     int l2 = nums2.length;
     
     int start = 0;
     int end = l1;
     
     while(start <= end){
         int partitionX = (end + start)/2;
         int partitionY = (nums1.length + nums2.length + 1) / 2 - partitionX;
         
         int maxLeftX = (partitionX == 0) ? (Integer.MIN_VALUE) : nums1[partitionX - 1];
         int minRightX = (partitionX == l1) ? (Integer.MAX_VALUE) : nums1[partitionX];
         
         int maxLeftY  = (partitionY == 0) ? (Integer.MIN_VALUE) : nums2[partitionY -1];
         int minRightY = (partitionY == l2) ? (Integer.MAX_VALUE) : nums2[partitionY];
         
         if(maxLeftX <= minRightY && maxLeftY <= minRightX){
             if((l1 + l2) % 2 == 0){
                 return (double)(Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2;
             }
             else{
                 return (double)Math.max(maxLeftX, maxLeftY);
             }
         }
         else if(maxLeftX > minRightY){
             end = partitionX - 1;
         }
         else if(maxLeftY > minRightX){
             start = partitionX + 1;
         }
         
         
     }
     return 0.0;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1};
		int[] nums2 = {};
		
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}

}
