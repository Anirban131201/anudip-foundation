package myMavenProjectPackage1;

public class Multiplication {
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();
        int result = multiplication.multiply(5, 3);
        System.out.println("The result of multiplying 5 and 3 is: " + result);
    }
}

