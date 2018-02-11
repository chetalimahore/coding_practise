import java.util.*;


/*adds the number into list if the diff between corr digits is equal to 1*/

public class Stepnum {

	public static ArrayList<Integer> stepnum(int a, int b) {
	    ArrayList<Integer> arr=new ArrayList<Integer>();
	    int j;
	    if(b<a)
	      return null;
	    else
	    {
	        for(int i=a;i<=b;i++)
	        {
	            boolean flag=true;
	            int number=i;
	            ArrayList<Integer> newarr=new ArrayList<Integer>();
	            while(number!=0)
	            {
	                int x=number%10;
	                newarr.add(x);
	                number=number/10;	    
	            }
	            Integer y[]=newarr.toArray(new Integer[newarr.size()]);
	            while(flag)
	            {
	                for(j=0;j<y.length;j++)
	                {
	                    if((j+1)!=y.length)
	                    {
	                        if(Math.abs(y[j]-y[j+1])!=1)
	                          {
	                        	flag=false;
	                        	break;
	                          }
	                    }
	                }
	                if(j==y.length && flag==true)
	                {
	                    arr.add(i);
	                    flag=false;
	                }
	            }
	            
	        }
	        return arr;
	    }
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=stepnum(1, 1000);
		Iterator itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		

	}

}
