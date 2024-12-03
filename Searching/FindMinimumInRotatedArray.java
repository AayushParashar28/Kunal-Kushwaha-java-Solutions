import java.util.Scanner;

public class FindMinimumInRotatedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int ans = findMin(arr);
        System.out.println("Minimum Element in Array is : " + ans);
    }

    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;

            } else {
                end = mid;
            }
        }
        return nums[end];
    }
}
