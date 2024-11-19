import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int row = s.nextInt();

        System.out.print("Enter Column : ");
        int col = s.nextInt();

        int[][] arr = new int[row][col];
        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] =  s.nextInt();
            }
        }
        System.out.println("Original Array:");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
 
        System.out.print("Enter Target : ");
        int target = s.nextInt();

        int[] ans = search(arr, target);
        System.out.println( " Element is present at index " + Arrays.toString(ans));


    }

    public static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] == target){
                    return new int[] {i,j};
                }
            }
        }

        return new int[] {-1,-1};
    }
}