// Define the interface with a default string value
interface Sample {
    String s = "This is ";
}

// Implement the interface in the class
public class InterfaceExample implements Sample {
    
    // Method to display a message
    public void display() {
        System.out.println("an interface sample.");
    }

    public static void main(String[] args) {
        // Create an instance of the class
        InterfaceExample example = new InterfaceExample();
        
        // Print the string from the interface and call the display method
        System.out.print(example.s);
        example.display();
    }
}
