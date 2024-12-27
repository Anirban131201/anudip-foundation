
public class Pair<K, V, T, E> {
    private K key;
    private V value;
    private T type;
    private E element;

    //Constructor to initialize the key, value, type, and element
    public Pair(K key, V value, T type, E element) {
        this.key = key;
        this.value = value;
        this.type = type;
        this.element = element;
    }

    //Getter for the key
    public K getKey() {
        return key;
    }

    //Setter for the key
    public void setKey(K key) {
        this.key = key;
    }

    //Getter for the value
    public V getValue() {
        return value;
    }

   //Setter for the value
    public void setValue(V value) {
        this.value = value;
    }

    //Getter for the type
    public T getType() {
        return type;
    }

    //Setter for the type
    public void setType(T type) {
        this.type = type;
    }

    //Getter for the element
    public E getElement() {
        return element;
    }

    //Setter for the element
    public void setElement(E element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Pair [key=" + key + ", value=" + value + ", type=" + type + ", element=" + element + "]";
    }

    public static void main(String[] args) {
        // Create an Pair with Integer, String, Double, and Character types
        Pair<Integer, String, Double, Character> pair1 = new Pair<>(1, "One", 2.5, 'A');
        System.out.println("Pair1: " + pair1);

        // Create an Pair with String, Integer, String, and Boolean types
        Pair<String, Integer, String, Boolean> pair2 = new Pair<>("key", 100, "type", true);
        System.out.println("Pair2: " + pair2);
    }
}
