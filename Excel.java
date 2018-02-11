
public class Excel {
	
	public static int titleToNumber(String a) {
	    int result = 0 ; 
	    for( int i = 0, j = a.length() - 1 ; i < a.length() ; i++, j-- ){
	        result = result + (int)(a.charAt(j) - 'A' + 1) * (int)Math.pow(26, i);
	    }
	    return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(titleToNumber("BA"));
	}

}
