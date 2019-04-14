package homework16;

public class MinDigit {

    public int mindigit(int[][] inputData) {
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
