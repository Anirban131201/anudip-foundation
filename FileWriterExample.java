import java.io.*;

// This class demonstrates how to write to a file using FileWriter and BufferedWriter in Java
class FileWriterExample {
    public static void main(String[] args) {
        try {
            // Create a FileWriter to write to a file named "anirban.txt"
            FileWriter writer = new FileWriter("anirban.txt");

            // Wrap FileWriter with BufferedWriter for efficient writing
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            // Write content to the file
            bufferedWriter.write("I am Anirban Bhowmick");

            // Close the BufferedWriter to ensure all data is flushed and resources are released
            bufferedWriter.close();

            // Print a success message
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            // Handle any IOException that occurs during file writing
            System.out.println("An error occurred.");
            e.printStackTrace(); // Print the stack trace for debugging
        }
    }
}
