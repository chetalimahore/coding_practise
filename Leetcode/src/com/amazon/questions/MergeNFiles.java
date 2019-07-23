

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;


public class MergeNFiles {
	
	private static int minimumTime(int number, List<Integer> files) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer file1, Integer file2) {
				// TODO Auto-generated method stub
				return file1-file2;
			}
			
		});
		
		int result = 0;
		
		for (int i = 0; i < files.size(); i++) { 
			  
            // add sizes to priorityQueue 
            pq.add(files.get(i)); 
        } 
		
		while(pq.size() > 1) {
			int temp = pq.poll() + pq.poll();
			result += temp;
			pq.add(temp);
		}
	
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> files = new ArrayList<>();
		files.add(4);
		files.add(8);
		files.add(-1);
//		files.add(12);
		
		
		System.out.println(minimumTime(4, files));
	}

}
