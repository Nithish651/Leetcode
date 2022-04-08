package easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
		
		System.out.println(isHappy(2));

	}

	public static boolean isHappy(int n) {

		Set<Integer> set = new HashSet<>();

		while (!set.contains(n)) {
			set.add(n);
			n = getSumSquared(n);

			if (n == 1)
				return true;

			if (set.contains(n))
				return false;
		}

		return false;
	}

	private static int getSumSquared(int n) {

		int sum = 0;

		while (n > 0) {
			int digit = n % 10;
			sum += Math.pow(digit, 2);
			n /= 10;
		}

		return sum;
	}
}
