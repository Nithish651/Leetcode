package neetcode.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets2 {

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        findSubSets(nums,0, new ArrayList<>(), result);
        return result;
    }
	
	private static void findSubSets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
		
		if(index == nums.length) {
			result.add(new ArrayList<>(current));
			return;
		}
		

		
		//include the current element;
		current.add(nums[index]);
		findSubSets(nums, index+1, current, result);
		
		//skip the duplicate numbers
		while(index < nums.length -1 && nums[index] == nums[index+1] )
			index++;
		//exclude the current element
		current.remove(Integer.valueOf(nums[index]));
		findSubSets(nums,index + 1, current, result);
	}

	public static void main(String[] args) {
		int [] nums = {1,2,2};
		System.out.println(subsetsWithDup(nums));
	}
}
