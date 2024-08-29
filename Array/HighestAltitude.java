import java.util.Scanner;

public class HighestAltitude {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Array " + i + "st element :");
            arr[i] = s.nextInt();
        }

        int ans = highest(arr);
        System.out.println(ans);
    }

    public static int highest(int[] arr){
        int max = 0;
        int curr = 0;
        for(int i = 0 ; i < arr.length ; i++){
           curr = curr + arr[i];
           if(curr > max){
            max = curr;
           }
        }
        return max;
    }
}
