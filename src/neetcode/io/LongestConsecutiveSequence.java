package neetcode.io;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static int longestConsecutive(int[] nums) {

		int maxLength = 0;
		Set<Integer> set = new HashSet<>();

		for (int num : nums) {
			set.add(num);
		}

		for (int num : nums) {
			int length = 0;
			if (!set.contains(num - 1)) {
				length++;
				while (set.contains(num + 1)) {
					length++;
					num += 1;
				}
				maxLength = Math.max(length, maxLength);
			}
		}

		return maxLength;
	}

	public static void main(String[] args) {
		int[] nums = { 0,3,7,2,5,8,4,6,0,1 };
		System.out.println(longestConsecutive(nums));
	}
}
