import java.util.Scanner;

public class StrongNumber {

    // Method to calculate the factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check whether a number is a Strong Number
    public static boolean isStrongNumber(int num) {
        int sum = 0;
        int originalNum = num;

        // Process each digit of the number
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        // Return true if the sum of the factorials equals the original number
        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check and output whether the number is a Strong Number
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong Number.");
        } else {
            System.out.println(number + " is not a Strong Number.");
        }

        scanner.close();
    }
}
