import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter ARRAY ROW: ");
        int n = s.nextInt();
        System.out.print("Enter Array Column: ");
        int m = s.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("Enter " + i + "th element of Array: ");
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("Original Array:");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        int[][] arr1 = transpose(arr);
        System.out.println("Transposed Array:");
        for(int i = 0 ; i < arr1.length ; i++){
            System.out.println(Arrays.toString(arr1[i]));
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int a = matrix[0].length;
        int b = matrix.length;
        int[][] ans = new int[a][b];

        for(int i = 0; i<a ; i++){
            for(int j = 0; j<b;j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}
