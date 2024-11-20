import java.io.*;
import java.util.*;

public class ElectricityBill {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for electricity consumption
        System.out.print("Enter the units of electricity consumed: ");
        int units = sc.nextInt();
        double bill;

        // Calculate the electricity bill based on consumption
        if (units <= 200) {
            bill = units * 0.5;
        } else if (units <= 400) {
            bill = units * 0.65 + 100;
        } else if (units <= 600) {
            bill = units * 0.80 + 200;
        } else {
            bill = units * 1.25 + 425;
        }

        // Display the calculated bill
        System.out.printf("\nThe electricity bill is Rs. %.2f\n", bill);

        // Close the scanner
        sc.close();
    }

}
