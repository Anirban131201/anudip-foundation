import java.util.Scanner;

public class ArrayCompatibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the arrays
        System.out.println("Enter the size of the arrays:");
        int size = sc.nextInt();
        
        // Initialize the arrays
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        
        // Read elements for the first array
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size; i++) {
            array1[i] = sc.nextInt();
        }
        
        // Read elements for the second array
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size; i++) {
            array2[i] = sc.nextInt();
        }
        
        // Check compatibility
        boolean areCompatible = true;
        for (int i = 0; i < size; i++) {
            if (array1[i] < array2[i]) {
                areCompatible = false;
                break;
            }
        }
        
        // Output the result
        if (areCompatible) {
            System.out.println("The arrays are compatible.");
        } else {
            System.out.println("The arrays are not compatible.");
        }
        
        // Close the Scanner object
        sc.close();
    }
}
