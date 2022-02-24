package stackPropblems;

import java.util.Stack;

public class MinStack {
	
	Stack<Integer> stack = null;
	Stack<Integer> minStack = null;

	
	@Override
	public String toString() {
		return "MinStack [stack=" + stack+"]";
	}

	public MinStack() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int val) {
		
		if( minStack.isEmpty() || val <= minStack.peek()) {
			minStack.push(val);
		}
		stack.push(val);
	}

	public void pop() {
		
		if(stack.peek().equals(minStack.peek())) {
			minStack.pop();
		}
		stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}
	
	
	public static void main(String[] args) {
		MinStack ms = new MinStack();
		ms.push(1);
		ms.push(0);
		ms.push(-3);
		ms.pop();
		System.out.println(ms.getMin());
		
		System.out.println(ms);
	}
}
