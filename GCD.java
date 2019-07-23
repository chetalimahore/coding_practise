
public class GCD {
	/*public static int gcd(int A, int B) {
	    if (A == 0)
	        return B;
	    return gcd(B % A, A);
	}*///fb solution
	
	public static int gcd(int a, int b) {
	    int gcd=0;
	    int min=0;
	    if(a==0 )
	      return b;
	    else if(b==0)
	       return a;
	    if(a<=b)
	       min=a;
	    else if(a>b)
	          min=b;
	    for(int i=1;i<=min;i++)
	    {
	        if(a%i==0 && b%i==0)
	        {
	            gcd=i;
	        }
	    }
	    return gcd;
	}
	
    public static void main(String [] args)
    {
    	System.out.println(gcd(1, 15)); 
    }
}
