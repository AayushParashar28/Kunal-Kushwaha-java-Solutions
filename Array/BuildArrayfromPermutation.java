import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayfromPermutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array length : ");
        int n = s.nextInt();

        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter Array " + i + "st element :");
            arr[i] = s.nextInt();
        }

        buildArray(arr);
      
        
    }

    public static void buildArray(int[] nums){
        int n = nums.length;
        for(int i = 0 ; i<n ; i++){
            nums[i] = nums[i] + (nums[nums[i]]%n) *n;
        }
        for(int i = 0 ; i<n ; i++){
            nums[i] = nums[i]/n;
        }
        System.out.print("New Arrays is : ");
        System.err.println(Arrays.toString(nums));
    }
}
