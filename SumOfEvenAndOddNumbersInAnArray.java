import java.util.*;

public class SumOfEvenAndOddNumbersInAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Read the size of the arrays
        System.out.println("Enter the size of the arrays:");
        int size = sc.nextInt();
        
        // Initialize the arrays
		int[] intArray = new int[size];
		
		// Read elements for the array
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            intArray[i] = sc.nextInt();
        }
        
        // Initialize two variables to store the sum of even and odd numbers
        int sumOfEvens = 0;
        int sumOfOdds = 0;
        
        // Loop through each integer in the Array
        for (int intarray : intArray) {
            // Check if the current number is even
            if (intarray % 2 == 0) {
                // If the number is even, add it to the sum of evens
                sumOfEvens += intarray;
            }else {
            	// If the number is odd, add it to the sum of odds
                sumOfOdds += intarray;
            }
        }
        
        // Print the sum of all even and odd numbers
        System.out.println("The sum of all even numbers is: " + sumOfEvens);
        System.out.println("The sum of all odd numbers is: " + sumOfOdds);
        
        // Close the Scanner object
        sc.close();
	}

}
