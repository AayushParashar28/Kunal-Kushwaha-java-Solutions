import java.util.Arrays;
import java.util.Scanner;

public class PeakIndexInMountainArray {
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

        int ans = peakIndexInMountainArray(arr);
        System.out.println("Peak Index is : " + ans);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int temp = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                temp = mid;
                end = mid - 1;
            }
        }

        return temp;
    }
}
