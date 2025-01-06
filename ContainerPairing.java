import java.util.*;

public class ContainerPairing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of containers
        System.out.print("Enter the number of containers: ");
        int n = scanner.nextInt();

        if (1 <= n && n <= 1000) {
            System.out.println("Invalid number of containers. Exiting.");
            return;
        }

        // Input the capacities of the containers
        int[] capacities = new int[n];
        System.out.println("Enter the capacities of the containers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Capacity of container " + (i + 1) + ": ");
            capacities[i] = scanner.nextInt();
        }

        // Pair the containers
        pairContainers(capacities);

        scanner.close();
    }

    public static void pairContainers(int[] capacities) {
        // Sort the array in ascending order
        Arrays.sort(capacities);

        int n = capacities.length;
        int i = 0; // Pointer to the smallest element
        int j = n - 1; // Pointer to the largest element

        // Pair the containers
        System.out.println("\nContainer Pairs:");
        while (i < j) {
            System.out.println("Pair: (" + capacities[j] + ", " + capacities[i] + ")");
            i++;
            j--;
        }

        // Handle the case where there is one unpaired container
        if (i == j) { // Only one container is left
            System.out.println("Pair: (" + capacities[i] + ", 0)");
        }
    }
}
