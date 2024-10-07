import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DetermineAmatrixCanBeRotated {
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

        int[][] arr1 = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("Enter " + i + "th element of Array: ");
                arr1[i][j] = s.nextInt();
            }
        }
        System.out.println("Original Array:");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(Arrays.toString(arr1[i]));
        }
        DetermineAmatrixCanBeRotated obj = new DetermineAmatrixCanBeRotated();
        boolean ans = obj.findRotation(arr, arr1);
        System.out.println(ans);
    }

     public static boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0 ; i < 4 ; i++){
            if(check(mat,target)){
                return true;
            }
            rotate(mat);
        }
        return false;
    }

    public static boolean check(int[][] matrix, int[][] target){
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j =0; j < matrix.length ; j++){
                if(matrix[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    static void rotate(int[][] matrix){
        int n = matrix.length;
        for(int i = 0 ; i < n; i++){
           for(int j = 0; j < i ; j++){
               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
           }
        }
        int start = 0 ;
        int end = matrix.length - 1;
        while(start <= end){
        for(int row = 0; row < n ; row++){
            int temp = matrix[row][start];
            matrix[row][start] = matrix[row][end];
            matrix[row][end] = temp;
        }
        start++;
        end--;
        }
    }
}
