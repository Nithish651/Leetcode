package neetcode.io;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	
	
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(candidates,0,target,new ArrayList<Integer>(),result);
        return result;
    }

	
	private static void findCombinations(int[] candidates, int index, int target, List<Integer> current,
			List<List<Integer>> result) {
		
		if(target == 0)
			result.add(new ArrayList<>(current));
		else if(target < 0 || index >= candidates.length)
			return;
		else {
			//include the current number
			current.add(candidates[index]);
			findCombinations(candidates,index, target - candidates[index], current,result);
			
			//exclude the current number
			current.remove(Integer.valueOf(candidates[index]));
			findCombinations(candidates,index + 1, target, current, result);
		}
		
	}


	public static void main(String[] args) {
		int []  nums = {2,3,6,7}; int target = 7;
		System.out.println(combinationSum(nums, target));
	}
}
