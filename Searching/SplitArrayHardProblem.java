import java.util.Scanner;

public class SplitArrayHardProblem {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Array Elements at index " + i + " : ");
            arr[i] = s.nextInt();
        }
        System.out.print("Enter Maximum Piece Size : ");
        int piece = s.nextInt();

        int ans = splitArray(arr , piece);
        System.out.println("Minimum Element in Array is : " + ans);
    }


    public static int splitArray(int[] nums, int k) {
        int start = 0; 
        int end = 0;

        for(int i = 0; i < nums.length ; i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }


        while(start<end){

            int mid = start + (end - start)/2;
            
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if (sum + num > mid){
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }
            if(pieces > k){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return end;
    }
}
