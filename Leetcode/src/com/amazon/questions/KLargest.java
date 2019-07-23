import java.util.PriorityQueue;


public class KLargest {

	private static int findKLargest(int nums[], int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>() {
			
			public int compare(Integer a, Integer b) {
				return a - b;
			}
		};
		
		
		for(int i = 0 ; i < nums.length ; i++) {
			pq.offer(nums[i]);
			if(pq.size() > k) {  //by this you ensure that there are max 2 elements in the pq
				pq.poll();
			}
		}
		
		return pq.peek();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,3,4,6,7,8,9,10};
		int k = 4;
		
		System.out.println(findKLargest(nums, k));
	}

}
