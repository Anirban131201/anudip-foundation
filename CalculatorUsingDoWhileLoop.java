import java.util.Scanner;

public class CalculatorUsingDoWhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, a, b;

        // Display the menu of operations
        System.out.println("Enter a number from the below list to perform a certain mathematical operation or exit the loop:\n");
        System.out.println("Press 1 to perform Addition");
        System.out.println("Press 2 to perform Subtraction");
        System.out.println("Press 3 to perform Multiplication");
        System.out.println("Press 4 to perform Division");
        System.out.println("Press 5 to EXIT");

        // Start the do-while loop for continuous operation until exit
        do {
            // Prompt user for input
            System.out.print("\nEnter a number: ");
            num = sc.nextInt();

            if (num >= 1 && num <= 5) {
                // Perform the operation based on user's choice
                switch (num) {
                    case 1:
                        System.out.print("Enter the first and second number (separated by space): ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("The addition of " + a + " and " + b + " is " + (a + b));
                        break;
                    case 2:
                        System.out.print("Enter the first and second number (separated by space): ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("The subtraction of " + a + " and " + b + " is " + (a - b));
                        break;
                    case 3:
                        System.out.print("Enter the first and second number (separated by space): ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("The multiplication of " + a + " and " + b + " is " + (a * b));
                        break;
                    case 4:
                        System.out.print("Enter the first and second number (separated by space): ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        // Handle division by zero
                        if (b != 0) {
                            System.out.println("The division of " + a + " by " + b + " is " + (a / (double) b));
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    default:
                        System.out.println("You have exited the loop.");
                }
            } else {
                // Invalid input handling
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                num = 0;
            }
        } while (num != 5); // Continue the loop until user exits

        // Close the scanner
        sc.close();
    }
}
