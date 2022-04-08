package neetcode.io;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.get(target - nums[i]) == null)
				map.put(nums[i], i);
			else {
				result[0] = map.get(target - nums[i]);
				result[1] = i;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int [] nums = {3,3};
		int target = 6;
		int [] result = twoSum(nums,target);
		for(int n : result) {
			System.out.print(n+" ");
		}
	}

}
