package day30;

import java.util.ArrayList;
import java.util.List;

public class WarmUp {
	public static void main(String[] args) {
		List<String> books = new ArrayList<>();
		books.add("OCA Java");
		books.add("OCP Java"); 
		books.add("Algorithms in Java");
		books.add("Java Head First");
		books.add("Clean Code");
				
		System.out.println(books);
		System.out.println("Number of element in the list: " + books.size());
		
		// TODO loop over the list books and print each element in the new line
		for (String str : books) {
			System.out.println(str);
		}
		System.out.println("-------");
		
		for (int i = 0; i < books.size(); i++) {
			String str = books.get(i);
			System.out.println(str);
		}
		System.out.println("-------");
		
		// TODO print each element of books list from the back
		for (int i = books.size() - 1; i >= 0; i--) {
			System.out.println(books.get(i));
		}
		System.out.println("-------");
		System.out.println(books);
		// TODO replace each element of list to lower case version 
		// set(index, newValue) - it will set new value for specific element
		for (int i = 0; i < books.size(); i++) {
			books.set(i, books.get(i).toLowerCase());		
		}
		System.out.println(books);
		System.out.println("-------");
		
		String[] arr = new String[3];
		System.out.println(arr);
		
		System.out.println(books);
	}
}







