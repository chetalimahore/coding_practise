import java.util.Scanner;

public class Triple_Recursion {
	static int a[][];
	
	 static void tripleRecursion(int n, int m, int k)
	 {
	        // Complete this function
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 if(i==0 && j==0) 
					 a[i][j]=m;
				 else if(i==j)
					 a[i][j]=a[i-1][j-1]+k;
				 else if(i>j)
					 a[i][j]=a[i-1][j]-1;
				 else if(i<j)
					 a[i][j]=a[i][j-1]-1;
			 }
		 }
	 }

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a=new int[n][n];
        int m = in.nextInt();
        int k = in.nextInt();
        tripleRecursion(n, m, k);
        in.close();
        System.out.println("The matrix is:");
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		System.out.print(a[i][j]+" ");
        	}
        	System.out.println("");
        }
	}

}
