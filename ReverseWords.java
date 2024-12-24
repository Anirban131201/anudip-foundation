import java.util.Scanner; // Import Scanner for user input

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine(); // Read the input sentence

        // Reverse the positions of the words in the input sentence
        String reversedPositionSentence = reverseWordPositions(sentence);

        // Display the sentence with reversed word positions
        System.out.println("Sentence with reversed word positions: " + reversedPositionSentence);
        
        scanner.close(); // Close the Scanner to release resources
    }

    public static String reverseWordPositions(String str) {
        // Split the string into an array of words using spaces as delimiters
        String[] words = str.split(" ");

        // Use StringBuilder to construct the reversed sentence
        StringBuilder reversedString = new StringBuilder();

        // Loop through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" "); // Append each word followed by a space
        }

        // Return the reversed sentence after trimming any trailing spaces
        return reversedString.toString().trim();
    }
}
