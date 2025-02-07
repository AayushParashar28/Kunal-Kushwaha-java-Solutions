import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0 ; i < n ; i++) {
            System.out.print("Enter Array Element : ");
            arr[i] = s.nextInt();
        }

        System.out.println("Given Array is :" + Arrays.toString(arr));

        int ans = missingNum(arr);
        System.out.println("Missing Number is : " + ans);

    }

    static int missingNum(int[] arr){
        int n = arr.length;
        int sum = 0;
        int totalsum = (n*(n+1))/2;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return totalsum - sum;
    } 
}
