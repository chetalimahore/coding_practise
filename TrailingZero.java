
public class TrailingZero {
    
	//given a number, find the trailing zeroes in its factorial
	
	  public static int trailingZeroes(int n) {
	        int count = 0;
	        while( n > 0){
	            count = count + (n/5);
	            n = n/5;
	        }
	        return count;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trailingZeroes(10));
	}

}
