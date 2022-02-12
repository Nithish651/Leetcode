package arrayProblems;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

	public static void main(String[] args) {
		int [] nums = {1,2,3,1,2,3};
		System.out.println(containsNearbyDuplicate(nums, 2));
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {

		if (nums.length == 1)
			return false;

		Map<Integer, Integer> indexMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			if (indexMap.containsKey(nums[i])) {
				int indexDiff = i - indexMap.get(nums[i]);
				if (indexDiff <= k)
					return true;
				else
					indexMap.put(nums[i], i);
			} else
				indexMap.put(nums[i], i);

		}

		return false;
	}

	
	
}
