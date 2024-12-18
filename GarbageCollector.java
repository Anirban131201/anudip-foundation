public class GarbageCollector {

    // Fields
    private String objectName;

    // Constructor
    public GarbageCollector(String objectName) {
        this.objectName = objectName;
    }

    // Method to display the object's name
    public void displayDetails() {
        System.out.println("Object Name: " + objectName);
    }

    public static void main(String[] args) {
        // Creating an instance of GarbageCollector with a name
        GarbageCollector gar1 = new GarbageCollector("GarbageCollector1");
        GarbageCollector gar2 = new GarbageCollector("GarbageCollector2");
        GarbageCollector gar3 = new GarbageCollector("GarbageCollector3");
        GarbageCollector gar4 = new GarbageCollector("GarbageCollector4");
        
        System.out.println("Before garbage collection: ");
        
        // Displaying the object's name
        gar1.displayDetails();
        gar2.displayDetails();
        gar3.displayDetails();
        gar4.displayDetails();
        
        // Nullifying the reference variable making the GarbageCollector object eligible for garbage collection
        gar1 = null;
        gar2 = null;
        gar3 = null;
        gar4 = null;
        
        // Requesting the JVM to run the garbage collector
        System.gc();
        
        System.out.println("After garabage collection: ");
    }
    
}
