package arrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges {

	public static void main(String[] args) {
		int [] nums = {};
		System.out.println(summaryRanges(nums));
	}

	public static List<String> summaryRanges(int[] nums) {

		if (nums == null || nums.length == 0)
			return new ArrayList<String>();

		if (nums.length == 1)
			return Arrays.asList(String.valueOf(nums[0]));

		int left = 0;
		int right = 0;

		List<String> result = new ArrayList<>();

		for (int i = 0; i < nums.length - 1; i++) {

			if (!(nums[i + 1] - nums[i] == 1)) {
				if (left == right)
					result.add(String.valueOf(nums[left]));
				else {
					result.add(String.valueOf(nums[left]) + "->" + nums[right]);
				}
				left = i + 1;
				right = i + 1;

			} else
				right++;

		}
		
		if (left == right)
			result.add(String.valueOf(nums[left]));
		else {
			result.add(String.valueOf(nums[left]) + "->" + nums[right]);
		}

		return result;
	}
}
