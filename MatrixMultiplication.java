import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read dimensions of the matrices
        System.out.println("Enter the number of rows and columns for the matrices:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Initialize the matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

        // Read elements of the first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Read elements of the second matrix
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Perform matrix multiplication
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < cols; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display the result matrix
        System.out.println("The resulting matrix after multiplication is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        // Close the Scanner object
        sc.close();
    }
}
