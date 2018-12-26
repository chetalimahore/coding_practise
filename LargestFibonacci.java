import java.util.*;

public class LargestFibonacci {

	public static boolean check (int number) {
		int s = (int) Math.sqrt(number);
		if( s * s == number) {
			return true;
		}
		else return false;
	}
	
	public static boolean checkFibonacci(int n) {
		if(n==1) return true;
		
		return check( 5*n*n+4 )|| check( 5*n*n-4);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(5);
		list.add(14);
		list.add(10);
		list.add(8);
		list.add(14);
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(checkFibonacci((int) itr.next()));
		}
		
	}

}
