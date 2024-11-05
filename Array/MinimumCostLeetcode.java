import java.util.Arrays;
import java.util.Scanner;

public class MinimumCostLeetcode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array length : ");
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Array " + i + "st element :");
            arr[i] = s.nextInt();
        }

        int ans = minCostToMoveChips(arr);
        System.err.println(ans);
    }

    public static int minCostToMoveChips(int[] position) {
        int even=0, odd = 0;
        for(int i : position){
            if(i%2==0){
                even++;
            }else{
                odd++;
            }
        }
        if(even == position.length || odd == position.length){
            return 0;
        }
        return Math.min(even,odd);
    }
}

