package day31;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class WarmUp {
	public static void main(String[] args) {
		// What's the difference between Array and ArrayList?
		// 1. Array is fixed size, and ArrayList is dynamic sized collections
		// 2. Array can be primitives and objects but ArrayList can hold only objects
		
		// Arrays is a helper class for all arrays
		// Collections is a helper class for collection framework(ArrayList is part of it) 
		
		// ArrayList internally based on array. 
		// When we create default ArrayList, it will create array with size 10
		// When we keep adding elements and array will be full then ArrayList will
		// increase the size of internal array by %50. 
		
		List<Integer> listN = new ArrayList<>();
		listN.add(88);
		listN.add(54);
		listN.add(34);
		listN.add(66);
		listN.add(99);
		listN.add(88);
		listN.add(54);
		listN.add(34);
		listN.add(66);
		listN.add(99);
		listN.add(99);
		
		Iterator<Integer> iterator = listN.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
