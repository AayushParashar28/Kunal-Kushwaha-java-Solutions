import java.util.Arrays;
import java.util.Scanner;

public class KthmissingPositiveNumber{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = s.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            System.out.print("Enter Element " + (i+1) + " : ");
            arr[i] = s.nextInt();
        }

        System.out.println("Array is : " + Arrays.toString(arr));

        System.out.print("Enter Kth Number : ");
        int k = s.nextInt();

        int ans = findKthPositive(arr, k);
        System.out.println("Kth Missing Positive Number is : " + ans);
    }

    public static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] - mid - 1< k){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }

        return start + k;
    }
}