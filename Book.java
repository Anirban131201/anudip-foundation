import java.util.Scanner;

public class Book {

    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        title = "Untitled";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a book using the default constructor
        Book b1 = new Book();

        // Prompt the user for book details
        System.out.print("Enter the title of the book: ");
        String title = sc.nextLine();

        System.out.print("Enter the author of the book: ");
        String author = sc.nextLine();

        System.out.print("Enter the price of the book: ");
        double price = sc.nextDouble();

        // Create a book using the parameterized constructor
        Book b2 = new Book(title, author, price);

        // Display details of both books
        System.out.println("Details of the book 1 are:");
        b1.display();
        
        System.out.println("Details of the book 2 are:");
        b2.display();

        sc.close();
    }
}
