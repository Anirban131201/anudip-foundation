import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    // Constructor to initialize Person properties
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Method to get the full name of the person
    public String fullName() {
        return firstName + " " + lastName;
    }

    // Method to display person details
    public void displayDetails() {
    	System.out.println();
        System.out.println("The name of the person is " + fullName());
        System.out.println("The age of the person is " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter the last name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        // Create a Person object with user input
        Person p = new Person(firstName, lastName, age);

        // Display the person's details
        p.displayDetails();

        sc.close();
    }
}
