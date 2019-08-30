import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
//		object book & library
		Book[] book = new Book[5];
		book[0] = new Book("100", "Programming", "John", 'A');
		book[1] = new Book("200", "Object-Oriented Programming", "May", 'A');
		book[2] = new Book("300", "Graphic", "Mary", 'A');
		book[3] = new Book("400", "Statistics", "Martin", 'A');
		book[4] = new Book("500", "Database", "John", 'A');
		Library library = new Library(book);
		
//		optional value
		Scanner kbip = new Scanner(System.in);
		String input;
		char select;
		
		library.showAllBook();
		
//		loop
		while(true) {
			System.out.println("<=== Enter the number what do you want to do ===>");
			System.out.println("1. Borrow a book.");
			System.out.println("2. Return a book.");
			System.out.println("3. Search a book.");
			System.out.println("q. Quit the system.");
			System.out.print("Select = ");
			select = kbip.next().charAt(0);
			if(select == '1') {
				System.out.print("Enter [id/title] of book : ");
				input = kbip.next();
				library.borrowBook(input);
			}
			else if(select == '2'){
				System.out.print("Enter [id/title] of book : ");
				input = kbip.next();
				library.returnBook(input);
			}
			else if(select == '3'){
				System.out.print("Enter [id/title] of book : ");
				input = kbip.next();
				library.searchBook(input);
			}
			else if(select == 'q'){
				System.out.println("Thank You!!");
				System.exit(0);
			}else {
				System.out.println("Input invalid, try again!!");
			}
		}
		
	}

}
