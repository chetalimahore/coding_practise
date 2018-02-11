
public class KPalindrome {

	public static int is_k_palin( String str, int N ) {
		int i = 0, j = str.length() - 1, count = 0;
		while ( i <= j ) {
			if( str.charAt(i) == str.charAt(j) && count < N ) {
				i++;
				j--;
			}
			else if( str.charAt(i)!= str.charAt(j) ) {
				count++;
				j--;
			}
			else {j--;}
		}
		if( count == N)
			return 1;
		else return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( is_k_palin("abcdefcba", 0) );
	}

}
