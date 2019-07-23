package com.amazon;

public class MergeTwoSorted {

	private static int[] mergeArrays(int[] nums1, int m, int[] nums2, int n) {
		// two get pointers for nums1 and nums2
	    int p1 = m - 1;
	    int p2 = n - 1;
	    // set pointer for nums1
	    int p = m + n - 1;

	    // while there are still elements to compare
	    while ((p1 >= 0) && (p2 >= 0))
	      // compare two elements from nums1 and nums2 
	      // and add the largest one in nums1 
	      nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];

	    // add missing elements from nums2
	    System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
	    
	    return nums1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {4,5,6, 0, 0, 0};
		int[] nums2 = {1,2,3};
		
		 nums1 = mergeArrays(nums1, 3, nums2, 3);
		 
		 for(int i : nums1) {
			 System.out.println(i);
		 }
		
	}

}
