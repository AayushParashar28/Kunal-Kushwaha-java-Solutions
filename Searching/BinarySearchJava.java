import java.util.Scanner;

public class BinarySearchJava {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index " + result);
        }

    }

    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1 ;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
}
