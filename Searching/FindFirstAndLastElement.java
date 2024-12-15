import java.util.Scanner;

public class FindFirstAndLastElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + "th element : ");
            arr[i] = s.nextInt();
        }
        System.out.print("Enter Target :");
        int target = s.nextInt();

        int[] ans = searchRange(arr, target);
        System.out.println("First Occurrence of " + target + " is at index " + ans[0]);
        System.out.println("Last Occurrence of " + target + " is at index " + ans[1]);

    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };

        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);

        return ans;
    }

    static int search(int[] nums, int target, boolean range) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if (range) {
                    end = end - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
