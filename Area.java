import java.util.Scanner;

public class Area {

    // Method to calculate the area of a triangle
    double area(double base, double height) {
        System.out.print("The area of the triangle is: ");
        return 0.5 * base * height;
    }

    // Method to calculate the area of a rectangle
    int area(int length, int breadth) {
        System.out.print("The area of the rectangle is: ");
        return length * breadth;
    }

    // Method to calculate the area of a circle
    double area(double radius) {
        double pi = 3.14159; // value for π
        System.out.print("The area of the circle is: ");
        return pi * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs for triangle
        System.out.print("Enter the base and height of the triangle (separated by space): ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        // Inputs for rectangle
        System.out.print("Enter the length and breadth of the rectangle (separated by space): ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        // Input for circle
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Creating an object of the Area class
        Area a = new Area();

        // Displaying the results
        System.out.println(a.area(base, height));
        System.out.println(a.area(length, breadth));
        System.out.println(a.area(radius));

        sc.close();
    }
}

