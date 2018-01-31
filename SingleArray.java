
import java.util.*;

/*lists out the single elements present in the array*/

public class SingleArray {
	// DO NOT MODIFY THE LIST
	public static int singleNumber(final List<Integer> a) 
	{
	   HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
	  int no;
	    int number=0;
	    Object obj=null;
	   Iterator intitr=a.iterator();
	   while(intitr.hasNext()){
		   obj=intitr.next();
	       no=(int)obj;	       
	       if(!hash.containsKey(no))
	       {
	    	   //System.out.println("no="+no);
	           hash.put(no, null);
	       }
	       else 
	       {
	          hash.remove(obj);
	       }
	   }
	   Iterator itr=hash.entrySet().iterator();
	   while(itr.hasNext())
	   {
	       Map.Entry map=(Map.Entry) itr.next();
	           number=(int)map.getKey();
	           break;
	   }
	   return number;
	}
	
	
	/*efficient approach - ORing of numbers, no need to use a hashmap*/
	public static int single(final List<Integer> A) {
	    int num = 0;
	    
	    for (int val : A) {
	        num ^= val;
	        System.out.println(num);
	        
	    }
	    
	    return num;
	    
	}
	
	public static void main(String args[])
	{
		List<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(1);
		System.out.println(singleNumber(a)); 
	}
}

