package day30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListOfCustomers {
	public static void main(String[] args) {
		// Alex 
		// Azamat
		// Bek
		// Kuba
		
		List<String> list = Arrays.asList("Alex", "Azamat", "Bek", "Kuba", "Adriana");
		
		// create copy of list
		List<String> copyOfList = new ArrayList<>(list);

		// sorting 
		Collections.sort(copyOfList);
		
		// compare
		if (list.equals(copyOfList)) {
			System.out.println("List of customers is sorted correctly");
		} else {
			System.out.println("List of customers is not sorted correctly");
		}
		
		System.out.println(list);
		System.out.println(copyOfList);
		
		// is list sorted? or not
		// we can sort and compare with original one
		// if they are same -> original one was sorted
		// if they are not same -> original one was not sorted
		
		// Sorting with array
		String[] customers = {"Alex", "Azamat", "Bek", "Kuba", "Adriana"};
		Arrays.sort(customers);
	}
}
