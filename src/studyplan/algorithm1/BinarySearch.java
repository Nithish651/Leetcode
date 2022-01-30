package studyplan.algorithm1;

public class BinarySearch {
	
	public static void main(String[] args) {
		int [] nums = {2,3};
		System.out.println(search(nums, 3));
	}
	
	
	
	public static int search(int[] nums, int target) {

		int left = 0;
		int right = nums.length - 1;
		int mid = 0;

		while (right >= left) {
			mid = left + ((right - left) / 2);

			if (nums[mid] == target)
				return mid;
			else if (nums[mid] > target)
				right = mid - 1;
			else
				left = mid + 1;

		}

		return -1;
	}

}
