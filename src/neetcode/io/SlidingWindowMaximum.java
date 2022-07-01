package neetcode.io;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
	// Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
	public static int[] maxSlidingWindow(int[] nums, int k) {
		int[] result = new int[nums.length - k + 1];
		Deque<Integer> deque = new LinkedList<>();
		int index = -1;

		for (int i = 0; i < nums.length; i++) {
			// removing out of bounds
			while (!deque.isEmpty() && deque.peek() == i - k)
				deque.poll();

			while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i])
				deque.pollLast();

			deque.offer(i);

			if (i >= k - 1)
				result[++index] = nums[deque.peek()];

		}

		return result;
	}

	public static void main(String[] args) {



		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int[] result = maxSlidingWindow(nums, 3);
		for (int i : result) {
			System.out.print(i + " ");
		}
	}
}
