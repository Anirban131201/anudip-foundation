public class Calculator {

    // Method to add two integers
    int add(int a, int b) {
        System.out.println("The sum of " + a + " and " + b + " is:");
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        System.out.println("\nThe sum of " + a + ", " + b + " and " + c + " is:");
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        System.out.println("\nThe sum of " + a + " and " + b + " is:");
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Calling overloaded methods and printing results
        System.out.println(calculator.add(4, 5));
        System.out.println(calculator.add(8, 34, 24));
        System.out.println(calculator.add(45.67, 89.83));
    }
}
