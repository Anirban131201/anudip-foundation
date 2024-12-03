import java.util.Scanner;

public class HollowSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the size of the square
        System.out.print("Enter the size of the hollow square: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Error: The size of the square must be at least 2.");
        } else {
            // Generate the hollow square pattern
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // Print '*' for the borders of the square
                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        scanner.close();
    }
    
}
