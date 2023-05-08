public class Matrix {
    
    //This class will essentially be the "heart" of the program
    
    private int firmValA;
    private int firmValB;
    int[][] mat;

    public Matrix(int[][] matrix){
        mat = matrix;
        for(int row = 0; row < matrix[0].length; row++){
            for(int col = 0; col < matrix.length - 1; col++){
                firmValA = 0;
                firmValB = 0;
                matrix[row][col] = firmValA;
                matrix[row][col+1] = firmValB;
                col++;
            }
        }
    }
    public int[] getRow(int x){
        int[][] ma = mat; 
        return ma[x-1];
    }
}