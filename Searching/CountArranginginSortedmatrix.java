import java.util.Arrays;
import java.util.Scanner;

public class CountArranginginSortedmatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Row :");
        int n = s.nextInt();

        System.out.print("Enter Array Columns : ");
        int m = s.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter Array at Row  " + i + " of coln " + j + " : ");
                arr[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        int ans = countNegatives(arr);
        System.out.println("\n\nThe number of ways to arrange the matrix is : " + ans + "\n\n");

    }

    public static int countNegatives(int[][] grid) {
        int rows = grid.length;
        int row = 0;
        int col = grid[0].length - 1;

        int count = 0;
        while (row < rows && col >= 0) {
            if (grid[row][col] >= 0) {
                row++;
            } else {
                count += rows - row;
                col--;
            }
        }
        return count;

    }
}