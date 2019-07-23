
public class ReverseNeg {

	public static int reverse(String str) {
	    String result="";
	    long number;
	    number=Long.parseLong(str);
	    if(number>Integer.MAX_VALUE || number<Integer.MIN_VALUE) {
	    	return 0;
	    }
	    else {
	    	int a=Integer.parseInt(str);
	    	 if(a<0){
	 	        result=result+"-";
	 	    }
	 	    a=Math.abs(a);
	 	    int x=0;   
	 	    while(a!=0){
	 	        x=a%10;
	 	        result=result+x;
	 	        a=a/10;
	 	    }
	 	    return Integer.parseInt(result);
	    }
	   
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("-5827646411"));
	}

}
