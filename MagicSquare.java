import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in the size of the matrix (NxN): ");
        int size = reader.nextInt();

        int[][] magicCube = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Fill in the numbers: ");
                magicCube[i][j] = reader.nextInt();
            }
        }
        //create araays to store results
        int[] resultsMatrixRow = new int[magicCube.length];
        int[] resultsMatrixCol = new int[magicCube.length];
        int[] resultMatrixDiag = new int[2];
        // sum rows and columns in array and store in results arrays.
        int sum = 0;
        int[] colSum = new int[magicCube[0].length];
        for (int i = 0; i < magicCube.length; i++) {
            for (int j = 0; j < magicCube[i].length; j++) {
                sum += magicCube[i][j];
                colSum[j] += magicCube[i][j];
            }
            resultsMatrixRow[i] = sum;
            sum = 0;
        }
        for (int k = 0; k < colSum.length; k++) {
            resultsMatrixCol[k] = colSum[k];
        }
        // sum diagonal 1 and store in results array
        int diagSum = 0;
        for (int row = 0; row < magicCube.length; row++) {
            diagSum += magicCube[row][row];
        }resultMatrixDiag[0] = diagSum;
        // sum diagonal 2 and store in results array
        int diagSum1 = 0;
        for (int col = 0; col < magicCube.length; col++ ) {
            diagSum1 += magicCube[col][magicCube.length - col - 1];
        }resultMatrixDiag[1] = diagSum1;
        // draw the matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(magicCube[i][j] + " ");
            }System.out.println("");
        }
        // check the $*$*$*MAGIC*$*$*$*$
        for (int j = 0; j < resultsMatrixRow.length; j++) {
            if (resultsMatrixCol[0] == resultsMatrixRow[j] && resultsMatrixCol[0] == resultsMatrixCol[j] && resultsMatrixCol[0] == resultMatrixDiag[j]) {
            } else {
                System.out.println("NOT MAGIC :(((((");
                return;
            }
        }
        System.out.println("MAGIC :)))))))))");


        /*//prints the array
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(magicCube[i][j] + " ");
            }System.out.println("");
        }*/

    }
}
