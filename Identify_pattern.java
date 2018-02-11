
public class Identify_pattern
{
	//static String s="123456456456";
	static String s="2 0 6 3 1 6 3 1 6 3 1";
	static int count=0;
	static int n=s.length();
	static int arr[]=new int[n];
	static StringBuilder pattern=new StringBuilder();
	
	public static void pattern()
	{
		int i=0,j=1;
		int count=0;
		int counter=0;
		int return_value=0;
		StringBuilder result=new StringBuilder();
		arr[count++]=Character.getNumericValue(s.charAt(i));
			while(j!=s.length())
			{
				if(s.charAt(j)!=' ')
				{
				if(s.charAt(j)!=s.charAt(i-1))
				{
					return_value=search_array(Character.getNumericValue(s.charAt(j)));
					if(j!=s.length() && return_value==-1 && return_value!=j)
						{
							arr[count++]=Character.getNumericValue(s.charAt(j));
							j=j+2;
						}
					else if(return_value!=j)
					{
						i=return_value;
						 for(int k=i;k<j;k=k+2)
						  {
						    result.append(s.charAt(k));
						  }
						while(j!=s.length()-1 && s.charAt(i-1)==s.charAt(j))
						{
							if(Character.getNumericValue(s.charAt(j))==Character.getNumericValue(s.charAt(return_value)))
							{
								counter++;
							}
							pattern.append(s.charAt(j));
							i=i+2;
							j=j+2;
						}
					}
					
				}
				else j=j+2;
				}
		}
			pattern.append(s.charAt(j-1));
			System.out.println(result);
	}

	public static int search_array(int number)
	{
		int i=0;
	  for(i=0;i<n;i=i+2)
	  {
		  if(arr[i]==number)
			  return i;
	  }
		return -1;
	}
	
	public static String find_cycle(int[] intArray)
	{ 
	   int i=0;
	   int j=1;
	   StringBuilder result=new StringBuilder();
	   while(i!=intArray.length)
	   {
		   while((j+2)!=intArray.length)
		   {
			   if(arr[j]!=arr[i])
			   {
				   j=j+2;
			   }
			   result.append(arr[j]);
		   }
		   i++;
	   }
	 return result.toString();
	}
	
	
	
	public static int[] stringArrayToIntArray(String intString) {
	    String[] intStringSplit = intString.split(" "); //Split by spaces
	    int[] result = new int[intStringSplit.length]; //Used to store our ints

	    for (int i = 0; i < intStringSplit.length; i++) {
	        //parse and store each value into int[] to be returned
	        result[i] = Integer.parseInt(intStringSplit[i]); 
	        System.out.println(result[i]);
	    }
	    return result;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//pattern();
		
		int[] intArray = stringArrayToIntArray(s);
		System.out.println(find_cycle(intArray));
	}

}
