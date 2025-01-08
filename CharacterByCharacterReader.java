import java.io.*;

// This class demonstrates how to read a file character by character using FileReader in Java
public class CharacterByCharacterReader {
    public static void main(String[] args) {
        // Specify the file path to be read
        String filePath = "anirban.txt";

        // Variable to count the total number of characters
        int charCount = 0;

        // Try-with-resources to ensure the FileReader is automatically closed
        try (FileReader fileReader = new FileReader(filePath)) {
            int ch; // Variable to store each character read from the file

            // Read the file character by character until the end of the file is reached (-1)
            while ((ch = fileReader.read()) != -1) {
                // Print each character to the console
                System.out.print((char) ch);
                charCount++; // Increment the character count
            }
        } catch (IOException e) {
            // Handle any IOException that occurs during file reading
            e.printStackTrace();
        }

        // Print the total number of characters in the file
        System.out.println("\nTotal number of characters: " + charCount);
    }
}
