import java.util.*;

/*public class Combination 
{

	static int arr[][]=null;
	public static void createComb(int arr[][], int n, int a[], int k)
	{
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			for(int j=0;j<a.length;j++)
			{
				if((i+1)!=a.length)
				{
					a[i]=a[i+1];
					a[i+1]=a[i];
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<a.length;j++)
			{
				
			}
		}
		
	}
	
	public static int fact(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		return n*fact(n-1);
	}
	
	public static void main(String[] args)
	{
		int a[]= {6, 9, 11};
		int n=fact(a.length);
		arr=new int[a.length][n];
		createComb(arr, n, a, 0);
	}
}*/



public class Permute_All_List_Numbers 
{
    static int N;
    static int arr[][];
    static int[] sequence;
    static int row=0; int column=0;
    static int row_size=0;
    static void permute(int[] a, int k) 
    {
        if (k == a.length) 
        {
            for(int j=0;j<a.length;j++)
            {
            	arr[row][j]=a[j];
            	System.out.print(arr[row][j]+" ");
            }
            row++;
            System.out.println();
        } 
        else 
        {
            for (int i = k; i < a.length; i++) 
            {
                swap(a, i, k);
 
                permute(a, k + 1);
 
                swap(a, i, k);
            }
        }
    }
    
    public static void swap(int[] a, int i, int k)
    {
    	int temp = a[k];
        a[k] = a[i];
        a[i] = temp;
    }
    
    public static void minDist(int a[])
    {
    	int min=arr[0][0];
    	int result=0;
    	for(int i=0;i<row_size;i++)
    	{
			result=0;
    		for(int j=1;j<a.length ;j++)
    		{
    			result=result+Math.abs(arr[i][j]-arr[i][j-1]);
    		}
    		if(min>=result)
    		{
    			min=result;
    			System.out.println("value of min="+min);
    		}

			System.out.println("result of j=" +" "+ result);
    	}
    	
    	System.out.println("Minimum distance="+min);
    	
    }
    
    public static int fact(int n)
    {
    	if(n==0 || n==1)
    	 return 1;
    	return n*fact(n-1);
    }
    
    public static void main(String args[]) 
    {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of list: ");
        N = sc.nextInt();
        row_size=fact(N);
        sequence =new int[N];
        arr=new int[row_size][N];
        
        System.out.println("Enter the elements: ");
        for (int i = 0; i < N; i++)
        {
        	sequence[i]=sc.nextInt();
        }

 
        System.out.println("\nThe permuted sequences are: ");
        permute(sequence, 0);
        minDist(sequence);
        sc.close();
    }
}
