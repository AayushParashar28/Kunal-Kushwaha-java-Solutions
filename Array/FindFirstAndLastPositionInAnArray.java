import java.util.Scanner;

public class FindFirstAndLastPositionInAnArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the element to find the first and last position");
        int target = s.nextInt();
        int[] result = searchRange(arr, target);
        System.out.println("First position of the element is: " + result[0]);
        System.out.println("Last position of the element is: " + result[1]);

    }

    public static int[] searchRange(int[] nums, int target) {
        int[] arr = { -1, -1 };

        int start = search(nums, target, true);
        int end = search(nums, target, false);

        arr[0] = start;
        arr[1] = end;

        return arr;
    }

    public static int search(int[] nums, int target, boolean searcharray) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (searcharray) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return ans;
    }
}
