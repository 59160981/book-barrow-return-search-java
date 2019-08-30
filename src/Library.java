
public class Library {
	private Book[] book;

	public Library(Book[] book) {
		this.book = book;
	}

	public void searchBook(String wantB) {
		boolean found = false;
		for (Book i : book) {
			if (i.getBookID().equals(wantB)) {
				found = true;
				System.out.println(i);
			} else if (i.getTitle().equals(wantB)) {
				found = true;
				System.out.println(i);
			}
		}
		if (found == false) {
			System.out.println("Sorry, this book cannot be found in our library.");
		}
	}

	public void borrowBook(String wantB) {
		boolean found = false;
		for (Book i : book) {
			if (i.getBookID().equals(wantB)) {
				found = true;
				if (i.getStatus() == 'A') {
					System.out.println("ID : " + i.getBookID() + " | Title : " + i.getTitle() + " | can borrow.");
					i.updateStatus();
				} else {
					System.out.println("ID : " + i.getBookID() + " | Title : " + i.getTitle() + " | cannot borrow.");
				}
			} else if (i.getTitle().equals(wantB)) {
				found = true;
				if (i.getStatus() == 'A') {
					System.out.println("ID : " + i.getBookID() + " | Title : " + i.getTitle() + " | can borrow.");
					i.updateStatus();
				} else {
					System.out.println("ID : " + i.getBookID() + " | Title : " + i.getTitle() + " | cannot borrow.");
				}
			}
		}
		if (found == false) {
			System.out.println("Sorry, this book cannot be found in our library.");
		}
	}

	public void returnBook(String wantB) {
		boolean found = false;
		for (Book i : book) {
			if (i.getBookID().equals(wantB)) {
				found = true;
				if (i.getStatus() == 'U') {
					System.out.println("ID : " + i.getBookID() + " | Title : " + i.getTitle() + " | Thank you, the return again!!!");
					i.updateStatus();
				} else {
					System.out.println("ID : " + i.getBookID() + " | Title : " + i.getTitle() + " | This book is not borrowed. Re-input again!!!");
				}
			} else if (i.getTitle().equals(wantB)) {
				found = true;
				if (i.getStatus() == 'U') {
					System.out.println("ID : " + i.getBookID() + " | Title : " + i.getTitle() + " | Thank you, the return again!!!");
					i.updateStatus();
				} else {
					System.out.println("ID : " + i.getBookID() + " | Title : " + i.getTitle() + " | This book is not borrowed. Re-input again!!!");
				}
			}
		}
		if (found == false) {
			System.out.println("Sorry, this book cannot be found in our library.");
		}
	}

	public void showAllBook() {
		System.out.println("These are all books in our library");
		for (Book i : book) {
			System.out.println(i.toString());
		}
	}

}
