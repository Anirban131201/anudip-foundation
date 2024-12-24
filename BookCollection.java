import java.util.ArrayList;
import java.util.List;

// Class to represent a Book
class Book1 {
    private int bookId;          // Unique ID for the book
    private String bookName;     // Name of the book
    private String authorName;   // Name of the author

    // Parameterized constructor to initialize Book object
    public Book1(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Getters to access private fields
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    // Override toString() to provide a meaningful string representation of a Book object
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookName + ", Author Name: " + authorName;
    }
}

public class BookCollection {
    public static void main(String[] args) {
        // Create an ArrayList to store Book objects
        List<Book1> bookList = new ArrayList<>();

        // Add Book objects to the ArrayList
        bookList.add(new Book1(1, "Book 1", "Author 1"));
        bookList.add(new Book1(2, "Book 2", "Author 2"));
        bookList.add(new Book1(3, "Book 3", "Author 3"));

        // Display all book details using an enhanced for loop
        System.out.println("Book Collection:");
        for (Book1 book : bookList) {
            System.out.println(book); // Calls the overridden toString() method of Book1 class
        }
    }
}
