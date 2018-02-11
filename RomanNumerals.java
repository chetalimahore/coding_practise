import java.util.*;

public class RomanNumerals 
{
	HashMap<Integer, String> hmap=new HashMap<Integer, String>();
	int a[]= {4, 40, 9, 90, 400, 900};
	List<Integer> subtract=new ArrayList<Integer>();
	List<Integer> list=new ArrayList<Integer>(hmap.keySet());
	
	
	public void insert()
	{
		hmap.put(1, "I");
		hmap.put(5, "V");
		hmap.put(10, "X");
		hmap.put(50, "L");
		hmap.put(100, "C");
		hmap.put(500,"D");
		hmap.put(1000, "M");
	}
	
	
	
	
	/*public void create(int number)
	{
		Iterator itr=hmap.entrySet().iterator();
		Map.Entry mape=(Map.Entry)itr.next();
		int a; String result=new String();
		
		while(number!=0)
		{
			if(hmap.containsKey(number))
			{
				result=result+hmap.get(number);
				System.out.println(result);
				break;
			}
			else 
			{
				
			}
		}
		
	}*/
	
}
