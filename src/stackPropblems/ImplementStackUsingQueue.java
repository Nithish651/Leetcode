package stackPropblems;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {

	Queue<Integer> queue;

	public ImplementStackUsingQueue() {
		queue = new LinkedList<>();
	}

	public void push(int x) {
		queue.add(x);

		int i = 0;

		while (i < queue.size() - 1) {
			int rem = queue.remove();
			queue.add(rem);
			i++;
		}
	}

	public int pop() {
		return queue.remove();
	}

	public int top() {
		return queue.peek();
	}

	public boolean empty() {
		return queue.isEmpty();
	}
	
	
	public static void main(String[] args) {
		ImplementStackUsingQueue stack = new ImplementStackUsingQueue();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.top());
		stack.push(3);
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.top());
		System.out.println(stack.empty());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.empty());
	}
}
