import java.io.*;
import java.util.*;

public class TrendyNumber {

	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        // Check if the number is a three-digit number
        if (number >= 100 && number <= 999) {
            // Extract the middle digit
            int middleDigit = (number / 10) % 10;

            // Check if the middle digit is divisible by 3
            if (middleDigit % 3 == 0) {
                System.out.println(number + " is a trendy number.");
            } else {
                System.out.println(number + " is not a trendy number.");
            }
        } else {
            System.out.println(number + " is not a trendy number.");
        }

        // Close the scanner
        sc.close();
    }

}
