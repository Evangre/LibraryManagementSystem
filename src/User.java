import java.util.ArrayList;
import java.util.List;

public class User {
    private String userID;
    private String name;
    private List<String> borrowedBooksList = new ArrayList<>();

    public User(String userID, String name) {
        this.userID = userID;
        this.name = name;

    }


    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getBorrowedBooks() {
        return borrowedBooksList;
    }

    public void setBorrowedBooks(List<String> borrowedBooks) {
        this.borrowedBooksList = borrowedBooks;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", name='" + name + '\'' +
                ", borrowedBooks=" + borrowedBooksList +
                '}';
    }

    public void borrowBook(String bookID) {
        borrowedBooksList.add(bookID);
    }

    public void returnBook(String bookID) {
        borrowedBooksList.remove(bookID);
    }
}