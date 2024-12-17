import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for numbers
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // Consume the leftover newline from nextInt()
        sc.nextLine();

        // Input for operator
        System.out.print("Enter an operator to perform (+, -, *, /): ");
        String operator = sc.nextLine();

        // Switch case to perform operations
        switch (operator) {
            case "+":
                System.out.println("The addition of " + a + " and " + b + " is " + (a + b));
                break;
            case "-":
                System.out.println("The subtraction of " + a + " and " + b + " is " + (a - b));
                break;
            case "*":
                System.out.println("The multiplication of " + a + " and " + b + " is " + (a * b));
                break;
            case "/":
                if (b != 0) {
                    System.out.println("The division of " + a + " by " + b + " is " + (a / (double) b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");
        }

        sc.close();
    }
}

