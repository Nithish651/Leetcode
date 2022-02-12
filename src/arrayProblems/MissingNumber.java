package arrayProblems;

public class MissingNumber {
	
	public static void main(String[] args) {
		int [] nums = {1};
		System.out.println(missingNumber(nums));
	}
	
    public static int missingNumber(int[] nums) {
        
    	int n = nums.length;
    	
    	int sum = (n * (n+1))/2;
    	
    	int arrSum = 0;
    	
    	for(int num : nums) {
    		arrSum = arrSum + num;
    	}
    	
    	return sum - arrSum;
    }

}
