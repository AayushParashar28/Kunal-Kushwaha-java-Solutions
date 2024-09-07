import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AddtoArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Array " + i + "st element :");
            arr[i] = s.nextInt();
        }
        System.out.print("Enter k number : ");
        int k = s.nextInt();
        List<Integer> ans = new ArrayList<>();
        ans = addToArrayForm(arr , k);
        System.out.println(ans);

    }
     public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans=new ArrayList<>();
        int n = num.length;
        int carry = k;

        for(int i = n -1 ; i>=0 ; i--){
            int sum = num[i] + carry ;
            ans.add(sum%10);
            carry = sum / 10;
        }

        while(carry > 0){
            ans.add(carry%10);
            carry /= 10;
        }

        Collections.reverse(ans);

        return ans;
    }
}
