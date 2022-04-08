package neetcode.io;

public class ValidAnagrams {

	public static boolean isAnagram(String s, String t) {

		if (s.length() != t.length())
			return false;

		int[] letters = new int[26];

		for (int i = 0; i < s.length(); i++) {
			letters[(int) s.charAt(i) - 97]++;
			letters[(int) t.charAt(i) - 97]--;
		}

		for (int i = 0; i < 26; i++) {
			if (letters[i] > 0)
				return false;
		}

		return true;
	}
	


	public static void main(String[] args) {
		System.out.println(isAnagram("abba", "baba"));
	}
	
	

}
