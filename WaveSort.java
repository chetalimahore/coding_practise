import java.util.*;

/*
 * Arrange the array in such a way that the second element is less than the first and third
 * and third is greater than the second and the fourth.
 * */

public class WaveSort {
	
	static int arr[]= {9, 7, 2, 1, 8, 6};
	static ArrayList<Integer> array=new ArrayList<Integer>();
	
	public static void wave(int [] arr) {
		for(int i=1;i<=arr.length-1;i=i+2) {
			array.add(arr[i]);
			array.add(arr[i-1]);
		}
		if(arr.length%2!=0) {
			array.add(arr[arr.length-1]);
		}
	}
	
	public static void reverse() {
		int temp;		
		for(int i=0, j=arr.length-1; i<(arr.length-1)/2 && j-1>i; i++, j--) {
			temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Quicksort quick=new Quicksort();
		quick.quicksort(arr, 0, arr.length-1);
		wave(arr);
		Iterator itr=array.iterator();
		while(itr.hasNext()) System.out.println(itr.next());
	}

}

class Quicksort {

	public void quicksort(int arr[], int left, int right) {
		quick(arr, left, right);
	}
	
	public void quick(int arr[], int left, int right) {
		if(left>=right) return;
		
		int pivot=arr[(left+right)/2];
		int part=makePart(arr, left, right, pivot);
		quick(arr, left, part-1);
		quick(arr, part, right);
	}
	
	public int makePart(int arr[], int left, int right, int pivot) {
		while(left<=right) {
			while(arr[left]<pivot) {
				left++;
			}
			
			while(arr[right]>pivot) {
				right--;
			}
			
			if(left<=  right) {
				swap(arr, left, right);
				left++;
				right--;
			}
			
		}
		return left;
	}
	
	public void swap(int arr[], int left, int right) {
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}
	
}

