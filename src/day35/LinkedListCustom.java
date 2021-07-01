package day35;

public class LinkedListCustom {
	public static void main(String[] args) {
		Node head = new Node(1);
		System.out.println(head.value);
		System.out.println(head.next);
		
		Node secondNode = new Node(2);
		
		head.next = secondNode;
		
		head.next.next = new Node(3);
		
		head.next.next.next = new Node(4);
		
		// print all elements
		Node copyOfHead = head;
		while(copyOfHead != null) {
			System.out.print(copyOfHead.value + " ");			
			copyOfHead = copyOfHead.next;
		}
		System.out.println();
		
		// copyOfHead.next = new Node(8);
		// add node to the front of the list
		Node n = new Node(5);
		n.next = head;
		head = n;
		
		// print all elements
		copyOfHead = head;
		while(copyOfHead != null) {
			System.out.print(copyOfHead.value + " ");			
			copyOfHead = copyOfHead.next;
		}
		System.out.println();
		
		// add new node to the back of the list
		copyOfHead = head;
		while(copyOfHead.next != null) {
			copyOfHead = copyOfHead.next;
		}
		copyOfHead.next = new Node(8);
		
		// print elemnts
		copyOfHead = head;
		while(copyOfHead != null) {
			System.out.print(copyOfHead.value + " ");			
			copyOfHead = copyOfHead.next;
		}
		
		System.out.println();
		
		// Break till 10:14 AM EST
 	}
}
