import java.util.*;
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = s.nextInt();
        System.out.println("Enter Target: ");
        int target = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int ans = linearSearch(arr, target);
        System.out.println("Target found at Index : " +ans);
    }

    public static int linearSearch(int[] arr, int target) {
        if (arr.length == 0)
            return -1;
       
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
