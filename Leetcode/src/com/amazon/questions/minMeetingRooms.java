import java.util.Arrays;

class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
}


public class minMeetingRooms {

	public int minMeetingRooms(Interval[] intervals) {
        Arrays.sort(intervals, (interval1, interval2) -> Integer.compare(interval1.start, interval2.start));
        
        Interval newInterval= intervals[0];
        int count = 0;
        for(Interval interval : intervals){
            if(interval.start <= newInterval.end){
                newInterval.end = Math.max(interval.end, newInterval.end);
            } 
            else{
                newInterval = interval;
                count++;
            }
        }
        
        return count;
        
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interval interval1 = new Interval(0,30);
		Interval interval2 = new Interval(5,10);
		Interval interval3 = new Interval(15,20);
		
		
		
	}

}
