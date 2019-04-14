package homework16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 1.6 Различные задачи с матрицами
         * (найти диагональ, минимальные максимальные элементы, сортировка, и пр)
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
            for (int j = 0; j < inputData.length; j++) { //columns
                inputData[rows][columns] = scanner.nextInt();
            }
        }

        MatrixDiagonal matrixDiagonal = new MatrixDiagonal();
        System.out.println("The result is: " + matrixDiagonal.diagonal(rows,columns,inputData));




    }
}
