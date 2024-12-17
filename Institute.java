// Institute class demonstrating encapsulation
public class Institute {
    // Private fields
    private String name;
    private String address;
    private int numberOfStudents;

    // Public constructor
    public Institute(String name, String address, int numberOfStudents) {
        this.name = name;
        this.address = address;
        this.numberOfStudents = numberOfStudents;
    }

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for address
    public String getAddress() {
        return address;
    }

    // Public setter method for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Public getter method for number of students
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    // Public setter method for number of students
    public void setNumberOfStudents(int numberOfStudents) {
        if (numberOfStudents >= 0) {
            this.numberOfStudents = numberOfStudents;
        } else {
            System.out.println("Number of students cannot be negative.");
        }
    }

    // Method to display Institute details
    public void displayDetails() {
        System.out.println("Institute Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Number of Students: " + numberOfStudents);
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Create an object of Institute
        Institute institute = new Institute("Avanthi institute of engineering and technology", "Majidpur, Hyderabad", 1000);

        // Display initial details
        institute.displayDetails();
    }
}
