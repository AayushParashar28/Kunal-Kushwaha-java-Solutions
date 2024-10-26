import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array length : ");
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Array " + i + "st element :");
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int[] ans = plusOne(arr);
        System.out.println("New Array :" + Arrays.toString(ans));
    }

    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1 ; i >= 0 ; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0 ;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
