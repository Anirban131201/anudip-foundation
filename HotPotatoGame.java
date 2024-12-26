import java.util.*;

public class HotPotatoGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a queue to represent the circle of players
        Queue<String> queue = new LinkedList<>();
        
        // Enqueue player names
        System.out.println("Enter player names (type 'done' to finish):");
        while (true) {
            String player = scanner.nextLine();
            if (player.equalsIgnoreCase("done")) {
                break;
            }
            queue.add(player);
        }
        
        Random random = new Random();
        
        // Simulate the game
        while (queue.size() > 1) {
            int passes = random.nextInt(10) + 1; // Random number of passes
            System.out.println("\nPassing the potato " + passes + " times.");
            
            // Pass the potato
            for (int i = 0; i < passes; i++) {
                String player = queue.remove();
                queue.add(player);
            }
            
            // Remove the player holding the potato
            String removedPlayer = queue.remove();
            System.out.println(removedPlayer + " is out!");
        }
        
        // The last player remaining
        String winner = queue.remove();
        System.out.println("\nThe winner is " + winner + "!");
        
        scanner.close();
    }
}
