import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;



public class TopKFrequent {

	 private static List<Integer> topKFrequent(int[] nums, int k) {
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        
	        for(int i = 0 ; i < nums.length ; i++){
	            if(map.containsKey(nums[i])){
	                map.put(nums[i], map.get(nums[i]) + 1);
	            }
	            else{
	                map.put(nums[i], 1);
	            }
	        }
	        
	        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));
	        
	        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
	            pq.offer(entry);
	        }
	        
	        int count = 0;
	        List<Integer> result = new ArrayList();
	        
	        while(pq.size() < k){
	            Map.Entry<Integer, Integer> entry = pq.poll();
	            
	            result.add(entry.getKey());
	            count++;
	        }
	        
	        return result;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2};
		
		List<Integer> result = topKFrequent(nums, 2);
		
		System.out.println(result.size());
		
	}

}
