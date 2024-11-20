import java.util.Arrays;
import java.util.Scanner;

public class ProductofArrayExceptItself{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = s.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){
            System.out.print("Enter Element : ");
            arr[i] = s.nextInt();
        }
        System.out.print(Arrays.toString(arr));
        
        int[] ans = productExceptSelf(arr);
        System.out.print("Product Array is : " + Arrays.toString(ans) );
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        left[0] = 1;
        for(int i = 1 ; i < n ; i++){
            left[i] =  left[i - 1] * nums[i - 1];
        }

        int[] right = new int[n];
        right[n - 1] =  1 ;
        for(int i = n - 2 ; i > -1 ; i--){
            right[i] = right[i + 1] * nums[i + 1]; 
        }

        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] =  left[i] * right[i];
        }

        return arr;
    }

}