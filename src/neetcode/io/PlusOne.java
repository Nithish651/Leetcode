package neetcode.io;

public class PlusOne {

	public static int[] plusOne(int[] digits) {
		int carry = 1;
		int sum = 0;
		int[] results = null;

		for (int i = digits.length-1; i >=0; i--) {
			sum = digits[i] + carry;
			if (sum > 9) {
				digits[i] = 0;
				carry = 1;
			} else {
				digits[i] = sum;
				carry=0;
			}

		}
		if (carry > 0) {
			results = new int[digits.length + 1];
			results[0] = 1;
			return results;
		}
		return digits;
	}

	public static void main(String[] args) {
		int [] digits = {9,9};
		for(int i : plusOne(digits)) {
			System.out.print(i);
		}
	}
}
