
import java.util.*;

public class TwoPrimes {

	/*One approach - iterate through the array , complexity is O(n^2)*/
	public ArrayList<Integer> prime_sum(int a) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int first=0;
        List<Integer> array=is_Prime(a);
        Integer arr[]=array.toArray(new Integer[array.size()]);
        int i=0; int j=0;
        for(i=0;i<arr.length;i++)
        {
            for(j=i;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==a)
                {
                    break;
                }
            }
            if(j!=arr.length && arr[i]+arr[j]==a)
            { 
                if(arr[i]<arr[j])
                  first=arr[i];
                else first=arr[j];
                break;
            }
        }
        list.add(first);
        list.add(a-first);
        return list;
        
    }
    
    public List<Integer> is_Prime(int a)
    {
        int i=2;int j=2;
        List<Integer> prime=new ArrayList<Integer>();
        for(i=2;i<=a;i++)
        {
            for(j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    break;
                }
            }
            if(i==j)
            prime.add(i);
        }
        return prime;
    }
	
	/*Second approach - storing the prime numbers in the hashmap*/

	public static List<Integer> findPrime(int a)
	{
		int i=2, j=2; boolean yes;
		HashMap<Integer, Integer> hmap=new HashMap<Integer, Integer>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		int first=0, second;
		for(i=2;i<=a;i++)
        {
            for(j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    break;
                }
            }
           if(i==j)
             {
        	   first=i;
        	   yes= checkPrime(a-first);
               if(yes==true)
               {
            	   second=a-first;
            	   if(first<=second && first+second==a)
            		   hmap.put(first, second);
            	   else hmap.put(second, first);
               } 
             }
           
        }
		first=hmap.get(hmap.keySet().toArray()[0]);
		second=a-first;
		if(first<second)
		{
			list.add(first);
			list.add(second);
		}
		else
		{
			list.add(second);
			list.add(first);
		}
		
		return list;
		
	}
	
	public static boolean checkPrime(int number)
	{
		double d=(double)number;
		int i=2;
		for(i=2;i<=number;i++)
		{
			if(number%i==0)
				break;
		}
		if(i==number)
			return true;
		else return false;
		
	}
	
	
	/*third approach, efficient approach - no need to use hashmap*/
	     public ArrayList<Integer> primesum(int A) {
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        for (int i = 2; i < A; i++) {
	            if (isPrime(i) && isPrime(A - i)) {
	                arr.add(i);
	                arr.add(A - i);
	                return arr;
	            }
	        }
	        return arr;
	    }

	    public boolean isPrime(int number) {
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          List<Integer> arr=findPrime(14);
          Iterator itr=arr.iterator();
          while(itr.hasNext())
          {
        	  System.out.println(itr.next());
          }
          
	}

}
