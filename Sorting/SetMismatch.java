import java.util.Arrays;
import java.util.Scanner;

public class SetMismatch {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Array Element : ");
            arr[i] = s.nextInt();
        }

        System.out.println("Given Array is :" + Arrays.toString(arr));

        int[] ans = findError(arr);
        System.out.println("Missing Element is : " + ans[0] + " and Duplicate Element is : " + ans[1]);
    }

    static int[] findError(int[] arr) {
         int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return new int[] {arr[j] , j+1};
            }
        }

        return new int[] {-1,-1};
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
