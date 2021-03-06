package domains;

import java.util.List;

public class Author extends Person{
	
	private String credential;
	private List<Book> books;
		
	public Author(String fName, String lName, String phone, Book book) {
		super(fName, lName, phone);
		addBook(book);

	}

	public String getCredential() {
		return credential;
	}

	public void setCredential(String credential) {
		this.credential = credential;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBook(List<Book> books) {
		this.books = books;
	}
	
	public void addBook(Book book) {
		this.books.add(book);
	}
	
	public void addAllBooks(List<Book> books) {
		this.books.addAll(books);
	}
}
 