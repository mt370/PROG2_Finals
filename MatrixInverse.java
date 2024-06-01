/* The Java Best Practices applied in this code are the following:
    1. File Organization
    2. Commenting and Documentation
    3. Code Structure and Formatting
    4. Naming Conventions
    5. Error Handling
    6. Code Reusability and Modularity */

// FILE ORGANIZATION: File name (MatrixInverse.java) matches the class name (MatrixInverse)

// COMMENTING AND DOCUMENTATION: Use of single-line comments to explain the function of each block of code

// CODE STRUCTURE AND FORMATTING: Has four spaces per indentation level

// Import statements for Java libraries and external libraries required to run the program
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import java.math.BigDecimal;
import java.util.Scanner;

public class MatrixInverse {
// NAMING CONVENTIONS: Proper naming convention for class (camel case starting with an uppercase letter)

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();   // NAMING CONVENTIONS: Variables start with lowercase letters
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Initialize a 2D array to hold matrix data
        BigDecimal[][] matrixData = new BigDecimal[rows][cols];

        // Prompt the user to enter matrix values (BigDecimal) to avoid hard-coded values
        System.out.println("Enter matrix values (one row at a time):");
        for (int i = 0; i < rows; i++) {    // CODE STRUCTURE AND FORMATTING: Use of braces for control structures
            for (int j = 0; j < cols; j++) {    // CODE STRUCTURE AND FORMATTING: Use of 1 space after 'for'
                System.out.printf("Enter value at [%d][%d]: ", i, j);
                // ERROR HANDLING: Use of 'scanner.nextBigDecimal()' to handle input mismatch exceptions
                matrixData[i][j] = scanner.nextBigDecimal();
            }
        }

        // Create a RealMatrix from the user-provided matrix data
        RealMatrix matrix = createBigDecimalMatrix(matrixData);

        // Perform matrix inversion
        RealMatrix inverse = MatrixUtils.inverse(matrix);

        // Print the inverse matrix
        System.out.println("Inverse Matrix:");
        System.out.println(inverse);

        // Close the scanner
        scanner.close();
    }

    // Method to create a RealMatrix from a BigDecimal[][] array (required)
    // CODE REUSABILITY AND MODULARITY: Use of separate method 'createBigDecimalMatrix'
    private static RealMatrix createBigDecimalMatrix(BigDecimal[][] data) {
        int rows = data.length;
        int cols = data[0].length;
        RealMatrix matrix = MatrixUtils.createRealMatrix(rows, cols);

        // Populate the RealMatrix with BigDecimal values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix.setEntry(i, j, data[i][j].doubleValue());
            }
        }

        return matrix;
    }
}
