import java.util.*;

public class MergeSort {
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

        // Call mergeSort to sort the array
        mergeSort(array, 0, array.length - 1);

        // Display the sorted array after merge sort
        System.out.println("\nSorted array: " + Arrays.toString(array));

        // Close the Scanner object
        sc.close();
    }

    // Recursive method to divide the array into smaller parts and sort them
    public static void mergeSort(int[] array, int left, int right) {
        // Base condition: If left index is less than right, continue
        if (left < right) {
            // Calculate the middle index
            int middle = (left + right) / 2;

            // Recursively divide the left part of the array
            mergeSort(array, left, middle);

            // Recursively divide the right part of the array
            mergeSort(array, middle + 1, right);

            // Merge the two sorted halves
            merge(array, left, middle, right);
        }
    }

    // Merges two sorted subarrays into a single sorted array
    public static void merge(int[] array, int left, int middle, int right) {
        // Determine the sizes of the two subarrays to be merged
        int n1 = middle - left + 1; // Size of the left subarray
        int n2 = right - middle;   // Size of the right subarray

        // Create temporary arrays to hold the two subarrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data into the left subarray
        for (int i = 0; i < n1; i++) {
            L[i] = array[left + i];
        }

        // Copy data into the right subarray
        for (int j = 0; j < n2; j++) {
            R[j] = array[middle + 1 + j];
        }

        // Merge the two subarrays back into the original array
        int i = 0, j = 0; // Initial indices of L[] and R[]
        int k = left;     // Initial index of the merged array

        // Compare elements of L[] and R[], and place the smaller element into the array
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements of L[] into the array
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // Copy any remaining elements of R[] into the array
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}
