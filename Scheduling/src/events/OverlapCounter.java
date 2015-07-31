package events;

// Given a sorted(by start time) array of events, return the number of events 
// that over lap with atleast one other event
public class OverlapCounter {
	
	public static void main(String[] args){
		int[][] events = new int[][]{
				{1, 2},
				{2, 8},
				{3, 5},
				{4, 8},
				{11, 21}
		};
		
		int o = findOverlaps(events);
		System.out.println(o);
	}

	private static int findOverlaps(int[][] events) {
		
		int count = 0;
		int end = events[0][1];
		for(int i = 1; i < events.length; i++){
			if(events[i][0] < end){
				count++;
			}
			if(events[i][1] > end){
				end = events[i][1];
			}
		}
		return count;
	}

}
