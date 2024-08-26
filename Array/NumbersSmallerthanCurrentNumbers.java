import java.util.Arrays;
import java.util.Scanner;

public class NumbersSmallerthanCurrentNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array length : ");
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Array " + i + "st element :");
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int[] arr1 = SmallerNumbers(arr);
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] SmallerNumbers(int[] nums){
        int[] count = new int[101];
        int[] res  = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            count[nums[i]]++;
        }

        for(int i = 1 ; i < 100 ; i++){
            count[i] += count[i-1];
        }
        for(int i = 0 ; i < nums.length ; i++){
            int position = nums[i];
            if(position == 0){
                res[i] = 0;
            }
            else{
                res[i] = count[nums[i] - 1];
            }
        }
        return res;
    }
}
