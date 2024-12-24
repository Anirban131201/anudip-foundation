import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter any single word: ");
        String word = sc.nextLine(); // Read the user input

        // Convert the word to lowercase for case-insensitive comparison
        word = word.toLowerCase();

        // Reverse the word using StringBuilder
        String reversedStr = new StringBuilder(word).reverse().toString();

        // Check if the original word is equal to its reversed version
        if (word.equals(reversedStr)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }

        // Close the Scanner object to release resources
        sc.close();
    }
}
