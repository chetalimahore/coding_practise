
public class StrStr {
	
	/*To find if a string is a substring of a given string and return the index*/

	public int strstr(String s, String x) {
		int j = 0, k = 0;
		String result="";
		while( j < s.length() ) {
			if( k < x.length() && s.charAt(j) == x.charAt(k) ) {
				result+=s.charAt(j);
				k++;
			}
			else if ( k == x.length() - 1 && !result.equals(x)){
				if( x.length() - 1 != 0 ) {
					k=0;
					result="";
					j--;
				}
			}
			if( k==x.length() && result.equals(x) ) {
				return j;
			}
			j++;
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrStr str = new StrStr();
		String s = "abcdecd";
		String x = "ecd";
		System.out.println( str.strstr(s, x) );
	}

}
