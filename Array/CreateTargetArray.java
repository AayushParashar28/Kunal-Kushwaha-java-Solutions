import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CreateTargetArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Array " + i + "st element :");
            arr[i] = s.nextInt();
        }

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Index " + i + "st element :");
            arr1[i] = s.nextInt();
        }

        int[] ans = TargetArray(arr , arr1);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] TargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i  < nums.length ; i++){
            list.add(index[i],nums[i]);
        }
        int[] target = new int[index.length];
        for(int i = 0; i < nums.length ; i++){
            target[i] = list.get(i);
        }

        return target;
    }
}
