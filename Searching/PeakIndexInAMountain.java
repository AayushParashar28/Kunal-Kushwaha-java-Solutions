import java.util.Scanner;

public class PeakIndexInAMountain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int ans = peakIndexInMountainArray(arr);
        System.out.println("Peak Index is :" + ans);
        
    }

    public  static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        int temp = -1;
        while(start<= end){
            int mid = start + ( end - start )/2;

            if(arr[mid] < arr[mid + 1]){
                start = mid+1;
            }

            else if (arr[mid+1]<arr[mid]){
                temp = mid;
                end = mid - 1;
            }
        }
        return temp;
    }
}