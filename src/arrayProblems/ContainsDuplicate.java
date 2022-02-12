package arrayProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {

	
	public static void main(String[] args) {
		int [] nums = {1,2,3,1};
		System.out.println(containsDuplicate(nums));
	}
	
	public static  boolean containsDuplicate(int[] nums) {
		
		if(nums.length == 1)
			return false;
		
		Map<Integer,Integer> freqMap = new HashMap<>();
		
		for(int num : nums) {
			freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
			if(freqMap.get(num) > 1)
				return true;
		}
		
        return false;
    }
	
	public static  boolean containsDuplicate2(int[] nums) {
		
		if(nums.length == 1)
			return false;
		
		Set<Integer> set = new HashSet<>();
		
		for(int num : nums) {
			if(!set.contains(num))
				set.add(num);
			else
				return true;
		}
		
        return false;
    }
}
