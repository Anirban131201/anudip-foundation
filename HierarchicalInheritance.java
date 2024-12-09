// Base class
class Vehicle {
    void fuel() {
        System.out.println("This vehicle uses fuel.");
    }
}

// Derived class 1
class Car extends Vehicle {
    void numberOfDoors() {
        System.out.println("Car has 4 doors.");
    }
}

// Derived class 2
class Motorcycle extends Vehicle {
    void typeOfHandlebars() {
        System.out.println("Motorcycle has straight handlebars.");
    }
}

// Derived class 3
class Truck extends Vehicle {
    void loadCapacity() {
        System.out.println("Truck has a large load capacity.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Truck truck = new Truck();

        // Car inherits fuel() from Vehicle and has its own numberOfDoors() method
        car.fuel();
        car.numberOfDoors();

        // Motorcycle inherits fuel() from Vehicle and has its own typeOfHandlebars() method
        motorcycle.fuel();
        motorcycle.typeOfHandlebars();

        // Truck inherits fuel() from Vehicle and has its own loadCapacity() method
        truck.fuel();
        truck.loadCapacity();
    }
}

