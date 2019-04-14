package homework16;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 1.6 Различные задачи с матрицами
         * (найти диагональ, минимальные и максимальные элементы, сортировка, и пр)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Now you will enter how big the matrix should be.");
        System.out.println("Please enter amount of rows:");
        byte rows = scanner.nextByte();
        System.out.println("Please enter amount of columns:");
        byte columns = scanner.nextByte();
        System.out.println("Now please enter the numbers in the matrix with " + rows +
                " rows and " + columns + " columns:");
        int[][] inputData = new int[rows][columns];
        for (int i = 0; i < inputData.length; i++) { //rows
            for (int j = 0; j < inputData[i].length; j++) { //columns
                inputData[i][j] = scanner.nextInt();
            }
        }

//        MatrixDiagonal matrixDiagonal = new MatrixDiagonal();
//        System.out.println("\nThe result is: " + Arrays.toString(matrixDiagonal.diagonal(inputData)));
//
//        MinDigit minDigit = new MinDigit();
//        System.out.println("The min digit of array is: " + minDigit.minDigit(inputData));
//
//        MaxDigit maxDigit = new MaxDigit();
//        System.out.println("The max digit of array is: " + maxDigit.maxDigit(inputData));

        MatrixManipulation matrixManipulation = new MatrixManipulation();
        System.out.println("\nThe result is: " + Arrays.toString(matrixManipulation.diagonal(inputData)));
        System.out.println("The min digit of array is: " + matrixManipulation.minDigit(inputData));
        System.out.println("The max digit of array is: " + matrixManipulation.maxDigit(inputData));

    }
}
