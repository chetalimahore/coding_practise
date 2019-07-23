
public class NumberRaised {

	/*my solution*/
    /*public static boolean isPower(int a) {
        for(int i=2;i<=Math.sqrt(a);i++)
        {
            for(int j=2;j<=Math.sqrt(a);j++)
            {
                if(Math.pow((double)i, (double)j)==a)
                 return true;
            }
        }
        return false;
    }*/
    
    public static boolean isPower(int A) {
        double x=2;
	    double i;
	    if(A==1) return true;
	    for(i=2;(i<33)&&(x<=(double)(Math.pow(2,16)));i++)
	    {   
	        if(Math.pow(x,i)==(double)A) return true;
	        if(Math.pow(x,i) >= (Math.pow(2,32))) {i=1;x++;}
	    }
	    return false;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(isPower(1024000000)) ;
	}

}
