package neetcode.io;

public class ProductOfArrayExceptSelf {

	// [1,2,3,4]
	// prefix - [1,2,6,24]
	// postFix -[24,24,,12,4]
	public static int[] productExceptSelf(int[] nums) {

		int[] prefixProduct = new int[nums.length];
		int[] postFixProduct = new int[nums.length];
		int[] output = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			prefixProduct[i] = i == 0 ? 1 * nums[i] : prefixProduct[i - 1] * nums[i];
		}
		

		for (int i = nums.length - 1; i >= 0; i--) {
			postFixProduct[i] = i == nums.length - 1 ? 1 * nums[i]
					: postFixProduct[i + 1] * nums[i];
		}

		for (int i = 0; i < nums.length; i++) {
			if (i == 0)
				output[i] = 1 * postFixProduct[i + 1];
			else if (i == nums.length - 1)
				output[i] = 1 * prefixProduct[i - 1];
			else
				output[i] = prefixProduct[i - 1] * postFixProduct[i + 1];
		}

		return output;
	}
	
	public static int[] productExceptSelfEfficient(int [] nums) {
		int [] output = new int[nums.length];
		int prefix = 1;
		int postFix = 1;
		
		for(int i=0; i < nums.length; i++) {
			output[i] = prefix;
			prefix *= nums[i];
		}
		
		for(int i=nums.length-1; i >= 0 ; i--) {
			output[i] *= postFix;
			postFix *= nums[i];
		}
		
		return output;
	}
	

	public static void main(String[] args) {
		int [] nums = {1,2,3,4};
		int [] result = productExceptSelf(nums);
		int [] result1 = productExceptSelfEfficient(nums);
		
		for(int i : result)
			System.out.print(i+" ");
		
		System.out.println();
		
		for(int i : result1)
			System.out.print(i+" ");
	}
}
