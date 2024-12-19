import java.util.Scanner;

public class SingleElementInArray{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            System.out.print("Enter element at " + i + "index : ");
            arr[i] = s.nextInt();
        }

        int ans = singleNonDuplicate(arr);
        System.out.println("Single Element in array is : " + ans);
    }

    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n/2;

        while(start < end){
            int mid = start + (end - start)/2;
            
            if(nums[2*mid] != nums[2*mid + 1]) {
                end = mid;
            }

            else start = mid + 1;
            
        }
        return nums[2*start];
    }
}