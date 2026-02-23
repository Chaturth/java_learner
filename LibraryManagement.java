import java.util.*;

class Book {

    String bookName;
    int bookId;
    String author;
    boolean isIssued;

    Book(String bookName, int bookId, String author) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.author = author;
        this.isIssued = false;
    }
}

public class LibraryManagement {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n1. ADD BOOK");
            System.out.println("2. DISPLAY BOOK");
            System.out.println("3. ISSUE BOOK");
            System.out.println("4. RETURN BOOK");
            System.out.println("5. EXIT");

            int choice = sc.nextInt();

            switch(choice) {

               case 1:
    sc.nextLine(); 
    System.out.print("Enter Book Name: ");
    String bookName = sc.nextLine();
    System.out.print("Enter Book ID: ");
    int bookId = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter Author: ");
    String author = sc.nextLine();

    Book b = new Book(bookName, bookId, author);
    books.add(b);
    System.out.println("Book Added Successfully!");
    break;

case 2:
    if(books.isEmpty()) {
        System.out.println("No books in the library!");
    } else {
        System.out.println("\nBooks in Library:");
        for(Book book : books) {
            System.out.println("Book ID: " + book.bookId + ", Name: " + book.bookName + ", Author: " + book.author + ", Issued: " + book.isIssued);
        }
    }
    break;

case 3:
    System.out.print("Enter Book ID to issue: ");
    int issueId = sc.nextInt();
    boolean found = false;

    for (Book book : books) {
        if (book.bookId == issueId) {
            found = true;
            if (!book.isIssued) {
                book.isIssued = true;
                System.out.println("Book '" + book.bookName + "' issued successfully!");
            } else {
                System.out.println("Sorry, this book is already issued.");
            }
            break;
        }
    }
    if (!found) System.out.println("Book ID not found!");
    break;

case 4:
    System.out.print("Enter Book ID to return: ");
    int returnId = sc.nextInt();
    boolean foundReturn = false;

    for (Book book : books) {
        if (book.bookId == returnId) {
            foundReturn = true;
            if (book.isIssued) {
                book.isIssued = false;
                System.out.println("Book '" + book.bookName + "' returned successfully!");
            } else {
                System.out.println("This book was not issued.");
            }
            break;
        }
    }
    if (!foundReturn) System.out.println("Book ID not found!");
    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}	
	

	
		
	
	
