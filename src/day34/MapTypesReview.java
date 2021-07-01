package day34;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTypesReview {
	public static void main(String[] args) {
		// HashMap 
		// HashMap does not follow insertion order
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(3, "three");
		hashMap.put(2, "two");
		System.out.println(hashMap);
		
		// Hashtable
		Map<Integer, String> hashTable = new Hashtable();
		hashTable.put(1, "one");
		hashTable.put(3, "three");
		hashTable.put(2, "two");
		System.out.println(hashTable);
		
		// What's the difference between HashMap and Hashtable?
		// 1. HashMap can have 1 null key and multiple null values
		//    Hashtable cannot have null keys and null values
		// 2. HashMap is not synchronized(not thead safe) but Hashtable is synchronized(it is thread safe).
		
				
		// LinkedHashMap will maintain insertion order
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(1, "one");
		linkedHashMap.put(3, "three");
		linkedHashMap.put(2, "two");
		System.out.println(linkedHashMap);
		
		// TreeMap sorted implementation of map
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(10, "ten");
		treeMap.put(1, "one");
		treeMap.put(3, "three");
		treeMap.put(2, "two");
		System.out.println(treeMap);
	}
}
