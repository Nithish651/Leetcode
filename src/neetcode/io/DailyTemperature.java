package neetcode.io;

import java.util.Stack;

public class DailyTemperature {
	// Input: temperatures = [73,74,75,71,69,72,76,73]
	// Output: [1,1,4,2,1,1,0,0]

	public static int[] dailyTemperatures(int[] temperatures) {
		int[] result = new int[temperatures.length];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < temperatures.length; i++) {
			while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
				int index = stack.pop();
				result[index] = i - index;
			}
			stack.push(i);
		}
		return result;
	}

	public static void main(String[] args) {
		//int [] temperatures = {73,74,75,71,69,72,76,73};
		int [] temperatures = {1};
		int [] result = dailyTemperatures(temperatures);
		
		for(int i : result) {
			System.out.print(i+" ");
		}
	}

}
