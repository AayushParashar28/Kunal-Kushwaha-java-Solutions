import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationofArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array length : ");
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Array " + i + "st element :");
            arr[i] = s.nextInt();
        }

        int arr1[] = ConcatenateArray(arr);
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] ConcatenateArray(int[] nums) {
        int len = nums.length;

        int[] array = new int[2 * len];

        for (int i = 0; i < len; i++) {
            array[i] += nums[i];
        }
        int index = len;
        for(int i = 0; i<len ; i++){
            array[index] = nums[i];
            index++;
        }
        return array;
    }
}
