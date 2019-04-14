package homework16;

public class MaxDigit {

    public int maxdigit(int[][] inputData) {
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
}
