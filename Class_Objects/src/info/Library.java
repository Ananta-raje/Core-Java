package info;


public class Library {
	int libraryId;
	String libraryName;
	String location;
	String librarianName;
	int totalBooks;
	int availableBooks;
	int issuedBooks;
	double membershipFee;
	String openingTime;
	boolean isOpen;

	void displayDetails() {
		System.out.println("LibraryId is: " + libraryId);
		System.out.println("LibraryName is: " + librarianName);
		System.out.println("Location is: " + location);
		System.out.println("LibrarianName is: " + librarianName);
		System.out.println("Total books are: " + totalBooks);
		System.out.println("Available books are: " + availableBooks);
		System.out.println("Issued books: " + issuedBooks);
		System.out.println("Membership Fee: " + membershipFee);
		System.out.println("Opening Time: " + openingTime);
		System.out.println("Library Open: " + isOpen);
	}

	void issueBook() {
		if (isOpen && availableBooks > 0) {
			availableBooks--;
			issuedBooks++;
			System.out.println("Book issue sucessfully !!");
		} else {
			System.out.println("Book cannot be issued.");
		}
	}

	void returnBook() {
		if (isOpen && issuedBooks > 0) {
			availableBooks++;
			issuedBooks--;
			System.out.println("Book return sucessfully!!");
		} else {
			System.out.println("Book not return yet!!");
		}
	}

	void addBooks(int count) {
		if (count > 0) {
			totalBooks += count;
			availableBooks += count;
			System.out.println(count + " books added sucessfully");
		}else {
			System.out.println("Please enter a valid numaber of books");
		}
	}
	
	void checkAvailabilty() {
		System.out.println("Available books are: " + availableBooks);
	}

}
