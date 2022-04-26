package neetcode.io;

public class BinarySearch {

	public static int search(int[] nums, int target) {

		
		int index = -1;
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] < target)
				left = mid + 1;
			else
				right = mid - 1;
		}

		return index;
	}

	public static void main(String[] args) {
		int nums [] = {2};
		int target = 2;
		
		System.out.println(search(nums,target));
	}
}
