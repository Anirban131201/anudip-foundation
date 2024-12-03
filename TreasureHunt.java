import java.util.Scanner;

public class TreasureHunt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt for the total number of coins
        System.out.print("Enter the total number of coins: ");
        int coins = sc.nextInt();

        // Prompt for Long Ben's share percentage
        System.out.print("Enter Long Ben's share percentage: ");
        int benSharePercentage = sc.nextInt();

        // Prompt for Blackbeard's share percentage
        System.out.print("Enter Blackbeard's share percentage: ");
        int blackbeardSharePercentage = sc.nextInt();

        // Calculate the shares
        int benShare = (benSharePercentage * coins) / 100;
        int blackbeardShare = (blackbeardSharePercentage * coins) / 100;

        // Calculate leftover coins
        int leftover = coins - (benShare + blackbeardShare);

        // Display the results
        System.out.println("\nTreasure Distribution:");
        System.out.println("Long Ben's share: " + benShare + " coins");
        System.out.println("Blackbeard's share: " + blackbeardShare + " coins");
        System.out.println("Leftover coins: " + leftover + " coins");

        // Close the scanner
        sc.close();
    }
}
