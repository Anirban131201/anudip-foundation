// Class representing a student
class Student2 {
    // Private fields to encapsulate data
    private String name;
    private int age;
    private String department;

    // Default constructor
    public Student2() {
        this.name = "Unknown";
        this.age = 20;
        this.department = "Unassigned";
    }

    // Constructor with two parameters (name and age)
    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT"; // Default department set to "IT"
    }

    // Constructor with three parameters (name, age, and department)
    public Student2(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Method to display the student's information
    public void displayInfo() { 
        System.out.println("Name: " + name); 
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println();
    }
}

// Main class to demonstrate the Student2 class
public class MainStudent {
    public static void main(String[] args) {
        // Creating student objects using different constructors
        Student2 student1 = new Student2(); // Default constructor
        Student2 student2 = new Student2("Summanth", 24); // Constructor with name and age
        Student2 student3 = new Student2("Akhil", 22, "MCA"); // Constructor with all parameters

        // Displaying the information of each student
        System.out.println("Student 1:");
        student1.displayInfo();
        
        System.out.println("Student 2:");
        student2.displayInfo();
        
        System.out.println("Student 3:");
        student3.displayInfo();
    }
}
