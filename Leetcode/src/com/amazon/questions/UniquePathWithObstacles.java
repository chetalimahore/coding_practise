package com.amazon.questions;

public class UniquePathWithObstacles {

	 public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
	        int totalRows = obstacleGrid.length;
	        int totalColumns = obstacleGrid[0].length;
	        
	        int result[][] = new int[totalRows][totalColumns];
	        
	        if(obstacleGrid[0][0] == 1)
	            return 0;
	        else{
	            result[0][0] = 1;
	        }
	        
	        for(int i = 1 ; i < totalColumns ; i++){
	            if(obstacleGrid[0][i] == 0){
	                result[0][i] = result[0][i-1];
	            }
	            else{
	                result[0][i] = 0;
	            }
	        }
	        
	        for(int i = 1 ; i < totalRows ; i++){
	            if(obstacleGrid[i][0] == 0){
	                result[i][0] = result[i-1][0];
	            }
	            else{
	                result[i][0] = 0;
	            }
	        }
	        
	        for(int i = 1 ; i < totalRows; i++){
	            for(int j = 1 ; j < totalColumns ; j++){
	                if(obstacleGrid[i][j] == 0){
	                    result[i][j] = result[i-1][j] + result[i][j-1];
	                }
	                else{
	                    result[i][j] = 0;
	                }
	            }
	        }
	        
	        return result[totalRows-1][totalColumns-1];
	        
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int obstacleGrid[][] = {{0,0,1,0},{0,1,0,0},{0,0,0,0}};
		
		
		System.out.println(uniquePathsWithObstacles(obstacleGrid));	
	}

}
