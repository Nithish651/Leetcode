package neetcode.io;

public class MaximumSubArray {

	
    public static int maxSubArray(int[] nums) {
    	
    	if(nums.length == 1)
    		return nums[0];
    	
    	int maxSum = 0;
    	int sum = 0;
    	
    	for(int i=0; i < nums.length; i++) {
    		sum += nums[i];
    		if(sum > maxSum )
    			maxSum = sum;
    		else
    			sum = 0;
    			
    	}
        return maxSum;
    }
	
	public static void main(String[] args) {
		
	}
}
