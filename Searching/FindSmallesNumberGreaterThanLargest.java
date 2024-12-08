import java.util.Arrays;
import java.util.Scanner;

public class FindSmallesNumberGreaterThanLargest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = s.nextInt();
        char[] arr = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the elements of the array " + "at index " + i + ": ");
            arr[i] = s.next().charAt(0);
        }

        System.out.println("Your Array is :" + Arrays.toString(arr));

        System.out.print("Enter the target character: ");
        char target = s.next().charAt(0);

        char ans = nextGreatestLetter(arr, target);
        System.out.println("The smallest number greater than the target is: " + ans);

    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return letters[start % letters.length];

    }
}
