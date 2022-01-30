package studyplan.algorithm1;

public class RotateArray {

	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,6,7};
		
		/*
		 * for (int i : rotate(nums,2)) { System.out.print(i+" "); }
		 */
		
		rotateWithoutSpace(nums, 3);
		
		for (int i : nums) {
			System.out.print(i+" ");
		}
	}

	//O(N) with O(N) space
	public static int[] rotate(int[] nums, int k) {
		int[] result = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			result[(i + k) % nums.length] = nums[i];
		}

		return result;
	}
	
	//O(N) with O(1) space;
	
	public static void rotateWithoutSpace(int[] nums, int k) {
		k = k % nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}
	
	public static void reverse(int[] nums, int left, int right) {
		int temp = 0;
		while (left < right) {
			temp = nums[right];
			nums[right] = nums[left];
			nums[left] = temp;
			left++;
			right--;

		}
	}

}
