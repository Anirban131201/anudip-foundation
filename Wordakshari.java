import java.util.ArrayList; // Import ArrayList for storing the word chain
import java.util.Scanner;  // Import Scanner for user input

public class Wordakshari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        ArrayList<String> wordChain = new ArrayList<>(); // List to store the sequence of words in the chain

        // Prompt the user to enter the first word
        System.out.print("Enter the first word: ");
        String currentWord = scanner.nextLine();

        // Check if the user immediately ends the game
        if (currentWord.equals("####")) {
            System.out.println("No words were added to the chain.");
            return; // Exit the program
        }

        wordChain.add(currentWord); // Add the first word to the word chain

        // Continuously prompt the user for the next word
        while (true) {
            System.out.print("Enter a word starting with '" + currentWord.charAt(currentWord.length() - 1) + "' (or '####' to end): ");
            String nextWord = scanner.nextLine();

            // Check if the user ends the game
            if (nextWord.equals("####")) {
                System.out.println("End of input.");
                break; // Exit the loop
            }

            // Check if the new word starts with the last character of the previous word
            if (!nextWord.startsWith("" + currentWord.charAt(currentWord.length() - 1))) {
                System.out.println("Invalid word! The word should start with '" + currentWord.charAt(currentWord.length() - 1) + "'.");
                break; // End the game if the input is invalid
            }

            // Check if the word has already been used
            if (wordChain.contains(nextWord)) {
                System.out.println("Word already used! You lost the game.");
                break; // End the game if the word is a duplicate
            }

            wordChain.add(nextWord); // Add the valid word to the chain
            currentWord = nextWord; // Update the current word for the next iteration
        }

        // Display the final word chain
        System.out.println("Wordakshari Chain: " + wordChain);
        scanner.close(); // Close the Scanner
    }
}
