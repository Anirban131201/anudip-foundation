import java.util.Arrays;

public class BubbleSortString {
    public static void main(String[] args) {
        // Initialize the array of strings
        String[] array = {"banana", "apple", "orange", "kiwi", "grape"};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(array));

        // Sort using Bubble Sort
        // Clone the original array to preserve it for comparison
        String[] bubbleSortedArray = array.clone();
        bubbleSort(bubbleSortedArray);
        System.out.println("\nBubble sorted array: " + Arrays.toString(bubbleSortedArray));

        // Sort using Arrays.sort() for comparison
        String[] arraysSortedArray = array.clone();
        Arrays.sort(arraysSortedArray);
        System.out.println("\nArrays.sort() sorted array: " + Arrays.toString(arraysSortedArray));
    }

    // Sorts an array of strings using the Bubble Sort algorithm
    public static void bubbleSort(String[] array) {
        int n = array.length;

        // Outer loop for the number of passes
        for (int i = 0; i < n - 1; i++) {
            System.out.println("\nPASS " + (i + 1)); // Display the current pass number

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent strings lexicographically
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap array[j] and array[j + 1] if they are in the wrong order
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    // Display the swap action
                    System.out.println("Swapping " + array[j] + " in place of " + array[j + 1]);
                }
            }
        }
    }
}
