package arrayProblems;

public class MaxConsecutiveOnes {
	public static void main(String[] args) {
		int [] nums = {0};
		
		System.out.println(findMaxConsecutiveOnes(nums));
	}
	
    public static  int findMaxConsecutiveOnes(int[] nums) {
    	
    	int counter = 0;
    	int maxCount = 0;
    	
    	for(int num : nums) {
    		
    		if(num == 1)
    			counter++;
    		else {
    			maxCount = (counter > maxCount) ? counter : maxCount;
    			counter = 0;
    		}
    	}
    	
    	maxCount = (counter > maxCount) ? counter : maxCount;
        return maxCount;
    }
}
