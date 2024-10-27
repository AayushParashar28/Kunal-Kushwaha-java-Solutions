import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateFromSortedArrays {
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

        int ans = removeDuplicates(arr);
        System.out.println("New Array :" +  ans);
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int j = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] != nums[j] ){
                j++;
                nums[j] = nums[i];     
            }
        }
        return j + 1;
    }

}