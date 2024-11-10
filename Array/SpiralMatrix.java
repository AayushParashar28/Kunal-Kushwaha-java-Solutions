import java.util.Scanner;

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
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        
    }
}
