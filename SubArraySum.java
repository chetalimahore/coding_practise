import java.util.*;

/*
 * @author cheta
 * */

class GFG {
	
	int output[][];
	
	public void read() {
		int test = 0, length = 0, value = 0, k = 0;
		boolean flag=true;
		int arr[];
		Scanner sc=new Scanner(System.in);
		test = sc.nextInt();
		output=new int[test][2];
		for(int i = 1; i <= test; i++) {
			length = sc.nextInt();
			arr = new int[length];
			value = sc.nextInt();
			for( int j = 0; j < length; j++) {
				arr[j] = sc.nextInt();
			}
			flag=checkSubArray(arr, value, k);
			k++;
		}
		if(flag==true)
		for(int x = 0; x < k; x++) {
			System.out.println(output[x][0] + " " + output[x][1]);
		}
		else {
			System.out.println("-1");
		}
	}
	
	public boolean checkSubArray(int arr[], int value, int k) {
		int i = 0, j = i+1, result = arr[i];
		while( i < arr.length && j < arr.length) {
			if( result == value ){
					output[k][0]=i+1;
					output[k][1]= j;
					return true;
			}
			else if(result < value) {
				result = result + arr[j];
				j++;
			}
			if( result > value ){
				result = result - arr[i];
				i++;
			}
		}
		if( result == value ){
			output[k][0]=i+1;
			output[k][1]= j;
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GFG sub=new GFG();
		sub.read();
	}

}
