import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try {
            // Open the source file for reading
            FileInputStream fis = new FileInputStream("source.txt");

            // Open/create the destination file for writing
            FileOutputStream fos = new FileOutputStream("destination.txt");
             
            // Variable to hold the data being read from the source file
            int data;

            // Read data from the source file and write it to the destination file
            while ((data = fis.read()) != -1) { // Read one byte at a time
                fos.write(data); // Write the byte to the destination file
            }

            // Notify the user that the file copy operation was successful
            System.out.println("File copied successfully!");
            
            // Close the FileInputStream to release the resources
            fis.close();

            // Close the FileOutputStream to release the resources
            fos.close();

        } catch (IOException e) {
            // Handle any IO exceptions and print the stack trace for debugging
            e.printStackTrace();
        }
    }
}
