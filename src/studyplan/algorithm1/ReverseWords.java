package studyplan.algorithm1;

public class ReverseWords {

	public static void main(String[] args) {
		String a = "this is a big word, very big word!!!";
		System.out.println(reverseWords(a));
	}

	public static String reverseWords(String s) {

		if (s.indexOf(" ") == -1)
			return reverse(s.toCharArray());

		StringBuffer buf = new StringBuffer();

		int left = 0;
		int right = 0;

		while (left < s.length() && right < s.length()) {

			if (s.charAt(right) != ' ')
				right++;
			else {
				buf.append(reverse(s.substring(left, right).toCharArray()));
				buf.append(" ");
				left = right + 1;
				right++;
			}

		}

		buf.append(reverse(s.substring(left, right).toCharArray()));
		return buf.toString();
	}

	public static String reverse(char[] chars) {
		int left = 0;
		int right = chars.length - 1;
		char temp = 'a';

		while (left < right) {
			temp = chars[right];
			chars[right] = chars[left];
			chars[left] = temp;
			left++;
			right--;
		}
		return new String(chars);
	}

}
