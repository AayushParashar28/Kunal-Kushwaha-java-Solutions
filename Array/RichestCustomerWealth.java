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
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                arr[i][j] = s.nextInt();
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        //Richestcustomer(arr);
    }

    // public static int Richestcustomer(int[][] nums){
    //     return 
    // }
}
