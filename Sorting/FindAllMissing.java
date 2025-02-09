import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindAllMissing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array Size: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the elements of the array: ");
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        
        List<Integer> ans = new ArrayList<>();
        ans = findDisappearedNumbers(arr);
        System.out.println(ans);

    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] isAvailable = new boolean[nums.length];

        for(int i = 0; i < nums.length ; i++){
            isAvailable[nums[i] - 1] = true;
        }

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums.length ; i++){
            if(!isAvailable[i]){
                ans.add(i+1);
            }
        }

        return ans;

        
    }
}