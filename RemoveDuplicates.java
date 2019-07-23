import java.util.*;

public class RemoveDuplicates 
{
	String names[]= {"abc", "xyz", "abc"};
	HashMap <Integer,String> hmap= new HashMap<Integer, String>();
	int key=1;
   public void insertWithoutDuplicates()
   {
	   int i=0;
	   while(names.length!=0 && !hmap.containsValue(names[i]))
	   {
		   hmap.put(key++, names[i++]);
	   }
   }
   
   public void display()
   {
	   /*List<Integer> list=new List<Integer>();
	   Iterator intitr=list.iterator();
	   
	   Map<Integer,Integer> hash=new HashMap<Integer,Integer>();
	   hash.put(1, 1);
	   hash.get(1).*/
	   
	   
	   
	   Iterator it=hmap.entrySet().iterator();
	  while(it.hasNext())
	  {
		  Map.Entry pair=(Map.Entry)it.next();
		  System.out.println("key="+pair.getKey()+" "+"value="+pair.getValue());
		  it.remove();
		  //pair.
		 
	  }
   }
   
   public static void main(String args[])
   {
	   RemoveDuplicates rem=new RemoveDuplicates();
	   rem.insertWithoutDuplicates();
	   rem.display();
   }
}
