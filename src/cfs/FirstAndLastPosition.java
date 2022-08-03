package cfs;

public class FirstAndLastPosition {

	public static int searchHelper(int[] nums, int target, boolean isFirst) {
		int left = 0;
		int right = nums.length - 1;
		int mid = 0;
		int position = -1;

		while (left <= right) {
			mid = left + (right - left) / 2;

			if (target < nums[mid])
				right = mid - 1;
			else if (target > nums[mid])
				left = mid + 1;
			else {
				position = mid;
				if (isFirst)
					right = mid - 1;
				else
					left = mid + 1;

			}
		}
		
		return position;
	}

	public static int[] searchRange(int[] nums, int target) {
		int first = searchHelper(nums,target,true);
		int last = searchHelper(nums,target,false);
		int [] result = {first,last};
		return result;
	}

	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};

		int[] indices = searchRange(nums, 8);

		for (int i : indices) {
			System.out.print(i + " ");
		}
	}

}
