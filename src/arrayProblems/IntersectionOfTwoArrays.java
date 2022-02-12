package arrayProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int [] nums1 = {4,9,5};
		int [] nums2 = {9,4,9,8,4};
		for(int num : intersection(nums1,nums2)) {
			System.out.print(num+" ");
		}
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		List<Integer> result = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
	

		for (int num : nums1) {
			set.add(num);
		}

		for (int num : nums2) {
			if (set.contains(num)) {
				set.remove(num);
				result.add(num);
			}
				
		}

		return result.stream().mapToInt(i -> i).toArray();
	}
}
