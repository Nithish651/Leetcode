package neetcode.io;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MeetingRooms {
	
    public static boolean canAttendMeetings(List<Interval> intervals) {
    Collections.sort(intervals, new Comparator<Interval>() {
		@Override
		public int compare(Interval o1, Interval o2) {
			return Integer.compare(o1.start, o2.start);
		}
	});
    	for(int i=0; i < intervals.size() -1; i++) {
    		if(intervals.get(i).end > intervals.get(i + 1).start)
    			return false;
    	}
    	return true;
    }
	
	
	public static void main(String[] args) {
		Interval i1 = new Interval(0,30);
		Interval i2 = new Interval(5,10);
		Interval i3 = new Interval(15,20);
		Interval i4 = new Interval(5,8);
		Interval i5 = new Interval(9,15);
		List<Interval> intervalList = Arrays.asList(i4,i5);
		System.out.println(intervalList);
		System.out.println(canAttendMeetings(intervalList));
	}

}
