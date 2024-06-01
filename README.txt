# Inverse Matrix Java Program
- This program demonstrates finding the inverse of a given matrix using 'BigDecimal' values with the Apache Commons Math library

# Approach used to solve the problem
- Usage of Scanner class to accept user input for the dimensions and the values in the matrix
- To create the matrix using 'BigDecimal' values, createBigDecimalMatrix method is used through conversion of BigDecimal array (matrixData) into a RealMatrix using Apache Commons Math library's MatrixUtils.createRealMatrix method
- After the creation of RealMatrix, MatrixUtils.inverse method is used to automatically find the inverse of the matrix without programming it step-by-step
- Then, the inverse of the matrix is printed to the console

# Assumptions made
- User will input 3x3 as dimensions but it can also be tested with different dimensions of a square matrix for flexibility
- User will input valid 'BigDecimal' values for each element in the matrix to ensure stability and accuracy
- In the project's dependencies, the Apache Commons Math library ('commons-math3) is correctly installed and included

# Specific instructions for running the program
1. Clone or download the Java program and paste it into an IDE of your choice.
2. Execute the main class MatrixInverse using Java.

# How to compile and run the program
- To compile the program, make sure that Java Development Kit is installed in your system as well as Apache Commons Math version 3.
- To run the program, enter the number of rows and columns when prompted. Enter each matrix value of specific indices as prompted. After all the required values are inputted, the program will calculate and display the inverse of the matrix.

# External libraries or dependencies used
- Apache Commons Math 3 (MatrixUtils class for matrix creation ('createRealMatrix') and matrix inversion ('inverse')
