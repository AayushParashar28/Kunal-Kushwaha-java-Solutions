import java.util.Arrays;
import java.util.Scanner;

public class findNuniqueInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.err.print("Enter  the number of unique integers you want to find: ");
        int n =  s.nextInt();
        
        int[] ans = sumZero(n);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        if(n % 2 == 0){
            for(int i = 1 ; i < n ; i =i+2){
                arr[i - 1] = i;
                arr[i] = -i;
            }
        }
        else{
            for(int i = 0 ; i < n - 1 ; i =i+2){
                arr[i] = i + 1;
                arr[i+1] = -(i+1);
            }
            arr[n-1] = 0;
        }
        return arr;
    }
}
