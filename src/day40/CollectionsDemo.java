package day40;

import java.util.*;

public class CollectionsDemo {
	public static void main(String[] args) {
		// List
		// Set
		// Map
		
		// Queue
		// Stack
		List<Integer> list = getList("old");
		
		for (int i = 0; i < 100; i++) {
			list.add(new Random().nextInt(1000));
		}
		
		// code...
		
		System.out.println(list);
	}
	
	public static List<Integer> getList(String scenario) {
		switch (scenario.toLowerCase()) {
		case "changes":
			return new LinkedList<>();
		case "static":
			return new ArrayList<>();
		case "old":
			return new Vector<>();
		default:
			System.out.println("Not supported");
			return null;
		}
	}
}
