import java.util.Arrays;
import java.util.Scanner;

public class CheckifArrrayisSorted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int  n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + "elements of the array : ");
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        boolean ans = check(arr);
        System.out.println(ans);
    }

    public static boolean check(int[] arr) {
        int count=0;
      for(int i=1;i<arr.length;i++){
          if(arr[i]<arr[i-1]){
              count++;
          }
          
          
          
      }
      if(arr[arr.length-1]>arr[0]){
          count++;
      }
      return count<=1;
  }
}
