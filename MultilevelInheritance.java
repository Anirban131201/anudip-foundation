// Base class
class Appliance {
    void turnOn() {
        System.out.println("Appliance is turned on.");
    }
}

// Derived class 1
class WashingMachine extends Appliance {
    void washClothes() {
        System.out.println("Washing clothes.");
    }
}

// Derived class 2
class SmartWashingMachine extends WashingMachine {
    void connectToWifi() {
        System.out.println("Connected to Wi-Fi.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        SmartWashingMachine smartWasher = new SmartWashingMachine();

        // SmartWashingMachine inherits methods from both Appliance and WashingMachine
        smartWasher.turnOn();        // Method from Appliance class
        smartWasher.washClothes();   // Method from WashingMachine class
        smartWasher.connectToWifi(); // Method from SmartWashingMachine class
    }
}
