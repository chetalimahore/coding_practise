import java.util.*;

public class PrintDiagonal {

	public static void printDiagonal(int a[][], int m, int n)
	{
	   ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
		int tempi; int flag=0; int tempj;
	   for(int i=0;i<m;i++)
	   {
		   tempi=i;
		   for(int j=i;j<n;j++)
		   {
			   tempj=j;
			   ArrayList<Integer> newarr=new ArrayList<Integer>();
			   while(i!=j && j!=-1 && i!=m)
			   {
				   System.out.print(a[i][j]);
				   newarr.add(a[i][j]);
				   flag=1;
				   i++;j--;
				   if(i==j)
					   flag=0;
			   }
			   if(flag==0)
			   {
				   System.out.print(a[i][j]);
				   newarr.add(a[i][j]);
				   flag=0;
				   i++;j--;
				   
			   }
			   while(i!=j && j!=-1 && i!=m)
			   {
				   System.out.print(a[i][j]);
				   newarr.add(a[i][j]);
				   flag=1;
				   i++;j--;
				   if(i==j)
					   flag=0;
			   }
			   i=tempi;
			   j=tempj;  
			   if(newarr!=null)
			   arr.add(newarr);
			   System.out.println();
			 
		   }
	   }
	   ArrayList<Integer> newarr=new ArrayList<Integer>();
	   System.out.print(a[m-1][n-1]);
	   newarr.add(a[m-1][n-1]);
	   arr.add(newarr);
	   System.out.println("---------");
	   Iterator itr=arr.iterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		printDiagonal(arr, 3, 3);
		
	}

}
