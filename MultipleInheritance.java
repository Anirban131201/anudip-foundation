// Define the first interface
interface Animal {
    void eat();
}

// Define the second interface
interface Mammal {
    void walk();
}

// Implement both interfaces in a class
class Dog implements Animal, Mammal {
    @Override
    public void eat() {
        System.out.println("Dog eats.");
    }
    
    @Override
    public void walk() {
        System.out.println("Dog walks.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Call the eat method
        myDog.walk(); // Call the walk method
    }
}

