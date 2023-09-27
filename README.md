# Library Management System (LMS)

A simple Java-based LMS to manage books and users, allowing users to borrow and return books.

## Features

- **Manage Books**: Add and remove books from the library.
- **Manage Users**: Add and remove users.
- **Borrow & Return Books**: Users can borrow and return books. The system keeps track of which user has borrowed which book.
- **Book Availability**: Check if a book is available before borrowing. If a book is currently borrowed, the system will notify you.
- **Display All Books**: View a list of all books in the library and their current status.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher

### Running the Application

1. Compile all the Java files:
   
   \```
   javac *.java
   \```

2. Run the main class (replace `MainClass` with your main class's name):

   \```
   java MainClass
   \```

## Usage

After starting the application:

1. **Add Books**:

   \```java
   library.addBook("001", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
   \```

2. **Add Users**:

   \```java
   library.addUser("u001", "Alice");
   \```

3. **Borrow Books**:

   \```java
   library.borrowBook("u001", "001");
   \```

4. **Return Books**:

   \```java
   library.returnBook("u001", "001");
   \```

5. **Display All Books in Library**:

   \```java
   library.displayBooks();
   \```

## Future Enhancements

- **Search Functionality**: Allow users to search for books by title or author.
- **Due Dates**: Implement due dates for borrowed books.
- **Fine System**: Implement a system to fine users for overdue books.
- **User Interface**: Develop a graphical user interface (GUI) to make the system more user-friendly.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is open source. Feel free to use, modify, and distribute as you see fit.
