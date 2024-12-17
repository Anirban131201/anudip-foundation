// Abstract class representing a Document
abstract class Document {
    // Abstract methods to be implemented by subclasses
    public abstract void name();
    public abstract void types();
}

// Official class inheriting from Document
class Official extends Document {

    @Override
    public void name() {
        System.out.println("Official Document:");
    }

    @Override
    public void types() {
        System.out.println("Types of Official Documents:");
        System.out.println("1. Passport");
        System.out.println("2. Birth Certificates");
        System.out.println("3. Marriage Certificates");
        System.out.println("4. Government IDs");
    }
}

// Main class to demonstrate abstract class functionality
public class MainDocument {
    public static void main(String[] args) {
        // Creating an object of the Official class using the Document reference
        Document doc = new Official();

        // Calling the overridden methods
        doc.name();
        doc.types();
    }
}
