import java.util.Scanner;

/*TO TEST THE PROGRAM PLEASE ENTER THE VALUES IN THE FOLLOWING ORDER:
 * -6, 0, -10, -1
 * -6, -10, 0, -1
 * to have a better understanding behind the concept of game theory
 * watch this video:
 * https://www.youtube.com/watch?v=NdITTDl5coE
 */
public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Loading.printLoading(1);

        System.out.println(
                "Welcome to the game theory calculator, where you can calculate whether a firm has a dominant strategy or if nash equilibrium is present");

        System.out.println("Enter the values of Firm A in the matrix in row by column order");

        Matrix firmAMatrix = new MatrixTwoByTwo();

        System.out.println("Enter the values of Firm B in the matrix in row by column order");

        Matrix firmBMatrix = new MatrixTwoByTwo();

        System.out.print("\033[H\033[2J");

        firmAMatrix.theMegatrix(firmAMatrix, firmBMatrix);

        if (firmAMatrix.dominantStratPresent(firmAMatrix, firmBMatrix)) {
            System.out.println("there is a dominant strategy present for firm A");
        } else {
            System.out.println("no dominant strategy present for firm A");
        }
        if (firmBMatrix.dominantStratPresent(firmBMatrix, firmAMatrix)) {
            System.out.println("there is a dominant strategy present for firm B");
        } else {
            System.out.println("no dominant strategy present for firm B");
        }
        if (firmAMatrix.nashEquilibrium(firmAMatrix, firmBMatrix)) {
            System.out.println("there is nash equilibrium present");
        }
    }
}