import java.util.*;

public class FindBulbs {

	/* public int bulbs(ArrayList<Integer> a) {
	        Integer arr[]=a.toArray(new Integer[a.size()]);
	        int count=0;
	        int j;
	        int iter=0;
	        for(int i=0;i<arr.length;i++)
	        {
	            if(arr[i]==0)
	            {
	                arr=swap(arr, i);
	             
	                for(j=i;j<arr.length;j++)
	                {
	                    if(arr[j]==1) 
	                    {
	                        count++;
	                    }
	                    else break;
	                }
	                iter++;
	            }
	            count=0;
	        }
	        return iter;
	    }
	    
	    public Integer[] swap(Integer a[], int i)
	    {
	        for(int j=i;j<a.length;j++)
	        {
	            if(a[j]==0)
	               a[j]=1;
	            else if(a[j]==1)
	                  a[j]=0;
	        }
	        return a;
	    }
	    */
	
	/*preliminary method*/
	public int bulbs(ArrayList<Integer> a) {
        Integer arr[]=a.toArray(new Integer[a.size()]);
        int count1=0; int count0=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
              count1++;
            else if(arr[i]==0)
              count0++;
        }
        if(count1>count0)
        {
            if(count1==2*count0)
             return count0+1;
            else return count0;
        }
        else if(count1<count0)
        {
            if(count0==arr.length)
               return 1;
            if(count0==count1+1)
               return arr.length;
            else return count0;
        }
        else if(count0==count1)
         return arr.length;
         
        return 0;
    }
	
	
	/*facebook method in C++*/
	/* int bulbs(vector<int> &A) {
		    int state= 0, ans = 0;
		    for (int i = 0;i < A.size();i++) {
			    if (A[i] == state) {
				    ans++;
				    state = 1 - state;
			    }
		    }
		    return ans;
	    }
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
