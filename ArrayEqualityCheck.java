import java.util.Scanner;

public class ArrayEqualityCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = sc.nextInt();

        // Read the size of the second array
        System.out.print("Enter the size of the second array: ");
        int size2 = sc.nextInt();

        // Initialize the arrays
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];

        // Read elements of the first array
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
        }

        // Read elements of the second array
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = sc.nextInt();
        }

        // Check if arrays are the same size and sum
        if (areArraysSame(array1, array2)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

        // Close the Scanner object
        sc.close();
    }

    //Method to check if two arrays are the same
    public static boolean areArraysSame(int[] array1, int[] array2) {
        // Check if sizes are different
        if (array1.length != array2.length) {
            return false;
        }

        // Calculate the sum of both arrays
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
        }

        // Check if sums are the same
        return sum1 == sum2;
    }
}
