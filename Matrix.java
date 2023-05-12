import java.util.Scanner;

public class Matrix {

    // This class will essentially be the "heart" of the program

    Scanner sc = new Scanner(System.in);
    private int firmVal;

    int[][] mat;

    public Matrix(int[][] matrix) {
        mat = matrix;

        for (int row = 0; row < matrix[0].length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                firmVal = 0;
                firmVal = getNumbers();
                matrix[row][col] = firmVal;
            }
        }
    }

    public int[] getRow(int x) {
        int[][] ma = mat;
        return ma[x - 1];
    }

    public int getIndex() {
        int val = 0;
        int x;
        int y;
        System.out.println(
                "Enter the coordiantes of the matrix would you like to access. Enter the row first, then the column");
        System.out.println("Row:");
        x = sc.nextInt();
        System.out.println("Column:");
        y = sc.nextInt();
        val = mat[x - 1][y - 1];
        return val;
    }

    public boolean isDominantStrat(int a, int b, int c, int d){
        if(a >= b && c > d){
            return true;
        } else if (b >= a && d > c){
            return true;
        } else if (b > a && d >= c){
            return true;
        } else if (a > b && c >= d){
            return true;
    } else {
        return false;
    }
}
    public boolean nashEquilibrium(Matrix a, Matrix b, int c, int d, int e, int f, int g, int h, int i, int j){
        if(a.isDominantStrat(c, d, e, f) && b.isDominantStrat(g, h, i, j)){
            return true;
        } else {
            return false;
        }
    }
    public int getNumbers(){
        System.out.println("Enter the numbers of the current quadrent");
        return sc.nextInt();
    }
}