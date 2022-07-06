package neetcode.io;

public class MinimumInRotatedSortedArray {
	//Input: nums = [3,4,5,1,2]
	//left = 0, right = 4, mid = 2
	public static int findMin(int[] nums) {

		int left = 0, right = nums.length - 1, mid = 0;
		
		while(left < right) {
			mid = left + ((right - left)/2);
			//the pivot where the array decreases.
			if(mid > 0 && nums[mid] < nums[mid - 1])
				return nums[mid];
			//left array is sorted and right not sorted.
			else if(nums[left] <= nums[mid] && nums[mid] > nums[right])
				left = mid + 1;
			else
				right = mid - 1;
		}

		return nums[left];
	}

	public static void main(String[] args) {
		int [] nums = {3,1,2};
		System.out.println(findMin(nums));
	}

}
