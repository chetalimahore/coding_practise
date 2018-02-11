import java.util.*;

public class PairsSum {

	/*prinitive way of using 2 loops*/
	public static int printPairs(int arr1[], int arr2[], int val) {
		boolean flag=false;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]+arr2[j]==val) {
					System.out.print(arr1[i] +" "+ arr2[j] +", ");
					flag=true;
				}
			}
		}
		if(flag==false) {
			return -1;
		}
		else return 0;
	}
	
	/*hashmap approach*/
	public static int addPairs(int a[], int b[], int x) {
		
		HashMap<Integer, Integer> hmap=new HashMap<Integer, Integer>();
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(!hmap.containsValue(a[i])) {
				hmap.put(a[i], 0);
			}
		}
		for(int j=0;j<b.length;j++) {
			if(hmap.containsKey(x-b[j])) {
				System.out.println(x-b[j] + " " + b[j]);
				flag=true;
			}
		}
		if(flag==false) {
			return -1;
		}
		else return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-1, -2, -6, 3, 7};
		int b[]= {6, 0, 5};
		int x=8;
		//System.out.println(printPairs(a, b, x));
		System.out.println(addPairs(a, b,x));
	}

}
