import java.util.*;

public class SumEvenNumbers {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        List<Integer> numbers = new ArrayList<>();

        // Add integers to the ArrayList
        numbers.add(1); // Add 1 to the list
        numbers.add(2); // Add 2 to the list
        numbers.add(3); // Add 3 to the list
        numbers.add(4); // Add 4 to the list
        numbers.add(5); // Add 5 to the list
        numbers.add(6); // Add 6 to the list
        numbers.add(7); // Add 7 to the list
        numbers.add(8); // Add 8 to the list
        numbers.add(9); // Add 9 to the list
        numbers.add(10); // Add 10 to the list

        // Initialize a variable to store the sum of even numbers
        int sumOfEvens = 0;

        // Loop through each number in the ArrayList
        for (int number : numbers) {
            // Check if the current number is even
            if (number % 2 == 0) {
                // If the number is even, add it to the sum
                sumOfEvens += number;
            }
        }

        // Print the sum of all even numbers
        System.out.println("The sum of all even numbers is: " + sumOfEvens);
    }
}
