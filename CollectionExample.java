import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Displaying elements of the ArrayList
        System.out.println("Elements in the list: " + fruits);

        // Creating a HashSet
        Set<String> bikeSet = new HashSet<>();

        // Adding elements to the HashSet
        bikeSet.add("Hero");
        bikeSet.add("TVS");
        bikeSet.add("Bajaj");
        bikeSet.add("TVS"); // Duplicate, will not be added

        // Displaying elements of the HashSet
        System.out.println("Elements in the set: " + bikeSet);

        // Creating a Queue (FIFO - First In First Out)
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the Queue
        queue.add("John");
        queue.add("Jane");
        queue.add("Jack");

        // Displaying all elements of the Queue
        System.out.println("Elements in the queue: " + queue);

        // Peeking at the head of the Queue
        System.out.println("Head of the queue: " + queue.peek());

        // Creating a HashMap (key-value pairs)
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("John", 30);  // Key: "John", Value: 30
        map.put("Jane", 25);  // Key: "Jane", Value: 25
        map.put("Jack", 35);  // Key: "Jack", Value: 35

        // Displaying all elements of the HashMap
        System.out.println("Elements in the Hash map: " + map);
    }
}
