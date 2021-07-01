package day35;

public class HashTable {
	private static final int HASH_MAX = 10;
	
	private Node2[] hashTable = new Node2[HASH_MAX];
	
	private int hash(String str) {
		int hashCode = 0;
		
		for (int i = 0; i < str.length(); i++) {
			hashCode += str.charAt(i);
		}
		return hashCode % HASH_MAX;
	}
	
	public void put(String key, int value) {
		int index = hash(key);
		
		if (hashTable[index] == null) {
			hashTable[index] = new Node2(key, value);
		} else {
			Node2 node = new Node2(key, value);
			node.next = hashTable[index];
			hashTable[index] = node;
		}
	}
	
	public int get(String key) {
		int index = hash(key);
		Node2 head = hashTable[index];
		do {
			if (head.key.equals(key)) {
				return head.value;
			}
			
			head = head.next;
		} while(head != null);
		
		return -1;
	}
}
