// Base class demonstrating different access modifiers
class Base {
	
    // Private member - only accessible within this class
    private String privateMember = "Private Member";

    // Default (package-private) member - accessible within the same package
    String defaultMember = "Default Member";

    // Protected member - accessible within the same package and subclasses
    protected String protectedMember = "Protected Member";

    // Public member - accessible from anywhere
    public String publicMember = "Public Member";
}

// Derived class inheriting from Base
class Derived extends Base {
	
    public void displayMembers() {
        // The private member cannot be accessed even in the subclass
        // System.out.println(privateMember); // Not visible - Private Member

        System.out.println(defaultMember);  // Accessible - Default Member
        System.out.println(protectedMember); // Accessible - Protected Member
        System.out.println(publicMember);   // Accessible - Public Member
    }
}

// Main class to demonstrate access modifiers
public class AccessModifiers {
	
    public static void main(String[] args) {
    	
        // Create an instance of Derived and call its method
        Derived derived = new Derived();
        System.out.println("Accessing members from Derived class:");
        derived.displayMembers();

        // Create an instance of Base and access members directly
        Base base = new Base();
        System.out.println("\nAccessing members from Base class instance:");
        
        // System.out.println(base.privateMember); // Not visible - Private Member
        System.out.println(base.defaultMember);  // Accessible - Default Member
        System.out.println(base.protectedMember); // Accessible - Protected Member
        System.out.println(base.publicMember);   // Accessible - Public Member
    }
}
