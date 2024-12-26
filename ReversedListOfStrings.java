import java.util.*;

public class ReversedListOfStrings {
    public static void main(String[] args) {
        // Create an ArrayList and add some strings
        List<String> list = new ArrayList<>();
        list.add("I");
        list.add("am");
        list.add("Anirban");
        list.add("Bhowmick");

        // Display the original list
        System.out.println("Original list: " + list);

        // Reverse the list
        Collections.reverse(list);

        // Display the reversed list
        System.out.println("Reversed list: " + list);
    }
}
