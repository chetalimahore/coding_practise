package com.amazon;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Position{
	int col;
	int row;
	Position(int row, int col){
		this.row = row;
		this.col = col;
	}
}


public class NQueensProblem {
	
	public static List<List<Position>> printNQueen(int n){
		List<List<Position>> result = new ArrayList();
		
		if(n <= 0){
			return result;
		}
		
		for(int i = 0 ; i < n ; i++) {
			Position[] positions = new Position[n];
			boolean hasSolution= checkSolution(n, i, positions);
			if(hasSolution) {
				List<Position> list = Arrays.asList(positions);
				result.add(list);
			}
		}
		return result;
	}
	
	//backtracking function to check if there is a solution for a row
	private static boolean checkSolution(int n, int row, Position[] positions){
		if(n == row) {
			return true;
		}
		
		int col;
		boolean found = false;;
		for(col = 0; col < n ;col++) {
			found = true;
			
			for(int queen = 0 ; queen < row ; queen++) {
				if(positions[queen].col == col || (positions[queen].row - positions[queen].col == row - col) || 
						(positions[queen].row + positions[queen].col == row + col)) {
					found = false;
					break;
				}
			}
			
			if(found) {
				positions[row] = new Position(row, col);
				if(checkSolution(n, row+1, positions)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Position>> result = printNQueen(4);
		
		System.out.println(result.size());
	}

}
