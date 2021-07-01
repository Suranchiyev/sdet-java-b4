package day35;

import java.util.Arrays;

// 1. Underlining data structure - array
// 2. Hash function
// 3. Collisions

public class HashTableDemo {
	public static final int HASH_MAX = 10;
	
	public static void main(String[] args) {
		
		String[] hashTable = new String[HASH_MAX];
		
		// data itself will decide where we should put it 
		// and from where we can find in the future
		
		int index = hash("John");
		System.out.println("hash code from John: " + index);
		hashTable[index] = "John";
		
		System.out.println(hashTable[hash("John")]);
		
		index = hash("Alex");
		hashTable[index] = "Alex";
		
		System.out.println(Arrays.toString(hashTable));
		
		System.out.println("--------");
		hashTable[hash("Bob")] = "Bob";
		hashTable[hash("Smith")] = "Smith";
		hashTable[hash("James")] = "James";
		hashTable[hash("Sophia")] = "Sophia";
		System.out.println(Arrays.toString(hashTable));
		
		String str = "James";
		if (hashTable[hash(str)] != null && hashTable[hash(str)].equals(str)) {
			System.out.println(str + " is here");
		} else {
			System.out.println(str + " is not here");
		}
		System.out.println("---------");
		
		index = hash("Kuzzat");
		System.out.println("Kuzzat hascode: " + index);
		hashTable[index] = "Kuzzat";
		System.out.println(Arrays.toString(hashTable));
	}
	
	public static int hash(String str) {
		int hashCode = 0;
		
		for (int i = 0; i < str.length(); i++) {
			hashCode += str.charAt(i);
		}
		return hashCode % HASH_MAX;
	}
	
}
