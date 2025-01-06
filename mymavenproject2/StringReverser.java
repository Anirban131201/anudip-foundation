package myMavenProjectPackage2;

import java.util.Scanner;

public class StringReverser {
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = scanner.nextLine();

        StringReverser reverser = new StringReverser();
        String result = reverser.reverse(input);
        System.out.println("Reversed string: " + result);

        scanner.close();
    }
}

