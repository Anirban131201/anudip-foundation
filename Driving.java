// Base class
class Vehicle1 {
    String make;
    String model;
    int year;
    int maximumSpeed;

    // Constructor for Vehicle
    public Vehicle1(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    // Method to be overridden by subclasses
    void drive() {
        System.out.println("Vehicle is driving.");
    }
}

// Subclass for Car
class Car1 extends Vehicle1 {
    // Constructor for Car
    public Car1(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed); // Call to the parent class constructor
    }

    @Override
    void drive() {
        System.out.println(make + " " + model + " car is driving.");
    }
}

// Subclass for Bike
class Bike1 extends Vehicle1 {
    // Constructor for Bike
    public Bike1(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed); // Call to the parent class constructor
    }

    @Override
    void drive() {
        System.out.println(make + " " + model + " bike is driving.");
    }
}

// Main class
public class Driving {
    public static void main(String[] args) {
        // Instantiate Car
        Car1 myCar = new Car1("Toyota", "Fortuner", 2024, 180);
        System.out.println("Car Details: Maker - " + myCar.make + ", Model - " + myCar.model + ", Year - " + myCar.year + ", Max Speed - " + myCar.maximumSpeed);
        myCar.drive();

        // Instantiate Bike
        Bike1 myBike = new Bike1("Yamaha", "FZ", 2024, 120);
        System.out.println("Bike Details: Maker - " + myBike.make + ", Model - " + myBike.model + ", Year - " + myBike.year + ", Max Speed - " + myBike.maximumSpeed);
        myBike.drive();
    }
}

