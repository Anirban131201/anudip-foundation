class Bike {
    private String brand;
    private String model;
    private int price;

    // Parameterized constructor
    public Bike(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display bike details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: Rs. " + price);
        System.out.println();
    }
}

public class ClassExample {

    public static void main(String[] args) {
        // Creating instances of the Bike class
        Bike bike1 = new Bike("Hero", "Splendor", 76356);
        Bike bike2 = new Bike("Bajaj", "Pulsar NS200", 99533);
        Bike bike3 = new Bike("Kawasaki", "Ninja ZX-10R", 1736000);

        // Displaying details of each bike
        bike1.displayDetails();
        bike2.displayDetails();
        bike3.displayDetails();
    }
}

