import java.util.Scanner;

public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = S.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = S.nextInt();
        }
        System.out.print("Enter Target Sum : ");
        int target = S.nextInt();

        int[] ans = twoSum(arr, target);
        System.out.println("Elements at indices " + ans[0] + " and " + ans
        [1] + " add up to " + target);

    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int[] res = new int[2];

        while (start <= end) {

            if (numbers[start] + numbers[end] == target) {
                break;
            } else if (numbers[start] + numbers[end] < target) {
                start++;
            } else {
                end--;
            }
        }
        res[0] = start + 1;
        res[1] = end + 1;
        return res;
    }
}