import java.io.*;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for the year
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // Check if the year is a leap year
        if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Close the scanner
        sc.close();
    }

}
