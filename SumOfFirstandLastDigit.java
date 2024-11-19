import java.util.*;

public class SumOfFirstandLastDigit {
	
	// Method to calculate the first digit of a number
    public static int firstDigit(int number) {
        while (number >= 10) {
            number /= 10;
        }
        return number;
    }

    // Method to calculate the last digit of a number
    public static int lastDigit(int number) {
        return number % 10;
    }
    
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter any four-digit integer: ");
        int number = scanner.nextInt();

        // Check if the number is a four-digit integer
        if (number>=1000 && number<=9999) {
            // Calculate the first and last digits
            int first = firstDigit(number);
            int last = lastDigit(number);
            int sum = first + last;

            // Display the results
            System.out.println("\nThe first digit is " + first);
            System.out.println("The last digit is " + last);
            System.out.println("The sum of the first and last digits is " + sum);
        } else {
            System.out.println("The entered number is not a four-digit integer.");
        }

        // Close the scanner
        scanner.close();
    }
}
