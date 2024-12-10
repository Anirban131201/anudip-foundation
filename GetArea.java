// Base class
class Shape {
    double getArea() {
        return 0; // Default implementation
    }
}

// Subclass for Circle
class Circle extends Shape {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass for Square
class Square extends Shape {
    private int length;

    Square(int length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return length * length;
    }
}

// Subclass for Rectangle
class Rectangle extends Shape {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }
}

public class GetArea {
    public static void main(String[] args) {
        // Instantiate Circle with radius 5
        Circle circle = new Circle(5);
        System.out.printf("Circle area: %.2f%n", circle.getArea());

        // Instantiate Square with length 4
        Square square = new Square(4);
        System.out.printf("Square area: %.2f%n", square.getArea());

        // Instantiate Rectangle with width 3 and height 7
        Rectangle rectangle = new Rectangle(3, 7);
        System.out.printf("Rectangle area: %.2f%n", rectangle.getArea());
    }
}

