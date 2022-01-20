package easy;

import java.util.HashMap;
import java.util.Map;

public class RomoanToInteger {

	public static void main(String[] args) {
		System.out.println(romanToInt("MMMCMXCIX"));
	}

	public static int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int prev = 0;
		int result = 0;

		for (char c : s.toCharArray()) {
			if (prev < map.get(c) && prev != 0) {
				result -= prev;
				result += map.get(c) - prev;
			} else {
				result += map.get(c);
				prev = map.get(c);
			}
		}
		return result;
	}
}
