import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // Initialize the array
        int[] array = new int[size];

        // Read elements of the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Sort the array using insertion sort
        insertionSort(array);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Close the Scanner object
        sc.close();
    }

    // Sorts an array using the insertion sort algorithm
    public static void insertionSort(int[] array) {
        int n = array.length;

        // Start from the second element and iterate through the array
        for (int i = 1; i < n; i++) {
            int key = array[i]; // The element to be inserted into its correct position
            int j = i - 1; // Index of the previous element

            // Shift elements of the sorted part of the array to the right
            // until the correct position for 'key' is found
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1; // Move one position backward
            }

            // Insert the 'key' at its correct position
            array[j + 1] = key;
        }
    }
}
