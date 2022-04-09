package neetcode.io;

import java.util.Stack;

public class MinStack {
	
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> minStack = new Stack<>();

	public void push(int val) {
		stack.push(val);

		if (minStack.isEmpty())
			minStack.push(val);
		else
			minStack.push(Math.min(minStack.peek(), val));

	}

	public void pop() {
		minStack.pop();
		stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}
	
	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.top());
		System.out.println(minStack.getMin());
	}

}
