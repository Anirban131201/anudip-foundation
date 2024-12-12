/* Check if a Number is Prime: Write a program that checks if a given integer is a prime number. */

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer to check if it is a prime number: ");
        int n = sc.nextInt();
        
        // Initialize a flag to indicate if the number is prime
        boolean isPrime = true;
        
        // Handle edge cases for 0 and 1
        if (n == 0 || n == 1) {
            isPrime = false;
        } else {
            // Check divisors from 2 to n/2
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        // Display the result
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
        
        // Close the scanner object
        sc.close();
    }
}
