import java.util.Scanner;

public class Dollar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input: Dollar and cent values
        System.out.print("Enter dollars and cents for the first amount (separated by space): ");
        int dollar1 = sc.nextInt();
        int cent1 = sc.nextInt();

        System.out.print("Enter dollars and cents for the second amount (separated by space): ");
        int dollar2 = sc.nextInt();
        int cent2 = sc.nextInt();

        // Convert dollars to cents and calculate total cents for each amount
        cent1 += dollar1 * 100;
        cent2 += dollar2 * 100;

        // Calculate the final dollar and cent values
        int totalCents = cent1 + cent2;
        int finalDollars = totalCents / 100;
        int finalCents = totalCents % 100;

        // Display the result
        System.out.println("\nTotal Amount:");
        System.out.println("Dollars: " + finalDollars);
        System.out.println("Cents: " + finalCents);

        // Close the scanner
        sc.close();
    }
}
