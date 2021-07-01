package day34;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
	public static void main(String[] args) {
		// Queue is FIFO data structure
		// FIFO - First In, First Out
		
		// Queue has two implementations in Java
		// 1. LinkedList
		// 2. PriorityQueue
		
		// queue in our store
		Queue<String> q = new LinkedList<>();
		// Adding elements to the queue
		q.add("Alex");
		q.add("Misha");
		q.add("Boris");
		q.add("Aslan");
		
		System.out.println("Customers in the line: " + q);
		
		// poll()
		// It will get the first element in the queue and it will remove it from the queue
		String customer = q.poll();
		System.out.println("Currently working with customer: " + customer);
		System.out.println("Still waiting customers in the line: " + q);
		System.out.println("------");
		
		customer = q.poll();
		System.out.println("working with customer: " + customer); // Misha
		System.out.println("Still waiting customers in the line: " + q);
		System.out.println("------");
		
		customer = q.poll();
		System.out.println("working with customer: " + customer); // Boris
		System.out.println("Still waiting customers in the line: " + q);
		System.out.println("------");
		
		q.add("John");
		System.out.println(q);	
	}
}
