import java.util.Scanner;

public class FencingGround {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the length of the ground (in meters): ");
        int length = sc.nextInt();

        System.out.print("Enter the breadth of the ground (in meters): ");
        int breadth = sc.nextInt();

        // Calculate perimeter and area
        int perimeter = 2 * (length + breadth);
        int area = length * breadth;

        // Display the results
        System.out.println("\nThe required length is: " + perimeter + " meters");
        System.out.println("The required area of the carpet is: " + area + " square meters");

        // Close the scanner
        sc.close();
    }
}
