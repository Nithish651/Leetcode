package easy;

import java.util.Stack;

public class ValidParanthesis {
	
	static char [] openTerms = {'{','[','('};
	static char [] closedTerms = {'}',']',')'};
	
	public static void main(String[] args) {
		
		System.out.println(isValid("(]"));
	}
	
	private static boolean isValid(String str) {
		Stack<Character> charStack = new Stack<>();
		
		for(char c : str.toCharArray()) {
			if(isOpenTerm(c)) {
				charStack.push(c);
			}else if(!charStack.isEmpty()) {
				 if(closedTerms[getOpenTermIndex(charStack.peek())] != c)
					 return false;
				 else
					 charStack.pop();
			}else
				return false;
		}
		return charStack.isEmpty();
	}

	private static int getOpenTermIndex(Character openTerm) {
		int i = 0;
		for (; i < openTerms.length; i++) {
			if (openTerm == openTerms[i])
				break;
		}
		return i;
	}

	private static boolean isOpenTerm(char c) {
		return c == openTerms[0] || c == openTerms[1] || c == openTerms[2];
	}

}
