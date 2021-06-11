package day25;

import java.util.Arrays;

public class Library {
	public static void main(String[] args) {
		Book[] books = {
				new Book("OCA", "Boyarsky", 400), 
				new Book("OCP", "Boyarsky", 600),
				new Book("Java 101", "Savitch", 650),
				new Book("Algorithms", "John Doe", 800)
				};
		
		// TODO print all the book titles from books array
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].title);
		}
		System.out.println("-----");
		// TODO print authors from books array by using for each loop
		for (Book result : books) {
			System.out.println(result.author);
		}
	}
}

class Book {
	public String title;
	public String author;
	public int pages;
	
	public Book() {
		
	}
	
	public Book(String title, String author, int pages) {
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
}
