package arrayProblems;

public class TeemoAttacking {
	
	public static void main(String[] args) {
		int [] ts = {1,4};
		int duration = 2;
		
		System.out.println(findPoisonedDuration(ts,duration));
	}
	
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
    	
    	int totalSeconds = 0;
    	
    	
    	for(int i=0; i < timeSeries.length - 1; i++) {
    		totalSeconds += Math.min(timeSeries[i+1] - timeSeries[i],duration);
    	}
    	
        return totalSeconds + duration;
    }

}
