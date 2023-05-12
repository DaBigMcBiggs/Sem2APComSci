import java.util.Scanner;

public class Matrix {

    // This class will essentially be the "heart" of the program

    // initialized variables
    Scanner sc = new Scanner(System.in);
    private int firmVal;

    int[][] mat;

    // constructor
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

    // getter
    public int[] getRow(int x) {
        int[][] ma = mat;
        return ma[x - 1];
    }

    public int getIndex(int x, int y) {
        int val = mat[x][y];
        return val;
    }

    // this is used for both nash equilibrium and to findout whether there is a
    // dominant strategy for a firm
    public boolean isDominantStrat(int a, int b, int c, int d) {
        if (a >= b && c > d) {
            return true;
        }
        if (b >= a && d > c) {
            return true;
        }
        if (b > a && d >= c) {
            return true;
        }
        if (a > b && c >= d) {
            return true;
        }
        return false;
    }

    public boolean dominantStratPresent(Matrix a, Matrix b) {
        if (isDominantStrat(a.getIndex(0, 0), b.getIndex(0, 0), a.getIndex(0, 1), b.getIndex(0, 1))) {
            return true;
        } else if (isDominantStrat(a.getIndex(1, 0), b.getIndex(1, 0), a.getIndex(1, 1), b.getIndex(1, 1))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean nashEquilibrium(Matrix a, Matrix b) {
        if (isDominantStrat(a.getIndex(0, 0), b.getIndex(0, 0), a.getIndex(0, 1), b.getIndex(0, 1))) {
            if (isDominantStrat(a.getIndex(1, 0), b.getIndex(1, 0), a.getIndex(1, 1), b.getIndex(1, 1))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // the numbers you want to input
    public int getNumbers() {
        System.out.println("Enter the numbers of the current quadrent");
        return sc.nextInt();
    }

    // setter
    public void theMegatrix(Matrix a, Matrix b) {
        System.out.print("[{" + a.getIndex(0, 0) + "," + b.getIndex(0, 0) + "}");
        System.out.println("{" + a.getIndex(0, 1) + "," + b.getIndex(0, 1) + "}]");
        System.out.print("[{" + a.getIndex(1, 0) + "," + b.getIndex(1, 0) + "}");
        System.out.println("{" + a.getIndex(1, 1) + "," + b.getIndex(1, 1) + "}]");
    }
}