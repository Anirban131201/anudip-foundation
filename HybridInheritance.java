// Base interface
interface Device {
    void turnOn();
}

// Interface extending Device
interface Phone extends Device {
    void makeCall();
}

// Another interface extending Device
interface Camera extends Device {
    void takePhoto();
}

// Class implementing multiple interfaces
class Smartphone implements Phone, Camera {
    @Override
    public void turnOn() {
        System.out.println("Smartphone is turning on.");
    }

    @Override
    public void makeCall() {
        System.out.println("Making a call from the smartphone.");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo with the smartphone.");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone();
        myPhone.turnOn();     // Call the turnOn method
        myPhone.makeCall();   // Call the makeCall method
        myPhone.takePhoto();  // Call the takePhoto method
    }
}

