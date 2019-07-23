package com.amazon;

import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule {
	
	
	public static boolean canFinish(int numCourses, int[][] prerequisites) {
		if (numCourses <= 0)
			return false;
		Queue<Integer> queue = new LinkedList<>();
		int[] inDegree = new int[numCourses];
		for (int i = 0; i < prerequisites.length; i++) {
			inDegree[prerequisites[i][1]]++;
		}
		for (int i = 0; i < inDegree.length; i++) {
			if (inDegree[i] == 0)
				queue.offer(i);
		}
		while (!queue.isEmpty()) {
			int x = queue.poll();
			for (int i = 0; i < prerequisites.length; i++) {
				if (x == prerequisites[i][0]) {
					inDegree[prerequisites[i][1]]--;
					if (inDegree[prerequisites[i][1]] == 0)
						queue.offer(prerequisites[i][1]);
				}
			}
		}
		for (int i = 0; i < inDegree.length; i++) {
			if (inDegree[i] != 0)
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]prerequisites = new int[][]{{0,1}, {0,2}, {0,4}, {2,3}, {4,3}};
		int numCourses = 5;
		System.out.println(canFinish(numCourses, prerequisites));
	}
}
