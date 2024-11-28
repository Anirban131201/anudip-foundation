import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the day as a number (1-7): ");
        int day = sc.nextInt();

        // Determine the day of the week using a switch statement
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        // Close the scanner
        sc.close();
    }
}
