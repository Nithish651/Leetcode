package neetcode.io;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        findPermutations(nums,0,result);
        return result;
    }
    

	private static void findPermutations(int[] nums, int index, List<List<Integer>> result) {

		if (index == nums.length) {
			List<Integer> list = new ArrayList<>();

			for (int num : nums)
				list.add(num);

			result.add(list);
			return;
		}
		
		for(int i=index; i < nums.length; i++) {
			swap(nums,index,i);
			findPermutations(nums,index+1,result);
			swap(nums,index,i);
		}
		
	}


	private static void swap(int[] nums, int index, int i) {
		int temp = nums[index];
		nums[index] = nums[i];
		nums[i] = temp;
	}


	public static void main(String[] args) {
		int [] nums = {1,2,3};
		System.out.println(permute(nums));
	}
}
