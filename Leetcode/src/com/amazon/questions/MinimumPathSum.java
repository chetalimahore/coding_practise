package com.amazon.questions;

public class MinimumPathSum {

	public static int minPathSum(int[][] grid) {
	        
	        int totalRows = grid.length;
	        int totalColumns = grid[0].length;
	        
	        int result[][] = new int[totalRows][totalColumns];
	        
	        result[0][0] = grid[0][0];
	        
	        for(int i = 1 ; i < totalColumns ; i++){
	            result[0][i] = grid[0][i] + result[0][i-1];
	        }
	        
	        for(int i = 1 ; i < totalRows ; i++){
	            result[i][0] = grid[i][0] + result[i-1][0];
	        }
	        
	        
	        for(int i = 1 ; i < totalRows ; i++){
	            for(int j = 1; j < totalColumns ; j++){
	                result[i][j] = Math.min(result[i-1][j], result[i][j-1]) + grid[i][j];
	            }
	        }
	        
	        return result[totalRows-1][totalColumns-1];
	        
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grid[][] = {{1,3,1},{1,5,1},{4,2,1}};
		
		System.out.println(minPathSum(grid));
	}

}
