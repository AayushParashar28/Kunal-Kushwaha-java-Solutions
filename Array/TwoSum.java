import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = s.nextInt();
        System.out.print("Enter Target: ");
        int target = s.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n ; i++){
            System.out.print("Enter Element of Index " + i + ":");
            arr[i] =  s.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        
        int[] ans = twosum(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] twosum(int[] nums , int target){
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
               sum = nums[i] + nums[j];
               if(sum == target){
                return new int[] {i,j}; 
               }
            }
        }
        return null;
    }
}
