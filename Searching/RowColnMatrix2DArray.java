import java.util.Arrays;
import java.util.Scanner;

public class RowColnMatrix2DArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Row : ");
        int n = s.nextInt();
        System.out.print("Enter Array Coln : ");
        int m = s.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter Element [" + i + "][" + j + "] : ");
                arr[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.print("Enter Target Number : ");
        int target = s.nextInt();

        int[] ans = findRowColn(arr, target);
        if (ans.length == 0) {
            System.out.println("Target Number Not Found");
        } else
            System.out.println("Target Number Found at Row : " + ans[0] + " Col : " + ans[1]);
    }

    static int[] findRowColn(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 1;

        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[] { r, c };
            }

            if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }

        return new int[] { -1, -1 };
    }
}