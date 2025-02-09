import java.util.Arrays;
import java.util.Scanner;

public class FindAllMissing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array Size: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the elements of the array: ");
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));


    }

    static int[] find(int[] arr){
        
    }
}