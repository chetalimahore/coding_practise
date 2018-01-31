import java.util.*;

public class FindMajority {

	/*complexity of the below method is O(n^2)*/
	
	public static int findMajority(final List<Integer> a)
	{
		Integer arr[]=a.toArray(new Integer[a.size()]);
		 int count=0;
		    for(int i=0;i<arr.length;i++)
		    {
		        for(int j=0;j<arr.length;j++)
		        {
		        	if(i!=j)
		        	{
		        		if(arr[j]==arr[i])
				            count++;
		        	}
		        }
		        if(count>=arr.length/2)
		        {
		            return arr[i];
		        }
		    }
			return -1;
	}
	
	/*using hashmap, complexity is O(n)*/
	public static int majorityElement(final List<Integer> a) {
		  Integer arr[]=a.toArray(new Integer[a.size()]);
		  HashMap<Integer, Integer> hmap=new HashMap<Integer, Integer>();
		  int count=0;
		  for(int i=0;i<arr.length;i++)
		  {
			  count=1;
			  if(hmap.containsKey(arr[i]))
			  {
				  count=hmap.get(arr[i])+1;
				  if(count>arr.length/2)
				  {
					  return arr[i];
				  }
				  hmap.put(arr[i], count);
			  }
			  else {
				  hmap.put(arr[i], 1);
			  }
		  }
		  return -1;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(2);
	
		System.out.println(majorityElement(list));
		//System.out.println(findMajority(list));
	}

}
