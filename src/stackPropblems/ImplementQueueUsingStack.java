package stackPropblems;

import java.util.Stack;

public class ImplementQueueUsingStack {

	Stack<Integer> stack1;
	Stack<Integer> stack2;

	public ImplementQueueUsingStack() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}

	public void push(int x) {

		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}

		stack1.push(x);

		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
	}

	public int pop() {
		return stack1.pop();
	}

	public int peek() {
		return stack1.peek();
	}

	public boolean empty() {
		return stack1.isEmpty();
	}
	
	public static void main(String[] args) {
		ImplementQueueUsingStack q1 = new ImplementQueueUsingStack();
		q1.push(1);
		q1.push(2);
		q1.push(3);
		q1.push(4);
		
		q1.pop();
		
		while(!q1.empty())
			System.out.print(q1.pop()+" ");
	}
}
