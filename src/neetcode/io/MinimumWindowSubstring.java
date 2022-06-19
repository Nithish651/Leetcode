package neetcode.io;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

	// Input: s = "ADOBECODEBANC", t = "ABC"
	public static String minWindow(String s, String t) {

		if (t.length() > s.length())
			return "";

		int left = 0, right = 0;
		String result = "";

		while (left < s.length() && right < s.length()) {
			String windowString = s.substring(left, right + 1);
			if (containsAll(windowString, t)) {
				if (result.isEmpty() || windowString.length() <= result.length())
					result = windowString;
				left++;
			} else {
				right++;
			}
		}

		return result;
	}

	private static boolean containsAll(String windowString, String t) {
		Map<Character, Integer> windowFrequency = new HashMap<>();
		Map<Character, Integer> frequency = new HashMap<>();

		for (char c : windowString.toCharArray()) {
			windowFrequency.put(c, windowFrequency.getOrDefault(c, 0) + 1);
		}
		for (char c : t.toCharArray()) {
			frequency.put(c, frequency.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
			if (entry.getValue() > windowFrequency.getOrDefault(entry.getKey(), 0))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(minWindow("ADOBECODEBANC", "ABC"));
		System.out.println(minWindow("a", "i"));
		System.out.println(minWindow("ab", "A"));
		System.out.println(minWindow("aa", "aa"));

	}
}
