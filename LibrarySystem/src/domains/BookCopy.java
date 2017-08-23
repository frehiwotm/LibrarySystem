package domains;

public class BookCopy {
	
	private String copyNum;
	private Book book;
	
	public BookCopy(String copyNum, Book book) {
		this.copyNum = copyNum;
		this.book = book;
	}
	
	public String getCopyNum() {
		return copyNum;
	}
	public void setCopyNum(String copyNum) {
		this.copyNum = copyNum;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	
	
}
