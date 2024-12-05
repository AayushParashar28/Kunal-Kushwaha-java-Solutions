import java.util.Scanner;

public class SplitArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Array Elements at index " + i + " : ");
            arr[i] = s.nextInt();
        }

        boolean ans = isPossibleToSplit(arr);
        if (ans) {
            System.out.println("Array can be split into two subarrays with equal sum");
        } else
            System.out.println("Array cannot be split into two subarrays with equal sum");
    }

    public static boolean isPossibleToSplit(int[] nums) {
        int[] cn = new int[101];
        for (int i = 0; i < nums.length; i++) {
            cn[nums[i] - 1]++;
            if (cn[nums[i] - 1] > 2) {
                return false;
            }
        }
        return true;
    }
}
