package day49;

import java.util.Stack;

public class BalancedStr {
	public static void main(String[] args) {
		// We can use Stack
		// LIFO - last in, first out
		System.out.println(isBalanced("[{()}]")); // true 
		System.out.println(isBalanced("[({)}]")); // false
		System.out.println(isBalanced("{[}"));    // false
		System.out.println(isBalanced("{}{}([()])")); // true
		System.out.println(isBalanced("({")); // false
	}
	
	/*
	 * [ { (
	 * ] } )
	 * 
	 * isBalanced("[{()}]")     -> true
	 * isBalanced("[({)}]")     -> false
	 * isBalanced("{[}")        -> false
	 * isBalanced("{}{}([()])") -> true
	 * isBalanced("({")         -> false
	 */
	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		
		// loop over the str
		for (char ch : str.toCharArray()) {
			// if ch is 'open brace' then put into the stack 
			if (ch == '[' || ch == '{' || ch == '(') {
				stack.push(ch);
				
			} else {
				// get latest open
				char open = stack.pop(); 
				char close = ch;
				
				// make sure the latest open match with closed brace
				if (open == '[' && close != ']') {
					return false;
				} else if (open == '{' && close != '}') {
					return false;
				} else if (open == '(' && close != ')') {
					return false;
				} 
			}
		}
		
		// if stack is empty string is balanced
		return stack.isEmpty();
	}
}
