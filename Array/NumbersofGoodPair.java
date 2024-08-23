import java.util.Arrays;
import java.util.Scanner;

public class NumbersofGoodPair {
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
        int arr1 = GoodPair(arr);
        System.out.println(arr1);
    }

    public static int GoodPair(int[] nums){
        int res = 0;
        int[] countArray =  new int[101];
        for(int num : nums){
            countArray[num]++ ;
        }

        for(int count : countArray ){
           count = (count *(count-1)) / 2;
           res += count;
        }
        return res;
    }
}
