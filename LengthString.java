import java.util.*;

public class LengthString {

	///whenever there are only blank spaces and you try to split the array acc to blank spaces, no individual
	//arrays will be formed!! The array length will be equal to zero since there are no characters present in it.
	
	/*using library functions*/
	/*public static int lengthString(final String str)
	{
		String arr[]=str.split(" ");
		if(arr.length==0)      
			return 0;
		else 
		{
			return arr[arr.length-1].length();
		}

	}
	*/
	
	/*without library functions*/
	public static int lengthString(final String str)
	{
		int n=str.length();
		if(n==0)
			return 0;
		else
		{
			int start=n;
			int end=n;
			int i=n-1;
			while(i>=0 && str.charAt(i)==' ')
				i--;
			end=i;
			while(i>=0 && str.charAt(i)!=' ')
			{
				start=i;
				i--;
			}
			return Math.max(0, end-start+1);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthString("    ")); 
		System.out.println("-----");
		System.out.println(lengthString("   abc     defg    "));
		System.out.println("-----");
		System.out.println(lengthString("World l"));
	}

}
