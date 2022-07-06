package neetcode.io;

public class SearchInSortedArray {

	// Input: nums = [4,5,6,7,0,1,2], target = 0
	public static int search(int[] nums, int target) {
		int left = 0, right = nums.length - 1, mid = 0;

		while (left <= right) {
			mid = left + ((right - left) / 2);
			if (nums[mid] == target)
				return mid;

			if (nums[left] <= nums[mid]) {
				if (nums[left] <= target && target <= nums[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			} else if (nums[right] >= nums[mid]) {
				if (nums[mid] <= target && target <= nums[right]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 7,0,1,2,3,4,5,6};
		int target = 7;
		System.out.println(search(nums, target));
	}

}
