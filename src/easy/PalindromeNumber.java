package easy;

public class PalindromeNumber {

	public static void main(String[] args) {

		System.out.println(isPalindrome(0));

	}

	private static boolean isPalindrome(int x) {

		//if x is negative it is not a palindrome. ex: -121 => 121-
		//if x evenly divides by 10. ie: has 0 at the end. it is not a palindrome.
		if (x < 0 || (x != 0 && x % 10 == 0))
				return false;

		int reversed = 0;

		//checking till half the number to reduce a holding variable.
		// for numbers with odd number of digits, divide by 10 to ignore middle number.
		// example : `12121 => 12 > 121
		while (x > reversed) {
			reversed = (reversed * 10) + x % 10;
			x = x / 10;
		}

		return x == reversed || x == reversed / 10;

	}

}
