import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = s.nextInt();

        int[][] ans = generateMatrix(n);
        for(int i = 0 ; i < ans.length ; i++){
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
        }

    }

    static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int val = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = val++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = val++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = val++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = val++;
                }
                left++;
            }
        }
        return matrix;
    }
}
