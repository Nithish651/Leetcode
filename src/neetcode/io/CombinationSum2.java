package neetcode.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

	
	//Sort the array to group duplicate elements.
	//when excluding the element skip all the duplicate elements.
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(candidates);
		int sum = 0;
		findCombinationSum(candidates, target, 0, sum, new ArrayList<Integer>(), result);
		return result;
	}

	private static void findCombinationSum(int[] candidates, int target, int index, int sum, ArrayList<Integer> subset,
			List<List<Integer>> result) {

		if (sum == target) {
			result.add(subset);
			return;
		}

		if (index >= candidates.length || sum > target)
			return;

		// include the current index;
		subset.add(candidates[index]);
		sum += candidates[index];
		findCombinationSum(candidates, target, index + 1, sum, new ArrayList<>(subset), result);
		sum -= candidates[index];
		subset.remove(Integer.valueOf(candidates[index]));

		// skip all the duplicate occurances;
		while (index < candidates.length - 1 && candidates[index] == candidates[index + 1])
			index++;
		findCombinationSum(candidates, target, index + 1, sum, new ArrayList<>(subset), result);

	}

	public static void main(String[] args) {
		int[] nums = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		System.out.println(combinationSum2(nums, target));
	}
}
