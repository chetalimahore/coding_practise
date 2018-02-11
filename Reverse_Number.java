import java.util.Scanner;

public class Reverse_Number 
{
	static int arr[];
	public static int reverse_number(int a)
	{
		double res=0;
		String b=String.valueOf(a);
		double x;
		int i=b.length();
		while(a!=0)
		{
			x=a%10;
			res=res+(x*Math.pow(10, i-1));
			a=a/10;
			i--;
		}
		return (int) res;
		
	}
	
	public static boolean palindrome(int a)
	{
		String res=String.valueOf(a);
		int i=0, j=res.length()-1;
		while(j>i)
		{
			if(res.charAt(i)!=res.charAt(j))
				return false;
			i++; j--;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x,y;
		int count=0;
		arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			x=arr[i];
			while(palindrome(x)!=true)
			{
				y=reverse_number(x);
				x=x+y;
				count++;
			}
			System.out.println(count+" "+x);
			count=0;
		}
		// TODO Auto-generated method stub

	}

}
