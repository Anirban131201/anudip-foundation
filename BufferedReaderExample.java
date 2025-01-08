import java.io.*;

// This class demonstrates how to read a file using FileReader and BufferedReader in Java
public class BufferedReaderExample {
    public static void main(String[] args) {
        try {
            // Create a FileReader to read the file named "anirban.txt"
            FileReader reader = new FileReader("anirban.txt");

            // Wrap FileReader with BufferedReader for efficient line-by-line reading
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            String line; // Variable to hold each line read from the file
            
            // Read and print lines from the file until the end is reached
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Print the current line to the console
            }
            
            // Close the BufferedReader to free resources
            bufferedReader.close();
        } catch (IOException e) {
            // Handle any IOException that occurs during file reading
            System.out.println("An error occurred.");
            e.printStackTrace(); // Print the stack trace for debugging
        }
    }
}
