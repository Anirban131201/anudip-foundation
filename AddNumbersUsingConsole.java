import java.io.Console;

/*
 
  This program demonstrates how to use the Console class to read input from the user, 
  perform addition on two numbers, and display the result.
  
 */
public class AddNumbersUsingConsole {
    public static void main(String[] args) {
        // Get the console instance to interact with the user
        Console console = System.console();
        
        // Check if the console is available
        if (console == null) {
            System.out.println("No console available.");
            return; // Exit the program if no console is available
        }

        // Prompt the user to enter the first number
        String firstNumberStr = console.readLine("Enter the first number: ");
        // Prompt the user to enter the second number
        String secondNumberStr = console.readLine("Enter the second number: ");
        
        try {
            // Convert the first number from a string to an integer
            int firstNumber = Integer.parseInt(firstNumberStr);
            // Convert the second number from a string to an integer
            int secondNumber = Integer.parseInt(secondNumberStr);
            
            // Calculate the sum of the two numbers
            int sum = firstNumber + secondNumber;
            
            // Display the result to the user
            console.printf("The sum of %d and %d is %d.\n", firstNumber, secondNumber, sum);
        } catch (NumberFormatException e) {
            // Handle the case where the input is not a valid integer
            console.printf("Invalid input. Please enter valid integers.\n");
        }
    }
}
