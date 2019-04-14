package homework16;

public class MatrixManipulation {

    public int[] diagonal( int[][] inputData){
        int[]diagonal= new int[inputData.length];

        for (int i = 0; i <inputData.length ; i++) {
            diagonal[i]=inputData[i][i];
        }
        return diagonal;
    }

    public int maxDigit(int[][] inputData) {
        int max = inputData[0][0];
        //матрица может быть не квадратная
        //inputData.length -number of rows
        for (int i = 0; i < inputData.length; i++) {
            //inputData[i].length number of elements in i row
            for (int j = 0; j < inputData[i].length; j++) {
                if (max < inputData[i][j]) {
                    max = inputData[i][j];
                }
            }
        }
        return max;
    }

    public int minDigit(int[][] inputData) {
        int min = inputData[0][0];
        //матрица может быть не квадратная
        //inputData.length -number of rows
        for (int i = 0; i < inputData.length; i++) {
            //inputData[i].length number of elements in i row
            for (int j = 0; j < inputData[i].length; j++) {
                if (min > inputData[i][j]) {
                    min = inputData[i][j];
                }
            }
        }
        return min;
    }
}
