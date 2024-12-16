// Base class Vehicle2
class Vehicle2 {
    // Method to describe the wheels of a generic vehicle
    public void wheels() {
        System.out.println("Vehicle has wheels.");
    }
}

// Subclass Car2 inheriting from Vehicle2
class Car2 extends Vehicle2 {
    // Overriding the wheels method to describe a car's wheels
    @Override
    public void wheels() {
        System.out.println("Car has four wheels.");
    }
}

// Subclass Bike2 inheriting from Vehicle2
class Bike2 extends Vehicle2 {
    // Overriding the wheels method to describe a bike's wheels
    @Override
    public void wheels() {
        System.out.println("Bike has two wheels.");
    }
}

// Main class to demonstrate method overriding
public class MethodOverriding {
    public static void main(String[] args) {
        // Creating instances of Vehicle2, Car2, and Bike2
        Vehicle2 myVehicle = new Vehicle2(); // Generic vehicle
        Vehicle2 myCar = new Car2();        // Car instance
        Vehicle2 myBike = new Bike2();      // Bike instance

        // Calling the wheels method on each instance
        System.out.println("Generic vehicle:");
        myVehicle.wheels();

        System.out.println("\nCar:");
        myCar.wheels();

        System.out.println("\nBike:");
        myBike.wheels();
    }
}
