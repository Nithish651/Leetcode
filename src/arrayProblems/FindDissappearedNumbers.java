package arrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDissappearedNumbers {

	public static void main(String[] args) {
		int [] nums = {1,1};
		//System.out.println(findDisappearedNumbers(nums));
		System.out.println(findDisappearedNumbers2(nums));
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {

		if (nums.length == 1)
			return new ArrayList<>();

		List<Integer> result = new ArrayList<>();
		int[] freqArray = new int[nums.length + 1];

		for (int num : nums) {
			freqArray[num]++;
		}

		for(int i=1; i <freqArray.length; i++) {
			if(freqArray[i] == 0)
				result.add(i);
		}

		return result;
	}
	
	//o(1) space
	public static List<Integer> findDisappearedNumbers2(int[] nums) {

		if (nums.length == 1)
			return new ArrayList<>();

		List<Integer> result = new ArrayList<>();
		
		for(int i=0; i < nums.length; i++) {
			System.out.println("index "+(Math.abs(nums[i]) - 1));
			int index = Math.abs(nums[i]) - 1;
			nums[index] = Math.abs(nums[index]) * -1;
		}
		
		for(int i=0; i < nums.length; i++) {
			if(nums[i] > 0)
				result.add(i+1);
		}

		return result;
	}

}
