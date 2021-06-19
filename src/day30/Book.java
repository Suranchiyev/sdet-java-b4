package day30;

public class Book {
	public String title;
	public String author;
	public int pages;
	public Rating rating;
	
	public Book() {
		
	}
	
	public Book(String title, String author, int pages, Rating rating) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.rating = rating;
	}
	
	public void printDetails() {
		System.out.println("title: " + title);
		System.out.println("author: " + author);
		System.out.println("pages: " + pages);
		System.out.println("rating: " + rating);
	}
}
