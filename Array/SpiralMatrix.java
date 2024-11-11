import java.util.Scanner;
import java.util.*;

public class SpiralMatrix {
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

        List<Integer> ans = new ArrayList<>();
        ans = spiralOrder(arr);
        System.out.println("New Spiral Order is : " + ans);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0 , bottom = matrix.length -1 ;
        int left = 0 , right = matrix[0].length - 1;

        while(left <= right && top <= bottom ){
            for(int i = left ; i <= right ; i++){
                result.add(matrix[top][i]);
            }
            top++;

            for(int i = top ; i <= bottom ; i++){
                result.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int i = right ; i>=left ; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom ; i >= top ; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
