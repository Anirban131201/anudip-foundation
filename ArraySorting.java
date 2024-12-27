import java.util.*;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // Initialize the array
        int[] array = new int[size];

        // Read elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(array);

        // Display the sorted array
        System.out.println("The Sorted array is:");
        for (int num : array) {
            System.out.println(num);
        }
        
        // Close the Scanner object
        sc.close();
    }
}
