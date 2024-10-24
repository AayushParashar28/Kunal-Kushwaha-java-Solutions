import java.util.Arrays;
import java.util.Scanner;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter ARRAY ROW: ");
        int n = s.nextInt();
        System.out.print("Enter Array Column: ");
        int m = s.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter " + i + "th element of Array: ");
                arr[i][j] = s.nextInt();
            }
        }

        System.out.print("Enter new ARRAY ROW: ");
        int r = s.nextInt();
        System.out.print("Enter new Array Column: ");
        int c = s.nextInt();
        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        int[][] arr1 = matrixReshape(arr , r , c);
        System.out.println("Reshaped Array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;
        if(rows*cols != r*c) return mat;
        int[][] output = new int[r][c];
        int output_rows = 0;
        int output_cols = 0;
       
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                output[output_rows][output_cols] = mat[i][j];
                output_cols++;
               
                if(output_cols == c)
                {
                    output_cols = 0;
                    output_rows++;
                }
            }
        }
        
        return output;
    }
}
