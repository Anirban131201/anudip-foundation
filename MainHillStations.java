// Base class representing a generic Hill Station
class HillStations {

    // Method to display the location of the hill station
    public void location() {
        System.out.println("Hill Station location:");
    }

    // Method to display what the hill station is famous for
    public void famousFor() {
        System.out.println("Reason for the Hill Station being famous:");
    }
}

// Subclass representing the hill station Manali
class Manali extends HillStations {

    // Override the location method to provide specific details about Manali
    @Override
    public void location() {
        System.out.println("Location: Himachal Pradesh");
    }

    // Override the famousFor method to describe what makes Manali special
    @Override
    public void famousFor() {
        System.out.println("Manali is famous for its natural beauty, adventure activities, and rich cultural heritage.");
    }
}

// Subclass representing the hill station Mussoorie
class Mussoorie extends HillStations {

    // Override the location method to provide specific details about Mussoorie
    @Override
    public void location() {
        System.out.println("Location: Uttarakhand");
    }

    // Override the famousFor method to describe what makes Mussoorie special
    @Override
    public void famousFor() {
        System.out.println("Mussoorie is famous for its scenic beauty, good social life, and entertainment.");
    }
}

// Subclass representing the hill station Gulmarg
class Gulmarg extends HillStations {

    // Override the location method to provide specific details about Gulmarg
    @Override
    public void location() {
        System.out.println("Location: Jammu and Kashmir");
    }

    // Override the famousFor method to describe what makes Gulmarg special
    @Override
    public void famousFor() {
        System.out.println("Gulmarg is famous for the scenic beauty of the Himalayan Mountains in the backdrop.");
    }
}

// Main class to demonstrate method overriding and polymorphism
public class MainHillStations {

    public static void main(String[] args) {
        // Creating instances of subclasses (Polymorphism in action)
        HillStations hill1 = new Manali();   // Instance of Manali
        HillStations hill2 = new Mussoorie(); // Instance of Mussoorie
        HillStations hill3 = new Gulmarg();   // Instance of Gulmarg

        // Displaying details for Manali
        System.out.println("----- Manali -----");
        hill1.location();     // Calls the overridden location method in Manali
        hill1.famousFor();    // Calls the overridden famousFor method in Manali

        // Displaying details for Mussoorie
        System.out.println("\n----- Mussoorie -----");
        hill2.location();     // Calls the overridden location method in Mussoorie
        hill2.famousFor();    // Calls the overridden famousFor method in Mussoorie

        // Displaying details for Gulmarg
        System.out.println("\n----- Gulmarg -----");
        hill3.location();     // Calls the overridden location method in Gulmarg
        hill3.famousFor();    // Calls the overridden famousFor method in Gulmarg
    }
}
