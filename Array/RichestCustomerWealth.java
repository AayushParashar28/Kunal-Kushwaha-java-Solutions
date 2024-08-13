import java.util.Arrays;
import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int n = s.nextInt();

        System.out.print("Enter Column : ");
        int m = s.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the array:");
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m; j++){
                arr[i][j] = s.nextInt();
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        int ans  = Richestcustomer(arr);
        System.out.println("The Richest Customer is : " +  ans);
    }

    public static int Richestcustomer(int[][] accounts){
        int res = 0 ;
        for(int i = 0 ; i < accounts.length ; i++ ){
            int temp = 0 ;
            for(int j = 0 ; j < accounts[i].length ; j++){
                temp += accounts[i][j];
            }
            res = Math.max(res,temp);
        }
        return res; 
    }
}
