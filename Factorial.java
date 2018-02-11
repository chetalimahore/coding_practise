
public class Factorial {

	public static int findTrailing(int n) {
		int i=1;
		int count=0;
		while(n/5!=0) {
			count+=(n/5);
			n=n/5;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findTrailing(9247));
	}

}
