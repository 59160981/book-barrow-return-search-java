
public class Book {
	private String bookID;
	private String title;
	private String author;
	private char status;

	public Book(String bookID, String title, String author, char status) {
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.status = status;
	}

	public String getBookID() {
		return bookID;
	}

	public char getStatus() {
		return status;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	public void updateStatus() {
		if(getStatus() == 'A') {
			status = 'U';
		}else {
			status = 'A';
		}
	}

	public String checkStatus() {
		if(getStatus() == 'A') {
			return "Avaiable";
		}else {
			return "Unavaiable";
		}
	}

	public String toString() {
		return "ID : " + getBookID() + " | Title : " + getTitle() + " | Author : " + getAuthor() + " | Status : " + checkStatus();
	}


}
