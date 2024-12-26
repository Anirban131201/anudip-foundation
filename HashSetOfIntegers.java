import java.util.*;

public class HashSetOfIntegers {

    public static void main(String[] args) {
        // Creating a HashSet
        Set<Integer> integerSet = new HashSet<>();

        // Adding integers to the set
        integerSet.add(5);
        integerSet.add(10);
        integerSet.add(15);
        integerSet.add(20);
        integerSet.add(25);

        // Displaying the integers in the set
        System.out.println("Integers in the set: " + integerSet);

        // Checking if the set contains a specific integer
        int numberToCheck = 10;
        if (integerSet.contains(numberToCheck)) {
            System.out.println("The set contains " + numberToCheck);
        } else {
            System.out.println("The set doesn't contain " + numberToCheck);
        }

        // Removing a specific number
        int numberToRemove = 15;
        integerSet.remove(numberToRemove);
        System.out.println("The number that has been removed is " + numberToRemove);
        System.out.println("Integers in the set after removing '" + numberToRemove + "' are: " + integerSet);

        // Checking the size of the set
        System.out.println("Number of elements in the set: " + integerSet.size());
    }
}
