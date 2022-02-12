package studyplan.algorithm1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PermutationsInString {

	public static void main(String[] args) {

		System.out.println(checkInclusion("ac", "cbb"));

	}

	public static boolean checkInclusion(String s1, String s2) {

		int x = s1.length(), y = s2.length();

		if (y < x || s2.isEmpty())
			return false;

		if (s1.isEmpty())
			return true;

		int[] arr1 = new int[26];
		int[] arr2 = new int[26];

		for (int i = 0; i < x; i++) {
			arr1[s1.charAt(i) - 'a']++;
			arr2[s2.charAt(i) - 'a']++;
		}

		for (int j = x; j < y; j++) {
			if (Arrays.equals(arr1, arr2))
				return true;

			arr2[s2.charAt(j - x) - 'a']--;
			arr2[s2.charAt(j) - 'a']++;
		}

		return Arrays.equals(arr1, arr2);
	}
}
