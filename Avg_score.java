import java.util.HashMap;

public class Avg_score
{
	static String s1="Hellozzfv Worlddvd";
	
	public static void concatenate(String a, String b)
	{
		int i=0, j=0;
		String s = " ";
		//System.out.println("value of a="+a+" Value of b="+b);
		while(i<a.length() && j<b.length())
			{
				s=s+a.charAt(i)+b.charAt(j);
				i++; j++;
			}
		
		if(i==a.length() && j<b.length())
		{
			for(int k=j;k<b.length();k++)
			{
				s=s+b.charAt(k);
			}
		}
		if(j==b.length() && i<a.length())
		{
			for(int k=i;k<a.length();k++)
			{
				s=s+a.charAt(k);
			}
		}
		System.out.println(s.substring(1, s.length()));
		
	}
	
	public static void main(String[] args)
	{
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i=i+2)
		{
			System.out.println(s2[i]);
			System.out.println(s2[i+1]);
			concatenate(s2[i], s2[i+1]);
		}
		
	}

}
