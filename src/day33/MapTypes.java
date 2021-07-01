package day33;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTypes {
	public static void main(String[] args) {
		// HashMap does not maintain insertion order (any order)
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(4, "four");
		hashMap.put(3, "three");
		hashMap.put(1, "one");
		hashMap.put(2, "two");
		hashMap.put(0, "zero");
		System.out.println(hashMap);
		
		// Hashtable is older version of HashMap
		// 1. HashMap is not synchronized (not thread safe)
		//    Hashtable is synchronized (thread safe)
		// 2. HashMap allows one null key and multiple null values
		//    Hashtable does not allow any null keys and values
		
		Map<Integer, String> hashtable = new Hashtable();
		hashtable.put(4, "four");
		hashtable.put(3, "three");
		hashtable.put(1, "one");
		hashtable.put(2, "two");
		hashtable.put(0, "zero");
		
		// NullPointerException here
		// hashtable.put(null, "Null value"); 
		// hashtable.put(7, null);
		System.out.println(hashtable);
		
		
		// LinkedHashMap, it will keep insertion order
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(4, "four");
		linkedHashMap.put(3, "three");
		linkedHashMap.put(1, "one");
		linkedHashMap.put(2, "two");
		linkedHashMap.put(0, "zero");
		System.out.println(linkedHashMap);
		
		
		// TreeMap, it's sorted by keys implementation of map 
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(4, "four");
		treeMap.put(3, "three");
		treeMap.put(1, "one");
		treeMap.put(2, "two");
		treeMap.put(0, "zero");
		System.out.println(treeMap);
	}
}
