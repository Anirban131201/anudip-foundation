import java.util.Scanner;

public class SpecialNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the start and end range
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        // Validate input range
        if ((start >= 10 && end >= 10) && (start <= 99 && end <= 99)) {
            if (start < end) {
                System.out.println("Special numbers in the range " + start + " to " + end + " are:");
                findSpecialNumbers(start, end);
            } else {
                System.out.println("Error: The starting number should be less than the ending number.");
            }
        } else {
            System.out.println("Error: Both inputs should be in the range of 10 to 99.");
        }

        sc.close();
    }

    // Find and display special numbers in the range
    public static void findSpecialNumbers(int start, int end) {
        boolean found = false;

        for (int i = start; i <= end; i++) {
            int sumOfDigits = sumOfDigits(i);
            int productOfDigits = productOfDigits(i);

            if ((sumOfDigits + productOfDigits) == i) {
                System.out.println(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No special numbers found in this range.");
        }
    }

    // Calculate the sum of digits of a number
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Calculate the product of digits of a number
    public static int productOfDigits(int num) {
        int product = 1;
        while (num > 0) {
            product *= num % 10;
            num /= 10;
        }
        return product;
    }
}
