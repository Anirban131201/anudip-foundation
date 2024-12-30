import java.util.*;

public class QuickSort {
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

        // Display the original array before sorting
        System.out.println("\nOriginal array: " + Arrays.toString(array));

        // Call quickSort to sort the array
        quickSort(array, 0, array.length - 1);

        // Display the sorted array after Quick Sort
        System.out.println("\nSorted array: " + Arrays.toString(array));

        // Close the Scanner object
        sc.close();
    }

    // Recursive method to perform Quick Sort on the array
    public static void quickSort(int[] array, int low, int high) {
        // Base condition: If the starting index is less than the ending index
        if (low < high) {
            // Find the partition index
            int pi = partition(array, low, high);

            // Recursively sort the elements before and after the partition index
            quickSort(array, low, pi - 1); // Sort the left subarray
            quickSort(array, pi + 1, high); // Sort the right subarray
        }
    }

    // Method to partition the array into two halves based on the pivot element
    public static int partition(int[] array, int low, int high) {
        // Choose the pivot element (last element in the range)
        int pivot = array[high];

        // Initialize the index for elements smaller than the pivot
        int i = (low - 1);

        // Traverse the array and rearrange elements
        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (array[j] <= pivot) {
                i++; // Increment the smaller element index

                // Swap array[i] with array[j] to move smaller element to the left
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element to its correct position
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the partition index
        return i + 1;
    }
}
