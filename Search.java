import java.util.Scanner;

public class Search {

    // Method to search and count the occurrences of a word in a string
    public int searchWordFunction(String text, String word) {
        int count = 0;
        String[] words = text.split("\\s+"); // Split the string into words

        for (String w : words) {
            if (w.equalsIgnoreCase(word)) { // Case-insensitive comparison
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Search search = new Search();

        // Prompting the user to input text and the word to search
        System.out.print("Enter a text of your choice: ");
        String text = sc.nextLine();
        System.out.print("Enter the word you want to count occurrences of: ");
        String word = sc.nextLine();

        // Calculating occurrences and displaying the result
        int occurrences = search.searchWordFunction(text, word);
        System.out.println("The word '" + word + "' occurs " + occurrences + " times in the given text.");

        sc.close();
    }
}
