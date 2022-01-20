package easy;

public class MaximumSubArray {
	
	public static void main(String[] args) {
		int [] nums = {5,4,-1,7,8};
		System.out.println(maxSubArray(nums));
	}
	
	 public static int maxSubArray(int[] nums) {
	      int maxSum = Integer.MIN_VALUE;
	      int currentSum = 0;
	      
	      for (int i = 0; i < nums.length; i++) {
			currentSum = Math.max(nums[i], nums[i] + currentSum);
			maxSum = Math.max(maxSum, currentSum);
		}
	      return maxSum;
	  }

}
