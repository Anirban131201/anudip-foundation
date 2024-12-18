// Abstract class Shape
abstract class Shape1 {
    // Abstract method to calculate area
    public abstract double calculateArea();
}

// Subclass Circle
class Circle1 extends Shape1 {
    private double radius;

    // Constructor
    public Circle1(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Rectangle
class Rectangle1 extends Shape1 {
    private double length;
    private double width;

    // Constructor
    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of calculateArea for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class MainCalculateArea {
    public static void main(String[] args) {
        // Create a Circle object
        Circle1 circle = new Circle1(5.0);
        // Create a Rectangle object
        Rectangle1 rectangle = new Rectangle1(4.0, 6.0);

        // Calculate and print the area of the Circle
        System.out.printf("Area of the Circle: %.2f", circle.calculateArea());
        // Calculate and print the area of the Rectangle
        System.out.printf("\nArea of the Rectangle: %.2f", rectangle.calculateArea());
    }
}
