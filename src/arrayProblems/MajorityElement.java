package arrayProblems;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int [] nums = {3,2,3,5,5,5};
		System.out.println(majorityElement(nums));
		System.out.println(majorityElements(nums));
	}
	
	//o(n) approach
	public static int majorityElement(int[] nums) {
		
		Map<Integer,Integer> map = new HashMap<>();
		int result = 0;
		int count = 0;
		
		
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
			if(map.get(i) > count ) {
				count = map.get(i);
				result = i;
			}
				
		}
		
        return result;
    }
	
	//o(n) without extra space approacg
	public static int majorityElements(int[] nums) {

		int result = nums[0];
		int count = 1;
		
		for(int i=1; i < nums.length; i++) {
			
			if(result == nums[i]) {
				count++;
			}else {
				count--;
				if(count == 0) {
					result = nums[i];
					count = 1;
				}
			}
		}
		
		return result;
		
	}
}
