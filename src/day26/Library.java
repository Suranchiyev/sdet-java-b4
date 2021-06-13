package day26;


public class Library {
	public static void main(String[] args) {
		Book[] books = {
				new Book("OCA", "Boyarsky", 400), 
				new Book("OCP", "Boyarsky", 600),
				new Book("Java 101", "Savitch", 650),
				new Book("Algorithms", "John Doe", 800),
				new Book("OCM", "Boyarsky", 750)
				};
		
		for (Book b : books) {
			System.out.println(b.title);
		}
		
		System.out.println("--------");
		
		System.out.println(books[2].author); // Savitch
		System.out.println("--------");
		
		// TODO Can you print book's title of author Boyarsky only from books array
		for (Book book : books) {
			if (book.author.equals("Boyarsky")) {
				System.out.println(book.title);
			}
		}
		System.out.println("--------");
		
		for (int i = 0; i < books.length; i++) {
			if (books[i].author.equals("Boyarsky")) {
				System.out.println(books[i].title);
			}
		}
		// What's the difference between == and .equals?
		// == will check if two references pointing into the same object or not
		// equals will check actual value of two strings on equality
		
		System.out.println("-------");
		
		
		int totalPagesToRead = 0;
		
		// TODO find out number of total pages from array books
		
//		for (int i = 0; i < books.length; i++) {
//			totalPagesToRead += books[i].pages;
//		}
		
		for (Book myBook : books) {
			totalPagesToRead += myBook.pages;
		}
		
		System.out.println("Total number of pages to read for me is " + totalPagesToRead);
		
		
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