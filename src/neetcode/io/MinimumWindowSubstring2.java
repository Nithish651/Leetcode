package neetcode.io;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring2 {

	// Input: s = "ADOBECODEBANC", t = "ABC"
	public static String minWindow(String s, String t) {

		if (t.length() > s.length())
			return "";

		String result = "";

		int left = 0, right = 0, available = 0, required = t.length();
		Map<Character, Integer> frequency = new HashMap<>();
		Map<Character, Integer> windowFrequency = new HashMap<>();

		for (char c : t.toCharArray())
			frequency.put(c, frequency.getOrDefault(c, 0) + 1);

		while (left < s.length() && right <= s.length() + 1) {
			if (available == required) {
				String window = s.substring(left, right);

				if (result.isEmpty() || result.length() > window.length())
					result = window;

				windowFrequency.put(s.charAt(left), windowFrequency.getOrDefault(s.charAt(left), 0) - 1);

				if (frequency.containsKey(s.charAt(left))
						&& windowFrequency.getOrDefault(s.charAt(left), 0) < frequency.getOrDefault(s.charAt(left), 0))
					available--;

				left++;

			} else {
				if (right < s.length()) {
					windowFrequency.put(s.charAt(right), windowFrequency.getOrDefault(s.charAt(right), 0) + 1);

					if (frequency.containsKey(s.charAt(right)) && windowFrequency.getOrDefault(s.charAt(right),
							0) <= frequency.getOrDefault(s.charAt(right), 0))
						available++;

					right++;
				} else
					break;
			}
		}

		return result;

	}

	public static void main(String[] args) {
		System.out.println(minWindow("ADOBECODEBANC", "ABC"));
		System.out.println(minWindow("a", "i"));
		System.out.println(minWindow("ab", "A"));
		System.out.println(minWindow("aa", "aa"));
	}

}
