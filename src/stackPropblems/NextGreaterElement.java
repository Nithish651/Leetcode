package stackPropblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		
		int [] nums1 = {9,7};
		int  [] nums2 = {3,10,4,2,1,2,6,1,7,2,9};
		
		for(Integer num : nextGreaterElement(nums1, nums2)) {
			System.out.print(num+" ");
		}

	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

		Map<Integer, Integer> nextGreatest = new HashMap<>();
		Stack<Integer> stack = new Stack<>();

		for (Integer num : nums2) {

			while (!stack.isEmpty() && stack.peek() < num) {
				nextGreatest.put(stack.pop(), num);
			}

			stack.push(num);
		}

		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = nextGreatest.getOrDefault(nums1[i], -1);
		}

		return nums1;
	}

}
