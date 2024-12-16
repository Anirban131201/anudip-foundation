// Base class Vehicle3
class Vehicle3 {
    // Method to start the vehicle
    public void start() {
        System.out.println("Vehicle started.");
    }
}

// Subclass Car3 inheriting from Vehicle3
class Car3 extends Vehicle3 {
    // Overriding the start method for cars
    @Override
    public void start() {
        System.out.println("Car started.");
    }
}

// Subclass Motorcycle1 inheriting from Vehicle3
class Motorcycle1 extends Vehicle3 {
    // Overriding the start method for motorcycles
    @Override
    public void start() {
        System.out.println("Motorcycle started.");
    }
}

// Garage class to provide services for any Vehicle3 type
class Garage {
    // Method to service a vehicle
    public void serviceVehicle(Vehicle3 vehicle) {
        vehicle.start(); // Call the appropriate start method (polymorphism)
        System.out.println("Vehicle serviced.");
    }
}

// Main class to demonstrate the functionality
public class MainGarage {
    public static void main(String[] args) {
        // Create instances of Car3 and Motorcycle1
        Car3 car = new Car3();
        Motorcycle1 motorcycle = new Motorcycle1();

        // Create an instance of Garage
        Garage garage = new Garage();

        // Service the car
        System.out.println("Servicing the car:");
        garage.serviceVehicle(car);

        // Service the motorcycle
        System.out.println("\nServicing the motorcycle:");
        garage.serviceVehicle(motorcycle);
    }
}
