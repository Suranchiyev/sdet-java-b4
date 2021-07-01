package day35;

public class LinkedList2 {
	// add
	// remove	
	private Node head;
	
	public void add(int value) {
		// if head is null
		if (head == null) {
			head = new Node(value);
			return;
		}
		
		Node copyHead = head;
		while (copyHead.next != null) {
			copyHead = copyHead.next;
		}
		
		copyHead.next = new Node(value);
	}
	
	public void remove(int value) {
		// if value if head
		if (head.value == value) {
			head = head.next;
			return;
		}
		
		Node nodeToRem = head;
		Node prevNode = nodeToRem;
		
		while (nodeToRem != null) {
			if (nodeToRem.value == value) {
				prevNode.next = nodeToRem.next;
				break;
			}
			
			prevNode = nodeToRem;
			nodeToRem = nodeToRem.next;
		}		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		
		Node copyOfHead = head;
		while (copyOfHead != null) {
			sb.append(copyOfHead.value);
			sb.append(", ");
			copyOfHead = copyOfHead.next;
		}
		
		return sb.toString().substring(0, sb.length() - 2) + "]";
	}
}
