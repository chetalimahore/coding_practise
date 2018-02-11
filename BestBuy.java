import java.util.*;

public class BestBuy {
	static String arr[][];
	static int n;
	
	public static boolean best_buy(String a)
	{
		int count_seven=0;
		int count_four=0;
		
			for(int j=0;j<a.length();j++)
			{
				if(a.charAt(j)=='7')
					count_seven++;
				else if(a.charAt(j)=='4')
					count_four++;
				else
					return false;
			}
			if(count_seven==count_four)
				return true;
			else return false;
	}
		
	public static String check()
	{
		int min=Integer.MAX_VALUE;
		String brandName = "-1";
		
		for(int i=0;i<n;i++)
		{
			if(arr[i][0]!=null) {
					if(Integer.parseInt(arr[i][1])<min) {
						min=Integer.parseInt(arr[i][1]);
						brandName = arr[i][0];
				}
			}else {
				return brandName;
			}
		}
		
		return brandName;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
	        n = in.nextInt();
	        arr=new String[n][2];
	        int count = 0;
	        for(int a0 = 0; a0 < n; a0++)
	        {
	            String name = in.next();
	            int value = in.nextInt();
	            if(best_buy(String.valueOf(value)))
	            {
	            	arr[count][0]=name;
		            arr[count][1]=String.valueOf(value);
		            count++;
	            }
	        }
	        System.out.println(check());
}
}
