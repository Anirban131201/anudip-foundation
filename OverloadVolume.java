import java.util.Scanner;

public class OverloadVolume {

    // Method to calculate the volume of a sphere
    double volume(double r) {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    // Method to calculate the volume of a cylinder
    double volume(double h, double r) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    // Method to calculate the volume of a rectangular box
    double volume(double l, double b, double h) {
        return l * b * h;
    }

    public static void main(String[] args) {
        OverloadVolume vol = new OverloadVolume();
        Scanner sc = new Scanner(System.in);

        // Calculate volume of a sphere
        System.out.print("Enter the radius of the sphere: ");
        double sphereRadius = sc.nextDouble();
        System.out.printf("The volume of the sphere is: %.2f%n", vol.volume(sphereRadius));

        // Calculate volume of a cylinder
        System.out.print("\nEnter the radius and height of the cylinder (separated by space): ");
        double cylinderRadius = sc.nextDouble();
        double cylinderHeight = sc.nextDouble();
        System.out.printf("The volume of the cylinder is: %.2f%n", vol.volume(cylinderHeight, cylinderRadius));

        // Calculate volume of a rectangular box
        System.out.print("\nEnter the length, breadth, and height of the cuboid (separated by space): ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.printf("The volume of the cuboid is: %.2f%n", vol.volume(length, breadth, height));

        sc.close();
    }
}
