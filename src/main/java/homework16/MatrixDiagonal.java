package homework16;

public class MatrixDiagonal {
    /**
     * finding a diagonal (more like an array of numbers that lie on that diagonal) from a 2D matrix
     * @return diagonal
     */
    public int[] diagonal( int[][] inputData){
       int[]diagonal= new int[inputData.length];

        for (int i = 0; i <inputData.length ; i++) {
            diagonal[i]=inputData[i][i];
        }
        return diagonal;
    }
}
