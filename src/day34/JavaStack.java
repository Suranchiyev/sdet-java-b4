package day34;

import java.util.Stack;

public class JavaStack {
	public static void main(String[] args) {
		// Stack Data Structure
		// LIFO - Last In, First Out
		
		Stack<String> msg = new Stack<>();
		// push() it will add element on top of the stack
		msg.push("Msg from: John");
		msg.push("Msg from: Alex");
		msg.push("Msg from: Abc");
		
		// pop() it will get first element from the top of the stack
		System.out.println(msg.pop()); // Msg from: Abc
		System.out.println("---------");
		
		String readingMsg = msg.pop();
		System.out.println(readingMsg); // Msg from: Alex
		System.out.println("---------");
		
		readingMsg = msg.pop();
		System.out.println(readingMsg); // Msg from: John
		System.out.println("---------");
		
		// Exception stack is Empty
//		readingMsg = msg.pop();
//		System.out.println(readingMsg); // Msg from: John
//		System.out.println("---------");
	}
}
