package studyplan.algorithm1;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		
		System.out.println(lengthOfLongestSubString(null));
	}

	public static int lengthOfLongestSubString(String s) {
		
		if(s == null || s.isEmpty())
			return 0;
		
		if(s.length() == 1)
			return 1;
		
		int left = 0;
		int right = 0;
		int max = 0;
		int length = 0;
		
		Set<Character> set = new HashSet<>();
		
		while(right < s.length()) {
			if(!set.contains(s.charAt(right))) {
				length = (right - left) + 1;
				max = max > length ? max : length;
				set.add(s.charAt(right));
				right++;
			}else {
				set.remove(s.charAt(left));
				left++;
			}
		}

		
		
		
		return max;
	}

}
