import java.util.Arrays;
import java.util.Scanner;

public class ShuffletheArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array length : ");
        int n = s.nextInt();
        int m = n/2;
       

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Array " + i + "st element :");
            arr[i] = s.nextInt();
        }

        
        int arr1[] = ShuffleArray(arr , m );
        System.out.println(Arrays.toString(arr1));
    }
    public static int[] ShuffleArray(int[] nums, int n){
         int[] arr = new int[2*n];

         for(int i = 0 ; i < n ; i++){
            arr[2*i] = nums[i];
            arr[2*i + 1] = nums[i + n];
         }
        return arr ;
    } 
}
