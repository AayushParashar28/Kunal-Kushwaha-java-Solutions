import java.util.Arrays;
import java.util.Scanner;

public class MinimumCostLeetcode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array length : ");
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Array " + i + "st element :");
            arr[i] = s.nextInt();
        }

        int ans = minimumCost(arr);
        System.err.println(Arrays.toString(ans));
    }

    public static int minimumCost(int[] nums){
        return nums;
    }
}

