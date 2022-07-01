package neetcode.io;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	
	private static boolean isNumeric(String s) {
		return !("+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s));
	}

	public static int evalRPN(String[] tokens) {
		int result = 0;
		Stack<Integer> stack = new Stack<>();

		for (String string : tokens) {

			if (isNumeric(string))
				stack.push(Integer.parseInt(string));
			else {
				int b = stack.pop();
				int a = stack.pop();

				switch (string) {
				case "+":
					result = a + b;
					break;
				case "-":
					result = a - b;
					break;
				case "*":
					result = a * b;
					break;
				case "/":
					result = a / b;
					break;
				}
				stack.push(result);
			}

		}
		
		if(!stack.isEmpty())
			result = stack.pop();
		
		return result;
	}

	public static void main(String[] args) {
		String [] tokens = {"18"};
		System.out.println(evalRPN(tokens));
	}
}
