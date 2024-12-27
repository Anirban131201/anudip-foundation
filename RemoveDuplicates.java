import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Initialize the array
        int[] array = new int[size];

        // Read elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Remove duplicates from the array
        int[] uniqueArray = removeDuplicates(array);

        // Display the array without duplicates
        System.out.println("Array without duplicates:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
        System.out.println(); // Print a new line for clean output

        // Close the Scanner object
        sc.close();
    }

    //Method to remove duplicates from an array
    public static int[] removeDuplicates(int[] array) {
        int n = array.length;

        // Temporary array to store unique elements
        int[] tempArray = new int[n];
        int index = 0;

        // Loop through the original array
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if the current element is already in the temporary array
            for (int j = 0; j < index; j++) {
                if (array[i] == tempArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add it to the temporary array
            if (!isDuplicate) {
                tempArray[index++] = array[i];
            }
        }

        // Create a final array with the exact size of unique elements
        int[] uniqueArray = new int[index];
        System.arraycopy(tempArray, 0, uniqueArray, 0, index);

        return uniqueArray;
    }
}
