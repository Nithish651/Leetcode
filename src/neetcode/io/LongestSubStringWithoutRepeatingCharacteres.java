package neetcode.io;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacteres {

	// abcabcbb
	// pwwkew

	public static int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<>();
		int left = 0, right = 0, length = 0, maxLength = 0;

		while (left < s.length() && right < s.length()) {
			if (!set.contains(s.charAt(right))) {
				length = Math.abs(right-left)  + 1;
				maxLength = Math.max(length, maxLength);
				set.add(s.charAt(right));
				right++;
			} else {
				set.remove(s.charAt(left));
				left++;
			}
		}

		return maxLength;
	}

	public static void main(String[] args) {
		//System.out.println(lengthOfLongestSubstring("abcabcbb"));
		//System.out.println(lengthOfLongestSubstring("bbbb"));
		System.out.println(lengthOfLongestSubstring("abcbbcbb"));
	}
}
