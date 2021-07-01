package day34;

import java.util.Stack;

public class BalancedStr {
	public static void main(String[] args) {
		System.out.println(isBalancedStr("[{()}]"));       // true
		System.out.println(isBalancedStr("[({(}})]"));     // false
		System.out.println(isBalancedStr("{[}"));          // false
		System.out.println(isBalancedStr("({}{}([{}]))")); // true
		System.out.println(isBalancedStr("({"));           // false
	}
	
	/*
	 * [,{,(,],},]
	 * 
	 * "[{()}]"        - true
	 * "[({(}})]"      - false
	 * "{[}"           - false
	 * "({}{}([{}]))"  - true
	 * "({"            - false
	 * "({})"          - false
	 */
	public static boolean isBalancedStr(String str) {
		// open pr: [, {, ( 
		// close pr: ], }, )
		
		Stack<Character> st = new Stack<>();
		for (char ch : str.toCharArray()) {
			
			// if its open pr add to the stack
			if (ch == '[' || ch == '{' || ch == '(') {
				st.push(ch);
				
			} else  {
				// get latest open
				char latestOpen = st.pop();
				
				// ch - closed pr
				if (latestOpen == '[' && ch != ']') {
					return false;
				} else if (latestOpen == '{' && ch != '}') {
					return false;//              
				} else if (latestOpen == '(' && ch != ')') {
					return false;
				}
			}			
		}
				
		return st.size() == 0;
	}
}
