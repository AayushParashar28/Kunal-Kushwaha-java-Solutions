import java.util.Arrays;
import java.util.Scanner;

public class BuildArray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.err.print("Enter Array Size : ");
        int n = s.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n ; i++){
            arr[i] = s.nextInt();
        }

        System.err.println(Arrays.toString(arr));
    }
}
