package day35;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList2 list = new LinkedList2();
		list.add(55);
		list.add(35);
		list.add(17);
		list.add(9);
		list.add(100);
		
		System.out.println(list);
		list.remove(17);
		
		System.out.println(list);
		
		List<Integer> l = new LinkedList<>();
	}
}
