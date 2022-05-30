package neetcode.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {
			if (i == 0 || nums[i - 1] != nums[i]) {
				int left = i + 1;
		 		int right = nums.length - 1;
				int target = 0 - nums[i];
				int currentSum = 0;

				while (left < right) {
					currentSum = nums[left] + nums[right];
					if (currentSum == target) {
						result.add(Arrays.asList(nums[i], nums[left], nums[right]));
						while (left < nums.length-1 && nums[left] == nums[left + 1])
							left++;
						while (right < nums.length-1 && nums[right] == nums[right - 1])
							right--;
						left++;
						right--;
					} else if (currentSum > target)
						right--;
					else
						left++;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int [] nums = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));
	}
}
