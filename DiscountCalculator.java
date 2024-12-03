import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the price
        System.out.print("Enter the price (in Rs.): ");
        int price = sc.nextInt();

        if (price <= 0) {
            System.out.println("Invalid input. Price must be greater than 0.");
        } else if (price <= 2000) {
            System.out.println("No discount available.");
        } else if (price > 2000 && price <= 5000) {
            int discount = price / 10; // 10% discount
            System.out.println("\nYou get a 10% discount!");
            System.out.println("Discount Amount: Rs." + discount);
            System.out.println("Final Price: Rs." + (price - discount));
        } else {
            int discount = price / 5; // 20% discount
            System.out.println("\nYou get a 20% discount!");
            System.out.println("Discount Amount: Rs." + discount);
            System.out.println("Final Price: Rs." + (price - discount));
        }

        sc.close();
    }
}
