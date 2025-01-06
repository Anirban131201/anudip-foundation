package myMavenProjectPackage3;

// A utility class for simple mathematical operations
public class SimpleMathematicalOperation {
    
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Method to subtract one integer from another
    public static int sub(int a, int b) {
        return a - b;
    }
    
    // Method to multiply two integers
    public static int mul(int a, int b) {
        return a * b;
    }
    
    // Method to divide one double by another
    public static double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // Main method to demonstrate the usage of mathematical operations
    public static void main(String[] args) {
        // Perform and display the results of various mathematical operations
        System.out.println("The addition of 5 and 3 is " + add(5, 3));          
        System.out.println("The subtraction of 67 and 18 is " + sub(67, 18));   
        System.out.println("The multiplication of 13 and 12 is " + mul(13, 12));
        System.out.println("The division of 9 and 4.5 is " + div(9, 4.5));      
    }
}
