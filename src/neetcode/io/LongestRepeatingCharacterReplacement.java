package neetcode.io;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {

	// Input: s = "ABAB", k = 2
	public static int characterReplacement(String s, int k) {
		Map<Character, Integer> frequency = new HashMap<>();
		int left = 0, result = 0;

		for (int right = 0; right < s.length(); right++) {
			frequency.put(s.charAt(right), frequency.getOrDefault(s.charAt(right), 0) + 1);
			if ((right - left + 1) - Collections.max(frequency.values()) > k) {
				frequency.put(s.charAt(left), frequency.getOrDefault(s.charAt(left), 0) - 1);
				left++;
			}
			result = Math.max(result, right - left + 1);
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(characterReplacement("ABAA", 0));
	}
}
