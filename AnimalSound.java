// Superclass Animal
class Animal1 {
    // Method to be overridden
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Dog
class Dog1 extends Animal1 {
    // Overriding the makeSound method for Dog
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass Cat
class Cat extends Animal1 {
    // Overriding the makeSound method for Cat
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        // Create objects of Dog and Cat
        Dog1 dog = new Dog1();
        Cat cat = new Cat();

        // Call the makeSound method on each object
        dog.makeSound(); // Output: The dog barks.
        cat.makeSound(); // Output: The cat meows.
    }
}
