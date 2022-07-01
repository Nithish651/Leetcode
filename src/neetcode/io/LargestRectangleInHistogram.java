package neetcode.io;

import java.util.Stack;

public class LargestRectangleInHistogram {

	// [2,1,5,6,2,3]
	public static int largestRectangleAreaEfficient(int[] heights) {
		int max = 0;
		Stack<Integer> stack = new Stack<>();
		
		//i == n is for the last pass after the array
		for (int i = 0; i <= heights.length; i++) {
			
			while (!stack.isEmpty() && (i == heights.length || heights[stack.peek()] >= heights[i])) {
				int height = heights[stack.pop()];
				int width;
				
				if(stack.isEmpty())
					width = i; // i - 0 ie : right smaller - left smaller;
				else
					width = i - stack.peek() - 1;
				
				max = Math.max(max, height * width);
			}
			stack.push(i);
		}
		return max;
	}

	// [2,1,5,6,2,3]
	public static int largestRectangleArea(int[] heights) {
		int[] leftBoundary = new int[heights.length];
		int[] rightBoundary = new int[heights.length];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < heights.length; i++) {
			while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
				stack.pop();
			}
			if (stack.isEmpty())
				leftBoundary[i] = 0;
			else
				leftBoundary[i] = stack.peek() + 1;

			stack.push(i);
		}

		while (!stack.isEmpty())
			stack.pop();

		for (int i = heights.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
				stack.pop();
			}
			if (stack.isEmpty())
				rightBoundary[i] = heights.length - 1;
			else
				rightBoundary[i] = stack.peek() - 1;

			stack.push(i);
		}

		int max = 0;

		for (int i = 0; i < heights.length; i++) {
			max = Math.max(max, heights[i] * (rightBoundary[i] - leftBoundary[i] + 1));
		}

		return max;
	}

	public static void main(String[] args) {
		int[] heights = { 2, 1, 5, 6, 2, 3 };
		System.out.println(largestRectangleArea(heights));
		System.out.println(largestRectangleAreaEfficient(heights));
	}
}
