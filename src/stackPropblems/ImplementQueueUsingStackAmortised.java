package stackPropblems;

import java.util.Stack;

public class ImplementQueueUsingStackAmortised {
	
	Stack<Integer> input;
	Stack<Integer> output;
	
	public ImplementQueueUsingStackAmortised() {
		input = new Stack<>();
		output = new Stack<>();
	}

	public void push(int x) {

		input.push(x);
	}

	public int pop() {

		if (!output.isEmpty())
			return output.pop();
		else {
			while (!input.isEmpty())
				output.push(input.pop());

			return output.pop();
		}
	}

	public int peek() {
		if(!output.isEmpty())
			return output.peek();
		else {
			while(!input.isEmpty())
				output.push(input.pop());
			
			return output.peek();
		}
	}

	public boolean empty() {
		return input.isEmpty() && output.isEmpty();
	}
	
	
	public static void main(String[] args) {
		ImplementQueueUsingStackAmortised q1 = new ImplementQueueUsingStackAmortised();
		q1.push(1);
		q1.push(2);
		q1.push(3);
		q1.push(4);
		
		q1.pop();
		q1.pop();
		q1.pop();
		q1.pop();
		
		System.out.println(q1.empty());
		while(!q1.empty())
			System.out.print(q1.pop()+" ");
	}
}
