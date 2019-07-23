import java.util.ArrayList;
import java.util.Arrays;


/*
 * Find if the value of k is equal to the differnence of the indexes
 * */

public class DifferenceEle {

	public static int returnElem(ArrayList<Integer> a, int k) {
		int i=1, j=0;
		while(i<a.size() && j<a.size()) {
			if(j<i && Math.abs(a.get(i).intValue()- a.get(j).intValue())==k) {
				return 1;
			}
			if(i!=a.size()-1) i++;
			else {
				j++;
				i=j+1;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(1);
		array.add(6);array.add(5); array.add(2); array.add(1); array.add(4);array.add(10);
		System.out.println(returnElem(array, 53));
	}

}
