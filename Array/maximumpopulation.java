import java.util.Arrays;
import java.util.Scanner;

public class maximumpopulation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter ARRAY ROW: ");
        int n = s.nextInt();
        System.out.print("Enter Array Column: ");
        int m = s.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("Enter " + i + "th element of Array: ");
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("Original Array:");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        int ans = maximumPopulation(arr);
        System.out.println(ans);
    }

    public static int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for(int[] log : logs) {
            int birth = log[0];
            int death = log[1];
            arr[birth-1950]++;
            arr[death-1950]--;
        }

        int max = arr[0];
        int year = 1950;
        for(int i = 1 ; i < 101; i++) {
            arr[i] += arr[i-1];
            if(arr[i] > max) {
                max = arr[i];
                year = 1950 + i;
            }
        }
        return year;
    }
}
