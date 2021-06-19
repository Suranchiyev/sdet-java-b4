package day30;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class BookDemo {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		Book b = new Book("7 Habits of Highly Effective People", "R. Covey", 350, Rating.Excellent);		
		bookList.add(b);
		
		bookList.add(new Book("The 10X Rule", "G. Cardone", 250, Rating.Good));
		bookList.add(new Book("Educated", "T. Westover", 350, Rating.Good));
		bookList.add(new Book("The Black Swan", "N. Taleb", 480, Rating.Excellent));
		
		System.out.println(bookList);
		System.out.println(bookList.get(0));
		
		Book firstBook = bookList.get(0);
		System.out.println("Title: " + firstBook.title);
		System.out.println("Author: " + firstBook.author);
		System.out.println("Pages: " + firstBook.pages);
		System.out.println("Rating: " + firstBook.rating);
		System.out.println("======");
		
		// TODO print each book's title from the bookList
		for (Book book : bookList) {
			System.out.println(book.title);
		}
		
		System.out.println("======");
		// TODO can you do it with Iterator?
		Iterator<Book> iterator = bookList.iterator();
		while(iterator.hasNext()) {			
			System.out.println(iterator.next().title);
		}
		
		System.out.println("=== PRINT DETAILS ===");
		for (Book book : bookList) {
			book.printDetails();
			System.out.println("======");
		}
		System.out.println("======================");
		
		Book myBook = new Book("Java 101", "John", 500, Rating.Bad);
		myBook.printDetails();
			
		Book myBook2 = new Book();
		myBook2.printDetails();
	
	}
}













