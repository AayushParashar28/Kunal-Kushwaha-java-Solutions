import java.util.Arrays;
import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size :");
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter elements at " + i + "th index : ");
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.print("Enter Target Number :");
        int target = s.nextInt();

        int ans = searchPosition(arr, target);
        System.out.println("Target Number Position : " + ans);
    }

    static int searchPosition(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return start;
    }
}
