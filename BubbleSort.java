import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // Initialize the array with the specified size
        int[] array = new int[size];

        // Read elements of the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Display the original array
        System.out.println("\nOriginal array: " + Arrays.toString(array));

        // Perform bubble sort on the array
        bubbleSort(array);

        // Display the sorted array
        System.out.println("\nSorted array: " + Arrays.toString(array));

        // Close the Scanner object to prevent resource leaks
        sc.close();
    }

    // Performs Bubble Sort on the given array
    public static void bubbleSort(int[] array) {
        int n = array.length; // Length of the array

        // Outer loop for the number of passes
        for (int i = 0; i < n - 1; i++) {
            System.out.println("\nPASS " + (i + 1)); // Display the current pass number

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements and swap if they are in the wrong order
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    // Display the swap operation
                    System.out.println("Swapping " + array[j] + " in place of " + array[j + 1]);
                }
            }
        }
    }
}
