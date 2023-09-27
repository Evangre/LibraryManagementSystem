public class Main {

    public static void main(String[] args) {

        //Create library instance
        Library library = new Library();

        //Add books to the library
        library.addBook("001", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
        library.addBook("002", "Lord of the Rings", "J.R.R. Tolkien");

        //Add users
        library.addUser("u001", "Evan");
        library.addUser("u001", "Nate");

        //Display books
        library.displayBooks();

        //Borrow a book
        System.out.println("\nEvan tries to borrow Harry Potter:");
        library.borrowBook("u001", "001");
        library.displayBooks();

        //Return a book
        System.out.println("\nEvan returns Harry Potter:");
        library.returnBook("u001", "001");
        library.displayBooks();

        // Some more scenarios for testing
        System.out.println("\nNate tries to return Harry Potter (he didn't borrow it):");
        library.returnBook("u002", "001");  // Should show an error message since Bob didn't borrow the book

        System.out.println("\nEvan tries to borrow Harry Potter again:");
        library.borrowBook("u001", "001");
        library.displayBooks();  // Should reflect that the book is borrowed again
    }
}
