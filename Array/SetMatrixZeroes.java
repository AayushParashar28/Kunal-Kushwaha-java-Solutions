import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter ARRAY ROW: ");
        int n = s.nextInt();
        System.out.print("Enter Array Column: ");
        int m = s.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("Original Array:");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("Final Matrix:");
        setZeroes(arr);
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    static void setZeroes(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        boolean firstRowHasZero = false, firstColHasZero = false;

        // Check if first row has a zero
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 0) {
                firstRowHasZero = true;
                break;
            }
        }

        // Check if first column has a zero
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstColHasZero = true;
                break;
            }
        }

        // Use first row and column as markers
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set cells to zero based on markers
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set first row to zero if needed
        if (firstRowHasZero) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        // Set first column to zero if needed
        if (firstColHasZero) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
