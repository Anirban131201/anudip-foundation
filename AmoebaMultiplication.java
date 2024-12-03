import java.util.Scanner;

public class AmoebaMultiplication {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Initialize variables for the Fibonacci sequence
        int a = 0, b = 1, c = 0;

        // Input the number of generations (n)
        System.out.print("Enter the number of months: ");
        int n = sc.nextInt();

        // Calculate Fibonacci sequence up to the nth month
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        // Output the result
        System.out.println("\nThe number of amoebas in month " + n + " is: " + c);

        // Close the scanner
        sc.close();
    }
}
