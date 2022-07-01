package neetcode.io;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {

	public static List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		backTrack("", 0, 0, result, n);
		return result;
	}

	private static void backTrack(String current, int open, int close, List<String> result, int max) {
		if (current.length() == max * 2) {
			result.add(current);
			return;
		}

		if (open < max)
			backTrack(current + "(", open + 1, close, result, max);
		if (close < open)
			backTrack(current + ")", open, close + 1, result, max);

	}

	public static void main(String[] args) {
		System.out.println(generateParenthesis(3));
	}
}
