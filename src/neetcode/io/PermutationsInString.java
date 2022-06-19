package neetcode.io;

import java.util.Arrays;

public class PermutationsInString {

	public static boolean checkInclusion(String s1, String s2) {

		if (s1.length() > s2.length() || s1.isEmpty() || s2.isEmpty())
			return false;

		if (s1.equalsIgnoreCase(s2))
			return true;

		int[] arr1 = new int[26];
		int[] arr2 = new int[26];

		for (int i = 0; i < s1.length(); i++) {
			arr1[s1.charAt(i) - 'a']++;
		}

		int left = 0, right = s1.length() - 1;

		for (int i = 0; i < right; i++) {
			arr2[s2.charAt(i) - 'a']++;
		}

		while (left < s2.length() && right < s2.length()) {
			arr2[s2.charAt(right) - 'a']++;
			if (Arrays.equals(arr1, arr2))
				return true;
			else {
				arr2[s2.charAt(left) - 'a']--;
				left++;
				right++;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(checkInclusion("","a"));
	}

}
