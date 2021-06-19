package day30;

import java.util.ArrayList;
import java.util.List;

public class BookDemo2 {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();	
		bookList.add(new Book("7 Habits of Highly Effective People", "R. Covey", 350, Rating.Excellent));
		bookList.add(new Book("The 10X Rule", "G. Cardone", 250, Rating.Good));
		bookList.add(new Book("Educated", "T. Westover", 350, Rating.Good));
		bookList.add(new Book("The Black Swan", "N. Taleb", 480, Rating.Excellent));
		
		int totalPagesToRead = 0;
		//TODO find out the total number of pages from bookList
		
		for (Book book : bookList) {
			totalPagesToRead += book.pages;
		}		
		System.out.println("The total pages to read is " + totalPagesToRead);
	}
}
