package basic;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/*Six possible characters in input string 
[, {, (,), }, ]

Check if opening brackets are clsoed in order

I/P: str = "([])"
O/P : yes

I/P: str ="((())"
O/P: No

I/P: st ="([)]"
O/P: No*/

public class BalancedParanthesisProblem {

	public static void main(String[] args) {

		String s = "((())";
		boolean isBalanced = checkBalancedParanthesis(s);
		System.out.println(isBalanced);

	}

	private static boolean checkBalancedParanthesis(String s) {

		String openingBrackets = "[{(";
		//Stack<Character> stack = new Stack<>();
		Deque<Character> stack = new ArrayDeque<>();
		for (int i = 0; i < s.length(); i++) {
			if (openingBrackets.contains(String.valueOf(s.charAt(i)))) {
				stack.push(s.charAt(i));
			} else {
				if(stack.isEmpty()){
					return false;
				}
				char lastElement = stack.peek();
				boolean isMatching = isMatchingLastElement(s.charAt(i), lastElement);
				if (isMatching) {
					stack.pop();
				} else {
					return false;
				}
			}

		}
		if(stack.isEmpty()){
			return true;
		}else{
			return false;
		}
	}

	private static boolean isMatchingLastElement(Character s, Character lastElement) {

		return ((s == ']' && lastElement == '[') || (s == '}' && lastElement == '{')
				|| (s == ')' && lastElement == '('));

	}

}
