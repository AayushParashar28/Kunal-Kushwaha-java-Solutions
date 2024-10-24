import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array length : ");
        int n = s.nextInt();       

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Array " + i + "st element :");
            arr[i] = s.nextInt();
        }

        System.out.println("Your Original Array is :" + Arrays.toString(arr));
        int ans = maxSubArray(arr);
        System.out.println("Maximum Subarray Sum is : " + ans);
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0, maxi = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            if(sum > maxi){
                maxi = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }

        return maxi;
    }
}
