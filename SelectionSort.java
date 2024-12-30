import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // Initialize the array with the given size
        int[] array = new int[size];

        // Read elements of the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        
        // Display the original array
        System.out.println("\nOriginal array: " + Arrays.toString(array));

        // Call the selectionSort method to sort the array
        selectionSort(array);

        // Display the sorted array
        System.out.println("\nSorted array: " + Arrays.toString(array));

        // Close the Scanner object
        sc.close();
    }

    // Sorts the array using the Selection Sort algorithm
    public static void selectionSort(int[] array) {
        int n = array.length; // Length of the array

        // Outer loop to iterate through the unsorted part of the array
        for (int i = 0; i < n - 1; i++) {
            // Assume the first element in the unsorted part is the smallest
            int minIdx = i;

            // Inner loop to find the index of the smallest element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) {
                    // Update the index of the smallest element
                    minIdx = j;
                }
            }

            // Swap the smallest element found with the first element of the unsorted part
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }
}
