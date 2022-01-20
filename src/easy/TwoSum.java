package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args) {
		

		int [] nums = {3,3};
		
		int target = 6;
		int [] result = new int[2];
		
		Map<Integer,Integer> indMap = new HashMap<>();
		
		for(int i=0; i < nums.length; i++) {
			if(indMap.get(target - nums[i]) == null) {
				indMap.put(nums[i], i);
			}else {
				result[0] = indMap.get(target - nums[i]);
				result[1] = i;
			}
		}
		System.out.println(result[0]+" "+result[1]);
	}

}
