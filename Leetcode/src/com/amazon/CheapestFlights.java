package com.amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class CheapestFlights {
	
	class Route {
		int i;
		int j;
		int dist;
		
		Route(int fld, int rld, int s){
			i = fld;
			j = rld;
			dist = s;
		}
			
	}
	
//	public static List<List<Integer>> optimalUtilization(int maxTravelDist, List<List<Integer>> forwardRouteList,
//				List<List<Integer>> returnRouteList) {
//
//			List<List<Integer>> result = new ArrayList<List<Integer>>();
//
//			PriorityQueue<Route> pq = new PriorityQueue<Route>(new Comparator<Route>() {
//				
//				@Override
//				public int compare(Route o1, Route o2) {
//					return o2.dist - o1.dist;
//				}
//
//			});
//
//			for (List<Integer> fwd : forwardRouteList) {
//				int fId = fwd.get(0);
//				int fDist = fwd.get(1);
//
//				for (List<Integer> ret : returnRouteList) {
//					int rId = ret.get(0);
//					int rDist = ret.get(1);
//
//					int sum = fDist + rDist;
//					if (sum <= maxTravelDist) {
//						pq.add(new Route(fId, rId, sum));
//					}
//				}
//
//			}
//			int max = pq.peek().dist;
//			
//			while(!pq.isEmpty() && pq.peek().dist == max) {
//				Route route = pq.poll();
//				result.add(Arrays.asList(route.i,route.j));
//			}
//
//			return result;
//		}
//	}
	
	
//	public static List<List<Integer>> getIdPairsForOptimal(List<List<Integer>> forwardList,
//			List<List<Integer>> backwardList, int maxDistance) {
//		List<List<Integer>> result = new LinkedList<List<Integer>>();
//		forwardList = forwardList.stream().sorted((x1, x2) -> Integer.compare(x2.get(1), x1.get(1)))
//				.collect(Collectors.toList());
//		backwardList = backwardList.stream().sorted((x1, x2) -> Integer.compare(x1.get(1), x2.get(1)))
//				.collect(Collectors.toList());
//		int maxDist = maxDistance;
//		while (true) {
//			for (List<Integer> l : forwardList) {
//				for (List<Integer> b : backwardList) {
//					int forward = l.get(1);
//					int backward = b.get(1);
//					int tot = (forward + backward);
//					if (tot > maxDist) {
//						break;
//					}
//					else if(tot < maxDist) {
//						
//					}
//					if (tot == maxDist) {
//						// print the pair of Id and optimum distance
//						result.add(Arrays.asList(l.get(0), b.get(0), maxDist));
//						break;
//					}
//
//				}
//			}
//			if (result.size() > 0) {
//				break;
//			}
//			maxDist--;
//		}
//		return result;
//	}
	
	
//	public static List<List<Integer>> calculateOptimalRoute(final int capacity, final List<List<Integer>> forwardList, final List<List<Integer>> returnList)
//	  {
////	  	System.out.println(forwardList);
////	    System.out.println(returnList);
//	    
//	    // sort forward list
//	    Collections.sort(forwardList, new Comparator<List<Integer>>() {
//	      @Override
//	      public int compare(List<Integer> o1, List<Integer> o2) {
//	      	return o1.get(1) - o2.get(1);  
//	      }
//	    });
//	    
//	    // sort return list
//	    Collections.sort(returnList, new Comparator<List<Integer>>() {
//	      public int compare(List<Integer> o1, List<Integer> o2) {
//	      	return o1.get(1) - o2.get(1);
//	      }
//	    });
//	    
//	    int max = 0;
//	    int i = 0;
//	    int j = returnList.size() - 1;
//	    
//	    List<List<Integer>> result = null;
//	    while(i < forwardList.size() && j >= 0) {
//	      if (forwardList.get(i).get(1) + returnList.get(j).get(1) > max && 
//	          forwardList.get(i).get(1) + returnList.get(j).get(1) <= capacity) {
//	      	max = forwardList.get(i).get(1) + returnList.get(j).get(1);
//	        result = new LinkedList<List<Integer>>();
//	        result.add(new ArrayList<Integer>(Arrays.asList(forwardList.get(i).get(0), returnList.get(j).get(0))));
//	        i++;
//	      } else if(forwardList.get(i).get(1) + returnList.get(j).get(1) == max) {
//	        // no need to reset result list
//	      	result.add(new ArrayList<Integer>(Arrays.asList(forwardList.get(i).get(0), returnList.get(j).get(0))));
//	        i++;
//	      } else {
//	      	j--;
//	      }
//	    }   
//		return result;
//	  }	

	
	
	public static List<List<Integer>> findOptimalMemory( int capacity, final List<List<Integer>> foreground,
	         final List<List<Integer>> background)
	   {
	      int i = 0;
	      int j = background.size() - 1;
	      final List<List<Integer>> result = new ArrayList<>();
	      final List<List<Integer>>[] store = new ArrayList[capacity + 1];
	      Collections.sort(foreground, new Comparator<List<Integer>>()
	      {
	         @Override
	         public int compare(final List<Integer> f, final List<Integer> s)
	         {

	            return Integer.compare(f.get(1), s.get(1));
	         }
	      });

	      Collections.sort(background, new Comparator<List<Integer>>()
	      {
	         @Override
	         public int compare(final List<Integer> f, final List<Integer> s)
	         {

	            return Integer.compare(f.get(1), s.get(1));
	         }
	      });

	      while (i < foreground.size() && j > -1)
	      {
	         final int current = foreground.get(i).get(1) + background.get(j).get(1);
	         if (current <= capacity)
	         {
	            if (store[current] == null)
	               store[current] = new ArrayList<>();
	            store[current].add(Arrays.asList(new Integer[] { foreground.get(i).get(0), background.get(j).get(0) }));
	         }

	         if (current <= capacity)
	         {
	            ++i;
	         }
	         else if (current > capacity)
	         {
	            --j;
	         }
	      }

	      while (i < foreground.size())
	      {
	         final int current = foreground.get(i).get(1) + background.get(0).get(1);
	         if (current < capacity)
	         {
	            if (store[current] == null)
	               store[current] = new ArrayList<>();
	            store[current].add(Arrays.asList(new Integer[] { foreground.get(i).get(0), background.get(0).get(0) }));
	         }
	         ++i;
	      }

	      while (j > -1)
	      {

	         final int current = foreground.get(foreground.size() - 1).get(1) + background.get(j).get(1);
	         if (current < capacity)
	         {
	            if (store[current] == null)
	               store[current] = new ArrayList<>();
	            store[current]
	                  .add(Arrays.asList(new Integer[] { foreground.get(foreground.size() - 1).get(0), background.get(j).get(0) }));
	         }

	         --j;
	      }

	      for (int k = capacity; k > -1; --k)
	      {
	         if (store[k] != null)
	         {
	            result.addAll(store[k]);
	            break;
	         }
	      }
	      return result;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<List<Integer>> forwardList = new LinkedList<List<Integer>>();
		    forwardList.add(new ArrayList<Integer>(Arrays.asList(1, 3000)));
		    forwardList.add(new ArrayList<Integer>(Arrays.asList(2, 5000)));
		    forwardList.add(new ArrayList<Integer>(Arrays.asList(3, 7000)));
		    forwardList.add(new ArrayList<Integer>(Arrays.asList(4, 10000)));
		    
		    List<List<Integer>> returnList = new LinkedList<List<Integer>>();
		    returnList.add(new ArrayList<Integer>(Arrays.asList(1, 2000)));
		    returnList.add(new ArrayList<Integer>(Arrays.asList(2, 3000)));
		    returnList.add(new ArrayList<Integer>(Arrays.asList(3, 4000)));
		    returnList.add(new ArrayList<Integer>(Arrays.asList(4, 5000)));

		    
		    System.out.println(findOptimalMemory(10000, forwardList, returnList));
			
			
			
	}

}
