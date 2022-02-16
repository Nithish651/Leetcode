package arrayProblems;

import java.util.Arrays;

public class AssignCookies {

	public static void main(String[] args) {
		int [] g = {1,2};
		int [] s = {1,2,3};
		
		System.out.println(findContentChildren(g,s));
	}

	public static int findContentChildren(int[] g, int[] s) {

		int childPointer = 0;
		int cookiePointer = 0;

		Arrays.sort(s);
		Arrays.sort(g);

		while (childPointer < g.length && cookiePointer < s.length) {

			if (g[childPointer] <= s[cookiePointer]) {
				cookiePointer++;
				childPointer++;
			} else {
				cookiePointer++;
			}

		}

		return childPointer;
	
	}

}
