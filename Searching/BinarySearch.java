import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.print("Enter Target : ");
        int target = s.nextInt();
        
        int ans = binarysearch(arr, target);
        System.out.print("Element found at Index : " + ans);

    }

    public static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end ){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start = mid + 1;
            }
            else{
                end = mid -1 ;
            }
        }
        return -1;
    }
}
