import java.util.Scanner; // Import Scanner for user input

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter an alphanumeric string
        System.out.print("Enter any alphanumeric string: ");
        String input = sc.nextLine(); // Read the input string
        int sum = 0; // Initialize a variable to hold the sum of digits

        // Loop through each character of the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); // Get the character at the current index

            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch); // Convert the digit to its numeric value and add to the sum
            }
        }

        // Display the result
        System.out.println("The sum of numbers in the string is: " + sum);

        sc.close(); // Close the Scanner
    }
}
