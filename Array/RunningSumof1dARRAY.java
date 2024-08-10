import java.util.Arrays;
import java.util.Scanner;

public class RunningSumof1dARRAY {
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
        int[] arr1 = RunningSum(arr);
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] RunningSum(int[] nums) {
        int[] array = new int[nums.length];
        array[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            array[i] = array[i - 1] + nums[i];
        }
        return array;

    }
}
