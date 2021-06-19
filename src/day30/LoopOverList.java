package day30;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class LoopOverList {
	public static void main(String[] args) {
		List<String> customers = new ArrayList<>();
		customers.add("Oliver");
		customers.add("William");
		customers.add("James");
		customers.add("Anna");
		customers.add("John");
		
		// Loop over the list
		// Iterate over the list
		
		// 1. Loop throw with regular for loop
		for (int i = 0; i < customers.size(); i++) {
			System.out.print(customers.get(i) + " ");
		}
		System.out.println();
		
		// [Oliver, William, James, Anna, John] 
		// 2. By using for each loop
		for (String customer : customers) {
			System.out.print(customer + " ");
		}
		System.out.println();
		
		//                                  |     
		// [Oliver, William, James, Anna, John] 
		// 3. By using Iterator(does not work for array)
		Iterator<String> iterator = customers.iterator();
		
		System.out.println("Iterator:");
		while (iterator.hasNext()) {
			String el = iterator.next();
			System.out.print(el + " ");
			
			if (el.startsWith("J")) {
				iterator.remove();
			}
		}
		System.out.println();
		System.out.println(customers);
		
		
		// 4. By using forEach method (functional java - Lambda)
		customers.forEach(element -> {
			System.out.print(element + " ");
		});
		System.out.println();
	}
}
