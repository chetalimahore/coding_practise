package com.amazon;

import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

	public static List<Integer> getRow(int rowIndex) {
        Integer arr[] = new Integer[rowIndex+1];
        
        arr[0] = 1;
        
        for(int row = 1 ; row <= rowIndex ; row++){
            arr[row] = 1;
            for(int col = row-1 ; col > 0 ; col--){
                arr[col] = arr[col] + arr[col-1];
            }
        }
        
        return (List<Integer>) Arrays.asList(arr);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getRow(10));
	}

}
