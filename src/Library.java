import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();

    public void addBook(String bookID, String title, String author) {
        Book book = new Book(bookID, title, author, "available");
        books.add(book);
    }

    public void addUser(String userID, String name) {
        User user = new User(userID, name);
        users.add(user);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library currently has no books");
            return;
        }

        System.out.println("Books in the library");
        for (Book book : books) {
            System.out.println(book);
        }
    }


    public void borrowBook(String userID, String bookID) {
        Book bookToBorrow = findBookById(bookID);
        User userBorrowing = findUserById(userID);

        if (bookToBorrow != null && userBorrowing != null && bookToBorrow.getStatus().equalsIgnoreCase("available")) {
            //Mark the book as borrowed
            bookToBorrow.setStatus("borrowed");

            //Add the book ID to the user's borrowedBooks list
            userBorrowing.borrowBook(bookID);
        } else System.out.println("Cannot borrow the book. Either the book is unavailable or the user does not exist");
    }

    public void returnBook(String userID, String bookID) {
        Book bookToReturn = findBookById(bookID);
        User userReturning = findUserById(userID);

        if (bookToReturn != null && userReturning != null && bookToReturn.getStatus().equalsIgnoreCase("borrowed") && userReturning.getBorrowedBooks().contains(bookID)) {
            //Mark the book as avaliable
            bookToReturn.setStatus("avaliable");

            //Remove the book ID from the user's borrowedBooks list
            userReturning.returnBook(bookID);
        } else
            System.out.println("Cannot return the book. Either the book wasn't borrowed by this user, or there's an issue with user/book data");

    }

    private Book findBookById(String bookID) {
        for (Book book : books) {
            if (book.getBookID().equals(bookID)) {
                return book;
            }
        }
        return null;
    }

    private User findUserById(String userID) {
        for (User user : users) {
            if (user.getUserID().equals(userID)) {
                return user;
            }
        }
        return null;
    }

}
