package domains;

import java.util.List;

public class Book {
	private String isbn;
	private String title;
	private String maxCheckoutLenght;
	private List<Author> authors;
	private List<BookCopy> bookCopies;
	
	public Book(String isbn, String title, String maxCheckoutLenght, Author author, BookCopy bookCopies) {
		this.isbn = isbn;
		this.title = title;
		this.maxCheckoutLenght = maxCheckoutLenght;
		addBookCopy(bookCopies);
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMaxCheckoutLenght() {
		return maxCheckoutLenght;
	}

	public void setMaxCheckoutLenght(String maxCheckoutLenght) {
		this.maxCheckoutLenght = maxCheckoutLenght;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(Author author) {
		this.authors.add(author);
	}
	
	public void addAllAuthor(List<Author> authors) {
		this.authors.addAll(authors);
	}
	
	public void addBookCopy(BookCopy bookCopy) {
		this.bookCopies.add(bookCopy);
	}
	
	public void addAllBookCopy(List<BookCopy> bookCopies) {
		this.bookCopies.addAll(bookCopies);
	}

	public List<BookCopy> getBookCopies() {
		return bookCopies;
	}

	public void setBookCopies(List<BookCopy> bookCopies) {
		this.bookCopies = bookCopies;
	}
}
