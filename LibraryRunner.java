//Create a Runner class called LibraryRunner

//In main():

//Create String array with at least 3 book titles

//Create Book array with at least 3 objects

//Pass both arrays to the Library constructor

//Call the displayInfo() method

class LibraryRunner
{
    public static void main(String[] args)
    {
        String[] bookTitles = new String[2];
        bookTitles[0] = "Ramayana";
        bookTitles[1] = "Mahabharatha";

        Book[] books = new Book[2];
        books[0] = new Book("Ramayana", "Valmiki", 500);
        books[1] = new Book("Mahabharatha", "Vyasa", 600);

        Library library = new Library("City Library", "Mysore", 2, bookTitles, books);

        library.getdisplay();
    }
}

	