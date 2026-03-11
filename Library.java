//Step 1: Instance Variables

//Declare the following instance variables:

//String libraryName

//String location

//int totalBooks

//String[] bookTitles → (array of primitive/String type)

//Book[] books → (array of your own class)

class Library
{
    String libraryName;
    String location;
    int totalBooks;
    String[] bookTitles;

    Book[] books;

    Library(String libraryName, String location, int totalBooks, String[] bookTitles, Book[] books)
    {
        this.libraryName = libraryName;
        this.location = location;
        this.totalBooks = totalBooks;
        this.bookTitles = bookTitles;
        this.books = books;
    }

    void getdisplay()
    {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Location: " + location);
        System.out.println("Total Books: " + totalBooks);

        System.out.println("Book Titles:");
        for(String b1 : bookTitles)
        {
            System.out.println(b1);
        }

        System.out.println("Book Details:");
        for(Book b2 : books)
        {
            if(b2 != null)
            {
                System.out.println("Title: " + b2.title);
                System.out.println("Author: " + b2.author);
                System.out.println("Price: " + b2.price);
            }
        }
    }
}

			
