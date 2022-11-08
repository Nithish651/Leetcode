package neetcode.io;

import java.util.ArrayList;
import java.util.List;

public class SubSets {

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		addSubSets(new ArrayList<>(),0,nums,result);
		return result;
	}
	
	
	private static void addSubSets(List<Integer> current, int index, int[] nums, List<List<Integer>> result) {
		
		if(index == nums.length) {
			result.add(current);
			return;
		}
		
		//include the index in the current list;
		current.add(nums[index]);
		addSubSets(new ArrayList<Integer>(current),index+1,nums,result);
		
		//exclude the index in the currrent list;
		current.remove(Integer.valueOf(nums[index]));
		addSubSets(new ArrayList<Integer>(current),index + 1,nums,result);
	}


	public static void main(String[] args) {
		int [] nums = {1,2,3};
		System.out.println(subsets(nums));
	}
}
